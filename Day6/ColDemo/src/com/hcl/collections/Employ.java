package com.hcl.collections;

public class Employ {
  int empno;
  String name;
  double basic;
  
  @Override
public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  /**
   * method of business logic.
   * @param empno for employ.
   * @param name for employ.
   * @param basic for employ.
   */
  
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
}
