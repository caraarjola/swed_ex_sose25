public class Main {
   public static void main(String[] args) {
        User user = new User("Ichika", 1, "ichika@example.com", "123456");
        Observer observer = new NotificationService();

        user.registerObserver(observer);

        Website website = new Website(1, "https://spotify.com");
        Subscription sub = new Subscription(1000, user, website, Frequency.daily, CommunicationChannel.email);

        user.addSubscription(sub);  //automatisch benachrichtig
    }
}