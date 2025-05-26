public class NotificationService implements Observer {
    @Override
    public void update(User user, Subscription subscription) {
        Notification notification = new Notification(
            "New subscription registered!",
            42,//random
            java.time.LocalDateTime.now().toString()
        );

        notification.sendMessage(user, subscription.getCommunicationChannel());
    }
}
