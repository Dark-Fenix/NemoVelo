
package Tools;

import Config.ConfigGlobale;
import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
*
* @author Fenix
*/
public class JGoogleMapEditorPan extends JEditorPane {

    private int zoomFactor = 15;
    private String ApiKey = ConfigGlobale.ApiKey;
    private String roadmap = "roadmap";
    public final String viewTerrain = "terrain";
    public final String viewSatellite = "satellite";
    public final String viewHybrid = "hybrid";
    public final String viewRoadmap = "roadmap";

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

}
