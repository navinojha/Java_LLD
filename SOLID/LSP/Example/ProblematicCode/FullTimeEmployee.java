package SOLID.LSP.Example.ProblematicCode;

public class FullTimeEmployee extends Employee {
  
  protected FullTimeEmployee(int employeeId, String employeeName) {
    super(employeeId, employeeName);
  }

  @Override
  protected double calculateSalary() {
    System.out.println("Calculating Full time employee salary");
    return 0;
  }
  
}
