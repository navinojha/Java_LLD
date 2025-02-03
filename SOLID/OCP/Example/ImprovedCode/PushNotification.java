package SOLID.OCP.Example.ImprovedCode;

public class PushNotification implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("Push " + message);
  }
  
}
