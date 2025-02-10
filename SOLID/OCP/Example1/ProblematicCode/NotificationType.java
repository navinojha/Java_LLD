package SOLID.OCP.Example1.ProblematicCode;

public enum NotificationType {
  SMS,
  EMAIL,
  PUSH,
  MOBILE;

  public void sendSMSNotification(String message){
    System.out.println("SMS " + message);
  }

  public void sendEMAILNotification(String message){
    System.out.println("SMS " + message);
  }

  public void sendPUSHNotification(String message){
    System.out.println("SMS " + message);
  }

  public void sendMOBILENotification(String message){
    System.out.println("SMS " + message);
  }

}