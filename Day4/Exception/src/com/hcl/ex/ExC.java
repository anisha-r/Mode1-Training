package com.hcl.ex;

public class ExC { 
  /**
   * Method for business logic.
   */
  public void checkEmail(String email) throws InvalidEmailException,InvalidUserNameException {
    boolean flag = true;
    if (email.indexOf("@") == -1) {
      flag = false;
      throw new InvalidEmailException("Invalid email..");
    }
    if (email.indexOf("@") > 12) {
      flag = false;
      throw
        new InvalidUserNameException("Invalid user..");
    }
    if (flag == true) {
      System.out.println("email" + email);
    }
  }
  /**
   * Method for business logic.  
   * @param args to print email.
   */
  
  public static void main(String[] args) {
    String email = "anisha@gmail.com";
    try {
      new ExC().checkEmail(email);
    } catch (InvalidEmailException | InvalidUserNameException e) {
      e.printStackTrace();
    }
  }

}
