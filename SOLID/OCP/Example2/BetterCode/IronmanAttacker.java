package SOLID.OCP.Example2.BetterCode;

public class IronmanAttacker implements AttackerType {
  @Override
  public void attack() {
    System.out.println("Ironman is attacking");
  }
}
