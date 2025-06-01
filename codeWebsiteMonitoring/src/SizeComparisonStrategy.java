public class SizeComparisonStrategy implements ComparisonStrategy {
    //vergleicht nach content grösse
    @Override
    public boolean compare(Website w1, Website w2) {
        return w1.getWebsiteUrl().length() == w2.getWebsiteUrl().length();
    }
}