package SOLID.DSP.Example;

public class PurchaseFlowManager {

  private NotificationsSender notificationsSender; // This is a dependency
  private PaymentProcessor paymentProcessor; // This is a dependency

  public PurchaseFlowManager(NotificationsSender notificationsSender, PaymentProcessor paymentProcessor) {
    this.notificationsSender = notificationsSender;
    this.paymentProcessor = paymentProcessor;
  }

  public void triggerPurchaseFlow(){
    System.out.println("Triggering purchase flow");
    paymentProcessor.processPayments();
    notificationsSender.sendNotifications();
  }
  
}
