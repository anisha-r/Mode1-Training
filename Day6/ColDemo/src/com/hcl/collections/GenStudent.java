package com.hcl.collections; 

import java.util.ArrayList;

import java.util.List;

public class GenStudent {
  /**
   * method for business logic.
   * @param args for array list.
   */
  public static void main(String[] args) {
    List<Student> lstStudent = new ArrayList<Student>();
    lstStudent.add(new Student("anu","giri","cbe", 9));
    lstStudent.add(new Student("anu","giri","cbe", 9));
    lstStudent.add(new Student("anu","giri","cbe", 9));
    lstStudent.forEach(System.out::println);
  }

}

