package SOLID.DSP.Example;

public class SMSBasedNotifications implements NotificationsSender {
  @Override
  public void sendNotifications(){
    System.out.println("Sending SMS notifications");
  }
}
