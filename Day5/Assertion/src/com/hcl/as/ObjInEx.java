package com.hcl.as;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjInEx {
  /**
   * Method for business logic.
   * @param args for date.
   */
  public static void main(String[] args) {
    FileInputStream fin;
    try {
      fin = new FileInputStream("c:/files/objout.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      String s = (String)objin.readObject();
      Date d = (Date)objin.readObject();
      System.out.println(s + d);
      objin.close();
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
