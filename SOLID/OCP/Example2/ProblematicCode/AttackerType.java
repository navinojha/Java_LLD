package SOLID.OCP.Example2.ProblematicCode;

public enum AttackerType {
  BATMAN,
  SPIDERMAN,
  SUPERMAN,
  IRONMAN;

  public static void attackWithBatman(){
    System.out.println("Batman is attacking");
  }

  public static void attackWithSpiderman(){
    System.out.println("Spiderman is attacking");
  } 

  public static void attackWithSuperman(){
    System.out.println("Superman is attacking");
  }

  public static void attackWithIronman() {
    System.out.println("Ironman is attacking");
  }
}

