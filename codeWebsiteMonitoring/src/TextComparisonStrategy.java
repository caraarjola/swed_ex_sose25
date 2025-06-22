import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class TextComparisonStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(Website w1, Website w2) {
        try {
            String text1 = extractVisibleText(w1.getWebsiteUrl());
            String text2 = extractVisibleText(w2.getWebsiteUrl());

            // System.out.println("Seite 1: " + text1);
            // System.out.println("Seite 2: " + text2);

            return text1.equalsIgnoreCase(text2);
        } catch (Exception e) {
            System.err.println("Fehler beim Extrahieren des sichtbaren Textes: " + e.getMessage());
            return false;
        }
    }

    private String extractVisibleText(String urlString) throws Exception {
        URI uri = URI.create(urlString);
        URL url = uri.toURL();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(url.openStream()));

        StringBuilder html = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            html.append(line.trim());
        }
        in.close();

        // Entferne alle Tags wie <div>, <p>, <a>, etc.
        String rawText = html.toString().replaceAll("<[^>]*>", "");

        return rawText.trim().toLowerCase();
    }
}