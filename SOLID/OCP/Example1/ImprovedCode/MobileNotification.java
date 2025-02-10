package SOLID.OCP.Example1.ImprovedCode;

public class MobileNotification implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("Mobile " + message);
  }
  
}
