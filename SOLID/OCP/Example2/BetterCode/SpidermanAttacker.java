package SOLID.OCP.Example2.BetterCode;

public class SpidermanAttacker implements AttackerType {
  @Override
  public void attack() {
    System.out.println("Spiderman is attacking");
  }
}
