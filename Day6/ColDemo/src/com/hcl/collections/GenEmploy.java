package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
  /**
   * method used for business logic.
   * @param args for array list.
   */
  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1, "divya", 67333));
    lstEmploy.add(new Employ(2, "anisha giri", 67343));
    lstEmploy.add(new Employ(3, "janani", 67353));
    lstEmploy.add(new Employ(4, "priya", 67336));
    lstEmploy.add(new Employ(5, "hema siva", 67337));
    lstEmploy.add(new Employ(6, "dharshini", 68333));
    System.out.println("employ list");
    lstEmploy.forEach(System.out::println);
  }

}
