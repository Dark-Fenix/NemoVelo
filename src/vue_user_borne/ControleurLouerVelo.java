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

/**
*
* @author Aurélie
*/
public class ControleurLouerVelo {

    public ControleurStation allView;
    public LouerVelo fntrLV;
    public int client;
    
    public ControleurLouerVelo(ControleurStation aThis) {
        allView = aThis;
        fntrLV = new LouerVelo(this);
    }
    
    
    public void launchView(){
        fntrLV.setEnabled(true);
        fntrLV.setVisible(true);
        fntrLV.Louer();
    }
    
    public void hideView(){
        fntrLV.setEnabled(false);
        fntrLV.setVisible(false);
    }

    public void RendrePerformed() {
        allView.getRendre().launchView();
        hideView();
    }

    public void AccueilPerformed() {
        allView.getHome().launchView();
        hideView();
    }

    /***
     * 
     * @param idCarte String qui est uniquement numérique controlé au préalable
     * @return booléen qui indique si le client existe ou pas
     */
    public boolean idCarteExist(String idCarte) {
        Integer idC = new Integer(idCarte);
        //si la base de donnée nous retourne rien (null donc) cela sera faux
        return (DAO.CarteDAO.getCarteById(idC) != null);
    }
    
    /***
     * 
     * 
     */
    public boolean locationVelo( Utilisateur user) {
        boolean veloFound = false;
        //deduire les bornes 
        //on recupere toute les bornes
        //ArrayList<Borne> listeCompleteBornes = new ArrayList<Borne>();
        //listeCompleteBornes = DAO.BorneDAO.getAllBorne();
 
        //on choisit parmi toute les bornes celles qui nous appartiennent à la station et qui sont viables
        ArrayList<Borne> listeBorneStation = new ArrayList<Borne>();
       
        Iterator<Borne> itr = ConfigGlobale.bornes.iterator();
        while (itr.hasNext()) {
          Borne borne = itr.next();
          //on recupère chaque borne ayant comme clé étrangere l'id que notre station
          if(borne.getFk_id_station() == ConfigGlobale.IDSTATIONTEST && borne.getEtat().equals("ok")){
              listeBorneStation.add(borne);
          }
        }
        
        //on recupere les velos
//        ArrayList<Velo> listeCompleteVelo = new ArrayList<Velo>();
//        listeCompleteVelo  = DAO.VeloDAO.getAllVelo();
        
        //deduire les velos de la station
        Velo veloValide = new Velo(); 
        Iterator<Borne> itrBorne = listeBorneStation.iterator();
        //pour chaque borne valide de notre station on regarde si on a vélo dessus 
        while (itrBorne.hasNext() && !veloFound) {
          Borne borne = itrBorne.next();
         
          //maintenant on verifie si il y a un velo dessus si oui est t'il en etat ou non
          Iterator<Velo> itrVelo = ConfigGlobale.velos.iterator();
          while(itrVelo.hasNext() && !veloFound){
              Velo velo = itrVelo.next();
              if(velo.getFk_id_borne() == borne.getFk_id_station() && velo.getEtat().equals("ok") && velo.getFk_id_borne()!=99) {
                  //on a donc trouver notre velo
                  veloValide = velo;
                  veloFound = true;
              }
          }
        }
        //Si on a trouver un vélo
        if(veloFound){
            //on reserve le velo en l'associant às un utilisateur
            //Utilisateur client = DAO.UtilisateurDAO.getUtilisateurById(idClient);
            showConfirmMessage("Vous pouvez récuperer le vélo : " + veloValide.getId_velo() + " sur la borne : " + veloValide.getFk_id_borne());
            
            veloValide.setFk_id_borne(-1);
            DAO.Mapper.modifierVelo(veloValide);
            user.setFk_id_velo(veloValide.getId_velo());
            DAO.Mapper.modifierUtilisateur(user);
            
            
//            //on met à jour les infos de nos 2 objets utilisateur et vélo
//            client.setFk_id_velo(veloValide.getId_velo());
//            int idborne = 0;
//            veloValide.setFk_id_borne(idborne);
//            //on commit tout sa a la base de données
//            DAO.Mapper.modifierVelo(veloValide);
            
            
        } else {
            //TODO
            //station la plus proches
        }
        
        
        return veloFound;
        }
    
        public void showConfirmMessage(String message){
            fntrLV.messageInfo(message);
        }
 
    }
