package SOLID.LSP.Example.ProblematicCode;

public class PartTimeEmployee extends Employee {

  protected PartTimeEmployee(int employeeId, String employeeName) {
    super(employeeId, employeeName);
  }

  @Override
  protected double calculateSalary() {
    System.out.println("Calculating Part time employee salary");
    return 0;
  }

}
