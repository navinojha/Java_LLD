package SOLID.LSP.Example.ProblematicCode;

public abstract class Employee {
  protected final int employeeId;
  protected final String employeeName;

  protected Employee(int employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }

  protected abstract double calculateSalary();
}
