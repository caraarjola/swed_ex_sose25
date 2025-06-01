public class HtmlComparisonStrategy implements ComparisonStrategy {
    //nach html vergleichen
    @Override
    public boolean compare(Website w1, Website w2) {
        return w1.getWebsiteUrl().equals(w2.getWebsiteUrl());
    }
}