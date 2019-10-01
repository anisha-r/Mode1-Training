package com.hcl.collections;

import java.util.ArrayList;

import java.util.List;

public class GenListInt {
  /**
   * method for business logic.
   * @param args for adding the arguments.
   */
  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(42));
    lstData.add(new Integer(12));
    lstData.add(new Integer(32));
    lstData.add(new Integer(56));
    lstData.add(new Integer(27));
    int sum = 0;
    for (Integer i : lstData) {
      sum += i;
    }
    System.out.println("sum is " + sum);
  }

}
