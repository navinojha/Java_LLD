package SOLID.OCP.Example.ImprovedCode;

public class Main {
  public static void main(String[] args) {
    NotificationSender notificationSender = new NotificationSender();
    notificationSender.sendNotification(new EmailNotification(), "Hello World through Email");
    notificationSender.sendNotification(new SMSNotificationType(), "Hello World");
  }

  /**
   * This is the improved code. We have implemented the NotificationType interface and created four classes EmailNotification, SMSNotificationType, PushNotificationType and MobileNotificationType that implement the NotificationType interface.
   * 
   * We have also created a NotificationSender class that has a sendNotification method that takes a NotificationType object and a message as arguments. This method calls the sendNotification method of the NotificationType object.
   * 
   * This class is open for extension and closed for modification. If we want to add a new type of notification, we can create a new class that implements the NotificationType interface and pass an object of that class to the sendNotification method of the NotificationSender class.
   * 
   * Here we are just delaying the creation of objects so we can improve the code further by using the Factory design pattern.
   */
}
