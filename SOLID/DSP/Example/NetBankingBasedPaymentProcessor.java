package SOLID.DSP.Example;

public class NetBankingBasedPaymentProcessor implements PaymentProcessor {
  @Override
  public void processPayments(){
    System.out.println("Processing payments using NetBanking");
  }
  
}
