package Generics;

// Generic class with type parameter T that extends Number class
public class MyNumber<T extends Number & Printable<Integer>> {

  private T number;

  public MyNumber(T number) {
    this.number = number;
  }

  public T getNumber() {
    return this.number;
  }

  public void setNumber(T number) {
    this.number = number;
  }

  public Double getDoubleValue() {
    return this.number.doubleValue();
  }

  public Float getFloatValue() {
    return this.number.floatValue();
  }

  public Integer getIntegerValue() {
    return this.number.intValue();
  }

  public void setIntegerValue(T number) {
    this.number = number;
  }

}
