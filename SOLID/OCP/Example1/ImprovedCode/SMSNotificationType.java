package SOLID.OCP.Example1.ImprovedCode;

public class SMSNotificationType implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("SMS " + message);
  }
}
