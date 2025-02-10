package SOLID.OCP.Example1.ImprovedCode;

public  class EmailNotification implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("Email " + message);
  }
  
}
