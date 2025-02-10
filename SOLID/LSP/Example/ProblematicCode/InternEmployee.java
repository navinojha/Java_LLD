package SOLID.LSP.Example.ProblematicCode;

public class InternEmployee extends Employee {

  protected InternEmployee(int employeeId, String employeeName){
    super(employeeId, employeeName);
  }

  @Override
  protected double calculateSalary() {
    System.out.println("Calculating Intern employee salary");
    return 0;
  }
}

