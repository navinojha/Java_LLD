package SOLID.LSP.Example.ProblematicCode;

import java.util.List;
import java.util.ArrayList;

public class SalaryDisburserSimulator {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new InternEmployee(1, "John"));
    employees.add(new VoluntaryEmployee(2, "Jane"));
    employees.add(new FullTimeEmployee(3, "Doe"));
    employees.add(new PartTimeEmployee(4, "Smith"));
    SalaryDisburser salaryDisburser = new SalaryDisburser();
    salaryDisburser.disburseSalary(employees);
  }
  
}
