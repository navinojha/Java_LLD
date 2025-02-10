package SOLID.OCP.Example1.ImprovedCode;

public class NotificationSender {
  public void sendNotification(NotificationType notificationType, String message){
    notificationType.sendNotification(message);
  }
}
