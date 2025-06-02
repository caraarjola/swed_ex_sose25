public class Main {
   public static void main(String[] args) {
        // User user = new User("Ichika", 1, "ichika@example.com", "123456");
        // Observer observer = new NotificationService();

        // user.registerObserver(observer);

        // Website website = new Website(1, "https://spotify.com");
        // Subscription sub = new Subscription(1000, user, website, Frequency.daily, CommunicationChannel.email);

        // user.addSubscription(sub);  //automatisch benachrichtig

        Website w1 = new Website(1, "http://stackoverflow.com");
        Website w2 = new Website(2, "http://google.com");

        WebsiteComparer comparer = new WebsiteComparer(new HtmlComparisonStrategy());

        boolean result = comparer.compare(w1, w2);
        System.out.println("Vergleichsergebnis: " + result);

        WebsiteComparer comparer2 = new WebsiteComparer(new SizeComparisonStrategy());

        boolean result2 = comparer2.compare(w1, w2);
        System.out.println("Sind die HTML-Größen identisch? " + result2);


        WebsiteComparer comparer3 = new WebsiteComparer(new TextComparisonStrategy());
        boolean textResult = comparer3.compare(w1, w2);
        System.out.println("Sichtbarer Text gleich? " + textResult);
        
    }
}