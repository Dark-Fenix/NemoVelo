
package vue_user_borne;

import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class JGoogleMapEditorPan extends JEditorPane {

    private int zoomFactor = 15;
    private String ApiKey = "";
    private String roadmap = "roadmap";
    public final String viewTerrain = "terrain";
    public final String viewSatellite = "satellite";
    public final String viewHybrid = "hybrid";
    public final String viewRoadmap = "roadmap";
    //private ArrayList<MStation> stations = new ArrayList<MStation>();

    public JGoogleMapEditorPan() {
        HTMLEditorKit kit = new HTMLEditorKit();
        HTMLDocument htmlDoc = (HTMLDocument) kit.createDefaultDocument();
        this.setEditable(false);
        this.setContentType("text/html");
        this.setEditorKit(kit);
        this.setDocument(htmlDoc);
    }

    public void setZoom(int zoom) {
        this.zoomFactor = zoom;
    }

    public void setApiKey(String key) {
        this.ApiKey = key;
    }

    public void setRoadmap(String roadMap) {
        this.roadmap = roadMap;
    }

    public void showCoordinate(String latitude, String longitude, int width, int height) throws Exception {
        this.setMap(latitude, longitude, width, height);
    }

    public void showLocation(String city, String country, int width, int height) throws Exception {
        this.setMap(city, country, width, height);
    }

    private void setMap(String x, String y, Integer width, Integer height) throws Exception {
        if (this.ApiKey.isEmpty()) {
            throw new Exception("Developper API Key not set !!!!");
        }
        String url = "http://maps.google.com/maps/api/staticmap?";
        url += "center=" + x + "," + y;
        url += "&amp;zoom=" + this.zoomFactor;
        url += "&amp;size=" + width+ "x" + height;
        url += "&amp;maptype=" + this.roadmap;
        url += "&amp;markers=color:blue" + x + "," + y;
        url += "&amp;sensor=true";
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

    /*public static void main(String[] args) {
        JGoogleMapEditorPan googleMap = new JGoogleMapEditorPan();
        try {
            //googleMap.showLocation("Lyon", "france", 390, 400);
            googleMap.showCoordinate("45.740724", "4.85561610000002", 390, 400);
        } catch (Exception ex) {
            Logger.getLogger(JGoogleMapEditorPan.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(googleMap,BorderLayout.CENTER);
        frame.setSize(400, 420);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }*/
}
