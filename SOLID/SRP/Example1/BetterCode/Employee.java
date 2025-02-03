package SOLID.SRP.Example1.BetterCode;

public class Employee {

  // This class follows Single Responsibility principle 

  // Seggregated the class to follow thier single responsibility 
  
  private final int id;
  private final String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId(){
    return this.id;
  }

  public String getName() {
    return this.name;
  }
}
