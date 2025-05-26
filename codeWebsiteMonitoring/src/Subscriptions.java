public class Subscriptions {
    private Integer subId;
    private User user;
    private Website website;
    private Frequency frequency;
    private CommunicationChannel communicationChannel;
    private Website websiteUrl;

    public Subscriptions(int subId, User user, Website website, Frequency frequency, CommunicationChannel communicationChannel) {
        this.subId = subId;
        this.user = user;
        this.website = website;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
    }
    public void updatePreferences(Frequency frequency, CommunicationChannel communicationChannel) {
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
    }
    public Website getWebsite() {
        return websiteUrl;
    }
}
