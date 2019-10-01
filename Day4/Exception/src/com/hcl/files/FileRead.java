package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
  /** 
   * method used for business logic.
   * @param args for reading the files.
   */
  public static void main(String[] args) {
    try {
      File f1 = new File("C:/hcljava/Day4/Exception/src/com/hcl/ex/Custom.java");
      FileReader fr = new FileReader(f1);
      int ch;
      while ((ch = fr.read()) != -1) {
        System.out.print((char)ch);
      }
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}