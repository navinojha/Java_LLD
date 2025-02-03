package SOLID.OCP.Example.ImprovedCode;

public class MobileNotification implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("Mobile " + message);
  }
  
}
