import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;



public class HtmlComparisonStrategy implements ComparisonStrategy {
    //nach html vergleichen
   @Override
    public boolean compare(Website w1, Website w2) {
        try {
            String html1 = getHtml(w1.getWebsiteUrl());
            String html2 = getHtml(w2.getWebsiteUrl());
            //Compare
            return html1.equals(html2);
        } catch (Exception e) {
            System.err.println("Fehler beim Laden des HTML-Inhalts: " + e.getMessage());
            return false;
        }
    }

    private String getHtml(String urlString) throws Exception {
        URI uri = URI.create(urlString);
        URL url = uri.toURL();
        BufferedReader in = new BufferedReader(    //macht das Einlesen effizienter, zeilenweise Lesen
            new InputStreamReader(url.openStream())); //wandelt die Bytes in Text um

        StringBuilder html = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            html.append(line.trim()); // Whitespace entfernen
        }
        in.close();
        return html.toString();
    }
}