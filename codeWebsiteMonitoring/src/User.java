import java.util.ArrayList;
import java.util.List;

public class User implements Subject {
     private String name;
    private int userId;
    private String email;
    private String numberPhone;
    private List<Subscription> subscriptions;
    private List<Observer> observers;

    public User(String name, int userId, String email, String numberPhone) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.numberPhone = numberPhone;
        this.subscriptions = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
        notifyObservers(subscription);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Subscription subscription) {
        for (Observer o : observers) {
            o.update(this, subscription);
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
}