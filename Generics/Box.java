package Generics;

public class Box<T> {

  private T value;

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }


  public <E> void printArray(E[] array){
    for(E element : array){
      System.out.print(element+" ");
    }
    System.out.println();
  }

  // We can also do method overloading with generics like this:

  // public void printArray(Integer[] array){ // Overloaded method
  //   for(Integer element : array){
  //     System.out.print(element);
  //   }
  // }

  
}
