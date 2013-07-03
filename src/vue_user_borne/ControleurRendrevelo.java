/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import Config.ConfigGlobale;
import classes.Borne;
import classes.Station;
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

//    boolean idCarteExist(String idCarte) {
//        Integer idC = new Integer(idCarte);
//        //si la base de donnée nous retourne rien (null donc) cela sera faux
//        return (DAO.CarteDAO.getCarteById(idC) != null);
//    }

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
        //int idVelo = client.getFk_id_velo();
        boolean borneFound = false;
        //on recupere toute les bornes de notre station
        //ArrayList<Borne> listeCompleteBornes = new ArrayList<Borne>();
        //listeCompleteBornes = DAO.BorneDAO.getAllBorne();
        
        ArrayList<Borne> listeBorneStation = new ArrayList<Borne>();
       
        Iterator<Borne> itr = ConfigGlobale.bornes.iterator();
        while (itr.hasNext()) {
          Borne borne = itr.next();
          //on recupere chaque borne ayant comme clé étrangere l'id de notre station
          if(borne.getFk_id_station() == ConfigGlobale.IDSTATIONTEST && borne.getEtat().equals("ok")){
              listeBorneStation.add(borne);
          }
        }
        
        //on recupere tout les velo
//        ArrayList<Velo> listeCompleteVelo = new ArrayList<Velo>();
//        listeCompleteVelo  = DAO.VeloDAO.getAllVelo();
        
        //on cherche quel borne n'est pas lier a un velo
        //pour chaque borne valide de notre station on regarde laquel n'a des vélo dessus 
//        Borne borneLibre = new Borne();
//        Iterator<Borne> itrBorne = listeBorneStation.iterator();
//        while (itrBorne.hasNext() && !borneFound) {
//          Borne borne = itrBorne.next();
//          //maintenant on verifie si il y a un velo dessus si oui est t'il en etat ou non
//          Iterator<Velo> itrVelo = ConfigGlobale.velos.iterator();
//          while(itrVelo.hasNext() && !borneFound){
//              Velo velotemp = itrVelo.next();
//              if() {
//                  borneLibre = borne;
//                  borneFound = true;
//              }
//          }
//        }
        
        for (Borne bornetemp : listeBorneStation){
            for (Velo velotemp : ConfigGlobale.velos){
                if (velotemp.getFk_id_borne()==bornetemp.getId_borne()){
                    listeBorneStation.remove(bornetemp);
                }
            }
        }
        
        
        if(!listeBorneStation.isEmpty()){
            //mise a jour des champs de la base de données
            //on reserve le velo en l'associant a un utilisateur
           
            showConfirmMessage("Vous pouvez rendre le vélo : " + velo.getId_velo() + " sur la borne : " + listeBorneStation.get(1).getId_borne());
            
            velo.setFk_id_borne(listeBorneStation.get(1).getId_borne());
            DAO.Mapper.modifierVelo(velo);
            user.setFk_id_velo(-1);
            DAO.Mapper.modifierUtilisateur(user);
            
//            //on met à jour les infos de nos 2 objets utilisateur et vélo
//            Velo velo = DAO.VeloDAO.getVeloById(idVelo);
//            velo.setFk_id_borne(borneLibre.getId_borne());
//            client.setFk_id_velo(99);
//            
//            //on commit tout sa a la base de donnée
//            DAO.VeloDAO.updateVelo(velo);
//            DAO.UtilisateurDAO.updateUtilisateur(client);
        } else {
           //TODO station la plus proche
        }
}
    }
    
     public void showConfirmMessage(String message){
            fntrRV.messageInfo(message);
     }
}
