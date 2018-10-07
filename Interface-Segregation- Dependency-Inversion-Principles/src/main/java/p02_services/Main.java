package p02_services;

public class Main {
  public static void main(String[] args) {

    NotificationService sms = new SmsNotificationService(false);
    NotificationService email = new EmailNotificationService(true);

    OnlineStoreOrder order = new OnlineStoreOrder(sms, email);

    order.process();
  }
}
