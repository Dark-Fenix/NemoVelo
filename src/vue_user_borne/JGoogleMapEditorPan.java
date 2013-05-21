/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 * Afficher une carte GoogleMap dans un JEditorPane
 * @author fobec 2010
 */
public class JGoogleMapEditorPan extends JEditorPane {

    private int zoomFactor = 7;
    private String ApiKey = "";
    private String roadmap = "roadmap";
    public final String viewTerrain = "terrain";
    public final String viewSatellite = "satellite";
    public final String viewHybrid = "hybrid";
    public final String viewRoadmap = "roadmap";
    //private ArrayList<MStation> stations = new ArrayList<MStation>();

    /**
     * Constructeur: initialisation du EditorKit
     */
    public JGoogleMapEditorPan() {
        HTMLEditorKit kit = new HTMLEditorKit();
        HTMLDocument htmlDoc = (HTMLDocument) kit.createDefaultDocument();
        this.setEditable(false);
        this.setContentType("text/html");
        this.setEditorKit(kit);
        this.setDocument(htmlDoc);
    }

    /**
     * Fixer le zoom
     * @param zoom valeur de 0 à 21
     */
    public void setZoom(int zoom) {
        this.zoomFactor = zoom;
    }

    /**
     * Fixer la clé de developpeur
     * @param key APIKey fourni par Google
     */
    public void setApiKey(String key) {
        this.ApiKey = key;
    }

    /**
     * Fixer le type de vue
     * @param roadMap
     */
    public void setRoadmap(String roadMap) {
        this.roadmap = roadMap;
    }

    /**
     * Afficher la carte d'après des coordonnées GPS
     * @param latitude
     * @param longitude
     * @param width
     * @param height
     * @throws Exception erreur si la APIKey est non renseignée
     */
    public void showCoordinate(String latitude, String longitude, int width, int height) throws Exception {
        this.setMap(latitude, longitude, width, height);
    }

    /**
     * Afficher la carte d'après une ville et son pays
     * @param city
     * @param country
     * @param width
     * @param height
     * @throws Exception erreur si la APIKey est non renseignée
     */
    public void showLocation(String city, String country, int width, int height) throws Exception {
        this.setMap(city, country, width, height);
    }

    /**
     * Assembler l'url et Générer le code HTML
     * @param x
     * @param y
     * @param width
     * @param height
     * @throws Exception
     */
    private void setMap(String x, String y, Integer width, Integer height) throws Exception {
        if (this.ApiKey.isEmpty()) {
            throw new Exception("Developper API Key not set !!!!");
        }

        String url = "http://maps.google.com/maps/api/staticmap?";
        url += "center=" + x + "," + y;
        url += "&amp;zoom=" + this.zoomFactor;
        url += "&amp;size=" + width.toString() + "x" + height.toString();
        url += "&amp;maptype=" + this.roadmap;
        url += "&amp;markers=color:blue" + x + "," + y;
        url += "&amp;sensor=false";
        url += "&amp;key=" + this.ApiKey;

        String html = "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>";
        html += "<html><head></head><body>";
        html += "<img src='" + url + "'>";
        html += "</body></html>";
        this.setText(html);
    }

    /*public void showStations(Integer width, Integer height){
        String url = "http://maps.google.com/maps/api/staticmap?";
        url += "center=Nimes";
        url += "&amp;zoom=" + this.zoomFactor;
        url += "&amp;size=" + width.toString() + "x" + height.toString();
        url += "&amp;maptype=" + this.roadmap;

        this.stations=MStation.getStations();
        for(int i=0; i<this.stations.size();i++){
            url += "&markers=color:";
            if(stations.get(i).getEtatStation()== MStation.PLEINE){
                url+="blue";
            }else if(stations.get(i).getEtatStation()== MStation.VIDE){
                url+="red";
            }else{
                url+="green";
            }
            url+="|"+stations.get(i).getLatitude() + ","+stations.get(i).getLongitude();
        }
        url+="&sensor=true";
        String html = "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>";
        html += "<html><head></head><body>";
        html += "<img src='" + url + "'>";
        html += "</body></html>";
        this.setText(html);
    }*/
    
    /**
     * Exemple : JGoogleMapEditorPan dans un JFrame
     */
    public static void main(String[] args) {
        JGoogleMapEditorPan googleMap = new JGoogleMapEditorPan();
        try {
            //googleMap.setApiKey("maCleGoogleMap");
            //  googleMap.setRoadmap(googleMap.viewHybrid);

            /**
            Afficher la ville de Strabourg
             */
            googleMap.showLocation("Saint-Alexandre", "france", 30, 30);
            /**
             * Afficher Paris en fonction ses coordonnées GPS
             */
            //  googleMap.showCoordinate("48.8667", "2.3333",390, 400);
        } catch (Exception ex) {
            Logger.getLogger(JGoogleMapEditorPan.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(googleMap);
        frame.setSize(400, 420);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
}