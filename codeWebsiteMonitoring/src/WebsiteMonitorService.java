import java.util.List;

public class WebsiteMonitorService {
    private WebsiteComparer comparer;
    private NotificationService notificationService;

    public WebsiteMonitorService(ComparisonStrategy strategy) {
        this.comparer = new WebsiteComparer(strategy);
        this.notificationService = new NotificationService();
    }

    public void checkSubscriptions(List<Subscription> subscriptions) {
        for (Subscription sub : subscriptions) {
            Website w1 = sub.getWebsite(); // Aktuelle Website
            Website snapshot = new Website(-1, w1.getWebsiteUrl()); // Dummy-Kopie mit gleichem URL

            // Prüfen ob update vorliegt (hier müsste man alte Kopie halten – Demo vereinfacht)
            boolean changed = !comparer.compare(w1, snapshot);

            if (changed) {
                String msg = "Website hat sich geändert: " + w1.getWebsiteUrl();
                notificationService.sendNotification(sub, msg);
            }
        }
    }
}

