package com.hcl.as;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {
  /**
   * method to reading the object of the file.
   * @param args for reading the object.
   */
  public static void main(String[] args) {
    FileInputStream fin;
    try {
      fin = new FileInputStream("c:/files/student.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Student s = (Student)objin.readObject();
      objin.close();
      System.out.println(s);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
