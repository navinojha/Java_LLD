package SOLID.OCP.Example2.BetterCode;

public class BatmanAttacker implements AttackerType {
  @Override
  public void attack() {
    System.out.println("Batman is attacking");
  }
}
