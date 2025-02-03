package SOLID.OCP.Example.ImprovedCode;

public  class EmailNotification implements NotificationType {

  @Override
  public void sendNotification(String message){
    System.out.println("Email " + message);
  }
  
}
