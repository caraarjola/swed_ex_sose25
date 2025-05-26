public class Website {
    private int websiteId;
    private String websiteUrl;

    public Website(int websiteId, String websiteUrl) {
        this.websiteId = websiteId;
        this.websiteUrl = websiteUrl;
    }
    public boolean checkupdates(){
        System.out.println("check updates" + websiteUrl);
        return true;
    }
    public String getWebsiteUrl() {
        return websiteUrl;
    }
}
