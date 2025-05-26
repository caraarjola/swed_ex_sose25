public class Subscription {
   private int id;
    private User user;
    private Website website;
    private Frequency frequency;
    private CommunicationChannel communicationChannel;

    public Subscription(int id, User user, Website website,Frequency frequency, CommunicationChannel communicationChannel) {
        this.id = id;
        this.user = user;
        this.website = website;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
    }

    //Getter
    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Website getWebsite() {
        return website;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public CommunicationChannel getCommunicationChannel() {
        return communicationChannel;
    }

    @Override
    public String toString() {
        return "Subscription to " + website.getWebsiteUrl()
               + " [" + frequency + ", via " + communicationChannel + "]";
    }
}
