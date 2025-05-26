public class Main {
    public static void main(String[] args) {
        User firstuser= new User("arjola",1000,"arjola.cara@web.de","01345434");
        Website web1= new Website(1, "spotify.com");
        Subscriptions  sub1= new Subscriptions(1000, firstuser,web1,Frequency.daily,CommunicationChannel.email);
        firstuser.registerSubscription(sub1);
        System.out.println(web1.getWebsiteUrl());
    }
}