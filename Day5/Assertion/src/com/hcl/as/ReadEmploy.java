package com.hcl.as;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {
  /**
   * Method for reading the file.
   */
  public static void main(String[] args) {
    FileInputStream fin;
    try {
      fin = new FileInputStream("c:/files/employ.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Employ e = (Employ)objin.readObject();
      objin.close();
      System.out.println(e);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
