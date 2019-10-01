package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
  /**
   * method for business logic.
   * @param args for adding numbers using lambda.
   */
  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(42));
    lstData.add(new Integer(12));
    lstData.add(new Integer(18));
    lstData.add(new Integer(19));
    lstData.add(new Integer(23));
    lstData.add(new Integer(12));
    int sum;
    lstData.forEach(p -> {
      if (p >= 15) { 
        System.out.println(p);
      }
    });
  }

}
