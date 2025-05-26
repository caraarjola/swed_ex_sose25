import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Integer userId;
    private String email;
    private String numberPhone;
    private List<Subscriptions> subscriptionsList;

    public User(String name, Integer userId, String email, String numberPhone) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.numberPhone = numberPhone;
        this.subscriptionsList = new ArrayList<>();
    }
    public void registerSubscription(Subscriptions subscription){
        subscriptionsList.add(subscription);
    }
    public void removeSubscription(Subscriptions subscription){
        subscriptionsList.remove(subscription);
    }
    public List<Subscriptions> getSubscriptionsList(){
        return subscriptionsList;
    }



}