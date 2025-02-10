package SOLID.OCP.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

  public static void sendNotifications(List<NotificationType> notificationTypes, String message) {
    for (NotificationType notificationType : notificationTypes){
      switch (notificationType) {
        case SMS:
          notificationType.sendSMSNotification(message);
          break;

        case EMAIL:
          notificationType.sendEMAILNotification(message);
          break;

        case PUSH:
          notificationType.sendPUSHNotification(message);
          break;

        case MOBILE:
          notificationType.sendMOBILENotification(message);
          break;
      
        default:
          System.out.println("Whatsapp " + message);
      }
    }
  }
  
}
