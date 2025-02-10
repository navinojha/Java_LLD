package SOLID.OCP.Example2.ProblematicCode;

import java.util.List;

/*
 * This class violates the open-closed principle because if we want to add a new attacker type, we have to modify the existing code.
 * 
 * To fix this issue, we can create an interface for the AttackerType and implement the interface in each attacker type class. Then we can pass the AttackerType interface as a parameter to the attack method.
 */

public class Attacker {
  public void attack(List<AttackerType> attackerType){
    for(AttackerType attacker : attackerType){
      switch(attacker){
        case BATMAN:
          AttackerType.attackWithBatman();
          break;
        case SPIDERMAN:
          AttackerType.attackWithSpiderman();
          break;
        case SUPERMAN:
          AttackerType.attackWithSuperman();
          break;
        case IRONMAN:
          AttackerType.attackWithIronman();
          break;
        default:
          System.out.println("No attacker found");
      }
    }   
  }
  
}
