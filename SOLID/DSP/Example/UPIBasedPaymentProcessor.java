package SOLID.DSP.Example;

public class UPIBasedPaymentProcessor implements PaymentProcessor {
  @Override
  public void processPayments(){
    System.out.println("Processing payment using UPI...");
  }
}
