package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
  /**
   * Method to write files.
   * @param args to write the files.
   */
  public static void main(String[] args) {
    File src;
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("C:/hcljava/Day4/Exception/src/com/hcl/ex/Custom.java");
    tar = new File("c:/files/Custom.java");
    try {
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) {
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
      System.out.println("file copied");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
