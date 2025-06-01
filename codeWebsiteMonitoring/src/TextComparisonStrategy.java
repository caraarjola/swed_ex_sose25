public class TextComparisonStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(Website w1, Website w2) {
        // In echt würdest du hier extrahierten Text vergleichen
        return w1.getWebsiteUrl().toLowerCase().contains("text") &&
               w2.getWebsiteUrl().toLowerCase().contains("text");
    }
}