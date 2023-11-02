package Observer;

public class Store {
    private final NotificationService notificationService;
    public Store() {
        notificationService = new NotificationService();
    }
    public void newItemPromotion() {
        notificationService.notifyCustomers();
    }
    public NotificationService getService() {
        return notificationService;
    }
}
