package SOLID.OCP.Example.ImprovedCode;

public class NotificationSender {
  public void sendNotification(NotificationType notificationType, String message){
    notificationType.sendNotification(message);
  }
}
