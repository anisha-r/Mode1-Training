package com.hcl.as;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  /**
   * method for business logic.
   * @param args for file input stream.
   */
  public static void main(String[] args) {
    try {
      DataInputStream din = new DataInputStream(new FileInputStream("c:/files/data.txt"));
      int x = din.readInt();
      x++;
      System.out.println("x value " + x);
      String name = din.readUTF();
      System.out.println("Name " + name);
      double bas = din.readDouble();
      System.out.println("double " + bas);
      boolean flag = din.readBoolean();
      System.out.println("double " + flag);
      din.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
