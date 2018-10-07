package p02_services;

public class OnlineStoreOrder {

  private NotificationService[] services;

  public OnlineStoreOrder(NotificationService... services) {
    this.services = services;
  }

  public void process() {
    for (NotificationService service : services) {
      if (service.isActive()) {
        service.sendNotification();
      }
    }
  }
}