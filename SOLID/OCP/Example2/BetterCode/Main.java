package SOLID.OCP.Example2.BetterCode;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Attacker attacker = new Attacker();
    List<AttackerType> attackers = new ArrayList<>();
    attackers.add(new BatmanAttacker());
    attackers.add(new IronmanAttacker());
    attackers.add(new SupermanAttacker());
    attackers.add(new SpidermanAttacker());
    attacker.attack(attackers);
  }
  
}
