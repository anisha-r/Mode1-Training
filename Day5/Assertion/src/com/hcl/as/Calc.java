package com.hcl.as; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
  /**
   * method for read the file.
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    System.out.println("enter 2 nos");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      c = a + b;
      System.out.println("sum is " + c);
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
    }
  }

}
