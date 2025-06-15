public class NotificationService implements Observer {

    public void sendNotification(Subscription subscription, String message) {
        Notification notification = new Notification(
            message,
            null,
            java.time.LocalDateTime.now().toString()
        );
        notification.sendMessage(subscription.getUser(), subscription.getCommunicationChannel());
    }
    
    public void update(User user, Subscription subscription) {
        Notification notification = new Notification(
            "New subscription registered!",
            42,//random
            java.time.LocalDateTime.now().toString()
        );

        notification.sendMessage(user, subscription.getCommunicationChannel());
    }
}
