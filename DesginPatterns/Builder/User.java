package DesginPatterns.Builder;

/**
 * Builder Pattern is a creational design pattern that lets you construct complex objects step by step.
 * 
 * Why we need Builder Pattern?
 * 
 * 1. When we have a complex object with multiple attributes, and we want to create an object of that class.
 * 
 * 2. When we have a class with multiple attributes, and we want to create multiple objects of that class with different attributes.
 * 
 * 3. Constructor explosion problem: When we have multiple constructors with different attributes, and we want to create an object of that class.
 * 
 * 4. Immutable class: When we have an immutable class, and we want to create an object of that class with multiple attributes.
 */

public class User {
  private final int id;
  private final String name;
  private final String phoneNumber;
  private final int age;

  public User(Builder builder){
    this.id = builder.id;
    this.name = builder.name;
    this.phoneNumber = builder.phoneNumber;
    this.age = builder.age;
  }

  @Override
  public String toString(){
    return "User [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
  }

  // Having an intermediate inner static class to build the User Object.

  public static class Builder {
    private int id;
    private String name;
    private String phoneNumber;
    private int age;

    public Builder setId(int id){
      this.id = id;
      return this;
    }

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
      return this;
    } 

    public Builder setAge(int age){
      this.age = age;
      return this;
    }

    public User build(){
      return new User(this);
    }
  }
}
