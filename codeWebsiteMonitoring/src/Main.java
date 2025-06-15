public class Main {
   public static void main(String[] args) {
        // User user = new User("Ichika", 1, "ichika@example.com", "123456");
        // Observer observer = new NotificationService();

        // user.registerObserver(observer);

        // Website website = new Website(1, "https://spotify.com");
        // Subscription sub = new Subscription(1000, user, website, Frequency.daily, CommunicationChannel.email);

        // user.addSubscription(sub);  //automatisch benachrichtig

        // Website w1 = new Website(1, "http://stackoverflow.com");
        // Website w2 = new Website(2, "http://stackoverflow.com");
        
        // // Website w1 = new Website(1, "http://google.com");
        // // Website w2 = new Website(2, "http://stackoverflow.com");
        // WebsiteComparer comparer = new WebsiteComparer(new HtmlComparisonStrategy());

        // boolean result = comparer.compare(w1, w2);
        // System.out.println("Vergleichsergebnis: " + result);

        // WebsiteComparer comparer2 = new WebsiteComparer(new SizeComparisonStrategy());

        // boolean result2 = comparer2.compare(w1, w2);
        // System.out.println("Sind die HTML-Größen identisch? " + result2);


        // WebsiteComparer comparer3 = new WebsiteComparer(new TextComparisonStrategy());
        // boolean textResult = comparer3.compare(w1, w2);
        // System.out.println("Sichtbarer Text gleich? " + textResult);

 
        Website site = new Website(1, "https://google.com");
        User user = new User("dua", 42, "dua@example.com", "123456");

        Subscription s = new Subscription(1, user, site, Frequency.daily, CommunicationChannel.email);
        user.addSubscription(s);

        ComparisonStrategy strategy = new HtmlComparisonStrategy();
        ComparisonStrategy strategy2 = new SizeComparisonStrategy();
        ComparisonStrategy strategy3 = new TextComparisonStrategy();
        WebsiteMonitorService monitor = new WebsiteMonitorService(strategy);
        WebsiteMonitorService monitor2 = new WebsiteMonitorService(strategy2);
        WebsiteMonitorService monitor3 = new WebsiteMonitorService(strategy3);

        monitor.checkSubscriptions(user.getSubscriptions());
        monitor2.checkSubscriptions(user.getSubscriptions());
        monitor3.checkSubscriptions(user.getSubscriptions());

   }
 
}