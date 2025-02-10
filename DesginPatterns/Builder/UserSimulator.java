package DesginPatterns.Builder;

public class UserSimulator {
  public static void main(String[] args) {

    User user = new User.Builder().setId(1).setPhoneNumber("123456789").build();
    System.out.println(user);
  }
}
