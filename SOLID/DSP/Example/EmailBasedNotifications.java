package SOLID.DSP.Example;

public class EmailBasedNotifications implements NotificationsSender {
  @Override
  public void sendNotifications(){
    System.out.println("Sending email notifications");
  }
}
