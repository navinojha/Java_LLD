package SOLID.SRP.Example1.BetterCode;

public class EmployeePerformanceReport {

  // This class follows SRP, only core responsibility of this class to print performance report.

  // This class has only one reason to change, let's say tomorrow we introduce one more parameter to consider for performance report only this class will change and no other changes will impact this class.

  public void printPerformanceReport(){
    System.out.println("Performance report printed");
  }
  
}
