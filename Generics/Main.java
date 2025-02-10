package Generics;

public class Main {
  public static void main(String[] args) {
    Box<Integer> box = new Box<>(10);
    int value = box.getValue();
    Integer[] numArray = {1, 2, 3, 4, 5};
    String[] strArray = {"Hello", "World", "Java"};
    box.printArray(numArray);
    box.printArray(strArray);
    System.out.println(value);


   // MyNumber<String> myNumber = new MyNumber<>("10"); // This will throw an error because String is not a subclass of Number
    PrintableInteger printableInteger = new PrintableInteger(20);
    MyNumber<PrintableInteger> myNumber = new MyNumber<>(printableInteger);
    myNumber.getNumber().print(10);
    System.out.println(myNumber.getDoubleValue());
    
  }
}