public class WebsiteComparer {
    private ComparisonStrategy strategy;

    public WebsiteComparer(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean compare(Website w1, Website w2) {
        return strategy.compare(w1, w2);
    }
}
