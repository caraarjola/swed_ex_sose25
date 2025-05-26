public class Notification {
    private String message;
    private Integer notId;
    private String timeStamp;

    public Notification(String message, Integer notId, String timeStamp) {
        this.message = message;
        this.notId = notId;
        this.timeStamp = timeStamp;
    }

    public void sendMessage(User user, CommunicationChannel communicationChannel) {
        System.out.println("sendMessage to " + user.getName() + " via " + communicationChannel);
        System.out.println("Message: " + message + " @ " + timeStamp);
    }
}
