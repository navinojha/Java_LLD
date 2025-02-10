package SOLID.LSP.Example.ProblematicCode;

public class VoluntaryEmployee extends Employee {

  protected VoluntaryEmployee(int employeeId, String employeeName){
    super(employeeId, employeeName);
  }

  @Override
  protected double calculateSalary(){
    throw new UnsupportedOperationException("Voluntary employee does not have salary");
  }
}
