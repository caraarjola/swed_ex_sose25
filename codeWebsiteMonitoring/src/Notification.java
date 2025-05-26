public class Notification {
    private String message;
    private Integer notId;
    private String timeStamp;

    public Notification(String message, Integer notId, String timeStamp) {
        this.message = message;
        this.notId = notId;
        this.timeStamp = timeStamp;
    }
    public void sendMessage(User user,CommunicationChannel communicationChannel) {
        System.out.println("sendMessage" + user +"via"+ communicationChannel);
    }
}
