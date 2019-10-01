package com.hcl.boxing;

public class BoxStudent {

		
		public void show(Object ob) {
			Student e=(Student)ob;
			System.out.println(e);
		}
		
		public static void main(String[] args) {
			Student objStudent=new Student();
			objStudent.sno=1;
			objStudent.name="Nagindra";
			objStudent.city="Cbe";
			objStudent.cgp=9;
			
			new BoxStudent().show(objStudent);
			
		}

	}



