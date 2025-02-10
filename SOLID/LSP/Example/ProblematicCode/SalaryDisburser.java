package SOLID.LSP.Example.ProblematicCode;

import java.util.List;

public class SalaryDisburser {
  public void disburseSalary(List<Employee> employees) {
    for(Employee employee : employees){
      System.out.println("Disbursing salary for employee: " + employee.employeeName);
      if(employee instanceof VoluntaryEmployee){
        System.out.println("Voluntary employees do not get salary");
        continue;
      }
      double salary = employee.calculateSalary();
      System.out.println("Salary disbursed: " + salary);  
    }
  }
}
