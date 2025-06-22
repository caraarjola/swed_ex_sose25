import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class SizeComparisonStrategy implements ComparisonStrategy {
    //vergleicht nach content grösse
    @Override
    public boolean compare(Website w1, Website w2) {
        try {
            int size1 = getHtmlSize(w1.getWebsiteUrl());
            int size2 = getHtmlSize(w2.getWebsiteUrl());
            System.out.println("Größe Seite 1: " + size1 + " Zeichen");
            System.out.println("Größe Seite 2: " + size2 + " Zeichen");
            return size1 == size2;
        } catch (Exception e) {
            System.err.println("Fehler beim Laden der Inhalte: " + e.getMessage());
            return false;
        }
    }
    private int getHtmlSize(String urlString) throws Exception {
        URI uri = URI.create(urlString);
        URL url = uri.toURL();
        
        BufferedReader in = new BufferedReader(
            new InputStreamReader(url.openStream()));

        int totalLength = 0;
        String line;
        while ((line = in.readLine()) != null) {
            totalLength += line.length();
        }
        in.close();
        return totalLength;
    }
}