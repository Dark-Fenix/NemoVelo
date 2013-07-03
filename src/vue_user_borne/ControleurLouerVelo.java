/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import classes.Borne;
import classes.Utilisateur;
import classes.Velo;
import com.sun.org.apache.xpath.internal.FoundIndex;
import java.util.ArrayList;
import java.util.Iterator;

public class ControleurLouerVelo {

    public ControleurStation allView;
    public LouerVelo fntrLV;
    public int idClient;
    
    public ControleurLouerVelo(ControleurStation aThis) {
        allView = aThis;
        fntrLV = new LouerVelo(this);
    }
    
    
    public void launchView(){
        fntrLV.setEnabled(true);
        fntrLV.setVisible(true);
        fntrLV.simulationLecteurCarte();
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
    public boolean locationVelo() {
        boolean veloFound = false;
        //deduire les bornes 
        //on recupere toute les bornes
        ArrayList<Borne> listeCompleteBornes = new ArrayList<Borne>();
        listeCompleteBornes = DAO.BorneDAO.getAllBorne();
 
        //on choisie parmis toute les bornes celle qui nous appartienne à la station et qui sont viable
        ArrayList<Borne> listeBorneStation = new ArrayList<Borne>();
       
        Iterator<Borne> itr = listeCompleteBornes.iterator();
        while (itr.hasNext()) {
          Borne borne = itr.next();
          //on recupere chaque borne ayant comme clé étrangere l'id que notre station
          if(borne.getFk_id_station() == allView.IDBORNE && borne.getEtat().equals("ok")){
              listeBorneStation.add(borne);
          }
        }
        
        //on recupere les velos
        ArrayList<Velo> listeCompleteVelo = new ArrayList<Velo>();
        listeCompleteVelo  = DAO.VeloDAO.getAllVelo();
        
        //deduire les velos de la station
        Velo veloValide = new Velo(); 
        Iterator<Borne> itrBorne = listeBorneStation.iterator();
        //pour chaque borne valide de notre station on regarde si on a vélo dessus 
        while (itrBorne.hasNext() && !veloFound) {
          Borne borne = itrBorne.next();
         
          //maintenant on verifie si il y a un velo dessus si oui est t'il en etat ou non
          Iterator<Velo> itrVelo = listeCompleteVelo.iterator();
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
            Utilisateur client = DAO.UtilisateurDAO.getUtilisateurById(idClient);
            showConfirmMessage("Le client : " + idClient + " doit recuperé le vélo : " + veloValide.getId_velo() + " sur la borne :" + veloValide.getFk_id_borne());
            
            //on met à jour les infos de nos 2 objets utilisateur et vélo
            client.setFk_id_velo(veloValide.getId_velo());
            int idborne = 0;
            veloValide.setFk_id_borne(idborne);
            
            //on commit tout sa a la base de données
            DAO.VeloDAO.updateVelo(veloValide);
            DAO.UtilisateurDAO.updateUtilisateur(client);    
        } else {
            //station la plus proches
        }
        
        
        return veloFound;
        }
    
        public void showConfirmMessage(String message){
            fntrLV.messageInfo(message);
        }

        public void setIdClient(int id){
            idClient = id;
        } 
    }
