package com.hcl.as;

import java.io.Serializable;

public class Employ implements Serializable {
  /**
   * Method for business logic.
   */
  int empno;
  String name;
  transient double basic;
  /**
   * Method for employee details.
   * @param empno of employee. 
   * @param name of employee.
   * @param basic of employee.
   */
  
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  
  @Override
public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }



}
