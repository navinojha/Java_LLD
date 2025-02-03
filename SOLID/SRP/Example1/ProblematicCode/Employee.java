package SOLID.SRP.Example1.ProblematicCode;

public class Employee {

  /* 
  This class has too many responsibilities

  1) print Performance report
  2) Compute the salary of the employee
  3) Update the employee details

  * We all know the Salary computation depends on the tax slab and let's say if the tax slab changes then this class also needs to change.

  * Let's say the performance report printing now depends on some other parameters as well so again this class needs to change.

  
  This violates the Single responsibility principle where the class should have one and only one reason to change.


  */

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

  public void printPerformanceReport() {
    System.out.println("Performance report printed");
  }

  public double computeSalary() {
    return 3000.0;
  }

  public void updateEmployee() {
    System.out.println("Employee details updated");
  }

}