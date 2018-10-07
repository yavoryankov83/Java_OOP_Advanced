package p02_services;

public class EmailNotificationService implements NotificationService {

  private boolean isActive;

  public EmailNotificationService(boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public void sendNotification() {
    System.out.println("new email");
  }

  @Override
  public boolean isActive() {
    return this.isActive;
  }
}
