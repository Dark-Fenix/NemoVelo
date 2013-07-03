/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import Config.ConfigGlobale;
import classes.Borne;
import classes.Utilisateur;
import classes.Velo;
import java.util.ArrayList;
import java.util.Iterator;

public class ControleurRendrevelo {

    public ControleurStation allView;
    public RendreVelo fntrRV;
    public int idClient;
    
    public ControleurRendrevelo(ControleurStation aThis) {
        allView = aThis;
        fntrRV = new RendreVelo(this);
    }
    
    public void launchView(){
        fntrRV.setEnabled(true);
        fntrRV.setVisible(true);
        fntrRV.Rendre();
    }
    
    public void hideView(){
        fntrRV.setEnabled(false);
        fntrRV.setVisible(false);
    }

    public void LouerPerformed() {
        allView.getLouer().launchView();
        hideView();
    }

    public void AccueilPerformed() {
        allView.getHome().launchView();
        hideView();
    }

    void setIdClient(Integer integer) {
        idClient = integer;
    }

    void RendreVelo(Utilisateur user) {
        
        Velo velo = null;
            for (Velo s : ConfigGlobale.velos) {
            if(s.getId_velo()==user.getFk_id_velo()){
                velo = s;
                break;
            }
            
        ArrayList<Borne> listeBorneStation = new ArrayList<Borne>();
        Iterator<Borne> itr = ConfigGlobale.bornes.iterator();
        while (itr.hasNext()) {
          Borne borne = itr.next();
          //on recupere chaque borne ayant comme clé étrangere l'id de notre station
          if(borne.getFk_id_station() == ConfigGlobale.IDSTATIONTEST && borne.getEtat().equals("ok")){
              listeBorneStation.add(borne);
          }
        }

        for (Borne bornetemp : listeBorneStation){
            for (Velo velotemp : ConfigGlobale.velos){
                if (velotemp.getFk_id_borne()==bornetemp.getId_borne()){
                    listeBorneStation.remove(bornetemp);
                }
            }
        }
        
        if(!listeBorneStation.isEmpty()){
            //mise a jour des champs de la base de données
            showConfirmMessage("Vous pouvez rendre le vélo : " + velo.getId_velo() + " sur la borne : " + listeBorneStation.get(1).getId_borne());
            velo.setFk_id_borne(listeBorneStation.get(1).getId_borne());
            DAO.Mapper.modifierVelo(velo);
            user.setFk_id_velo(-1);
            DAO.Mapper.modifierUtilisateur(user);
        } else {
           //TODO station la plus proche
        }
}
    }
    
     public void showConfirmMessage(String message){
            fntrRV.messageInfo(message);
     }
}
