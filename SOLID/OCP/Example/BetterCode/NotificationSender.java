package SOLID.OCP.Example.BetterCode;

public class NotificationSender {
  /**
   * 
   * @param notificationType
   * @param message
   */
  public void sendNotification(NotificationType notificationType, String message){
    switch (notificationType){
      case SMS:
        SMSNotfication smsNotificationType = new SMSNotfication();
        smsNotificationType.sendSMSNotification(message);
        break;
      case EMAIL:
        EmailNotification emailNotificationType = new EmailNotification();
        emailNotificationType.sendEmailNotification(message);
        break;
      case PUSH:
        PushNotification pushNotificationType = new PushNotification();
        pushNotificationType.sendPushNotification(message);
        break;
      case MOBILE:
        MobileNotification mobileNotificationType = new MobileNotification(); 
        mobileNotificationType.sendMobileNotification(message);
        break;
    }
  }

  /**
   * In the above code, we have created separate classes for each notification type and we have moved the sendNotification method to the NotificationSender class. (Here we are following the Single Responsibility Principle).
   * 
   * But If you carefully observe, the NotificationSender class is now still open for modification, violating the Open/Closed Principle. If we want to add a new notification type, we need to modify the NotificationSender class.
   * 
   * To fix this issue we can have an interface for the NotificationType and implement the interface in each notification type class. Then we can pass the NotificationType interface as a parameter to the sendNotification method.
   */
}
