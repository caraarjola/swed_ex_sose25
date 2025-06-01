public class Main {
   public static void main(String[] args) {
        // User user = new User("Ichika", 1, "ichika@example.com", "123456");
        // Observer observer = new NotificationService();

        // user.registerObserver(observer);

        // Website website = new Website(1, "https://spotify.com");
        // Subscription sub = new Subscription(1000, user, website, Frequency.daily, CommunicationChannel.email);

        // user.addSubscription(sub);  //automatisch benachrichtig

        Website w1 = new Website(1, "http://example.com/page1");
        Website w2 = new Website(2, "http://example.com/page2");

        WebsiteComparer comparer = new WebsiteComparer(new HtmlComparisonStrategy());

        //boolean result = comparer.compare(w1, w2);
        //System.out.println("Vergleichsergebnis: " + result);
        if (comparer.compare(w1, w2)) {
            System.out.println("Webseiten sind gleich!");
        } else {
            System.out.println("Webseiten unterscheiden sich!");
        }       
    }
}