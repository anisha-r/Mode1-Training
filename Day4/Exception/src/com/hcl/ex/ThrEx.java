package com.hcl.ex;

public class ThrEx {
  /**
   * Method show for business logic.
   * @param x of integer type passing parameter.
   */
  public void show(int x) {
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("Negative numbers not allowed"); 
    } 
    if (x == 0) {
      flag = false;
      throw new ArithmeticException("Zero is invalid");
    } 
    if (flag == true) { 
      System.out.println("x value" + x);
    }
  }
  /**
   * Main method for calling business logic.
   * @param args for passing runtime values.
   */
  
  public static void main(String[] args) { 

    int n = 12;
    try {
      new ThrEx().show(n); 
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage()); 
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
