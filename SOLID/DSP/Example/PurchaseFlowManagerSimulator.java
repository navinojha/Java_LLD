package SOLID.DSP.Example;

public class PurchaseFlowManagerSimulator {
  public static void main(String[] args) {
    PurchaseFlowManager purchaseFlowManager = new PurchaseFlowManager(new EmailBasedNotifications(), new UPIBasedPaymentProcessor());
    purchaseFlowManager.triggerPurchaseFlow();
    System.out.println("************************");
    PurchaseFlowManager purchaseFlowManager2 = new PurchaseFlowManager(new SMSBasedNotifications(), new NetBankingBasedPaymentProcessor());
    purchaseFlowManager2.triggerPurchaseFlow();
  }
}