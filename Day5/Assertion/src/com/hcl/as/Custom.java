package com.hcl.as;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {
  /**
   * Method for reading the file.
   * @param args for input stream.
   */
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter your name");
    try {
      String name = br.readLine();
      System.out.println("name" + name);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
