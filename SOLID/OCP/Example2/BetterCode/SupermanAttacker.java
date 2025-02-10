package SOLID.OCP.Example2.BetterCode;

public class SupermanAttacker implements AttackerType {
  @Override
  public void attack() {
    System.out.println("Superman is attacking");
  }
}
