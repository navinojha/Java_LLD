package SOLID.OCP.Example2.BetterCode;

import java.util.List;

public class Attacker {
  private AttackerType attackerType;
  
  public void attack(List<AttackerType> attackerType){
    for(AttackerType attacker : attackerType){
      attacker.attack();
    }
  }
  
}
