package com.hcl.boxing;

public class StudentSearch {
	
	public Student showStudent(int sno) {
		Student student=null;
		if(sno==1) {
			student=new Student();
			student.sno=100;
			student.name="Anubhav";
			student.city="cbe";
			student.cgp=9;		}
		if(sno==3) {
			student=new Student();
			student.sno=102;
			student.name="Prem Reddy";
			student.city="hyd";
			student.cgp=8;
		}
		if(sno==6) {
			student=new Student();
			student.sno=104;
			student.name="anisha";
			student.city="kerala";
			student.cgp=10;
		}
		return student;
	}
	public static void main(String[] args) {
		StudentSearch objSearch=new StudentSearch();
		Student res=objSearch.showStudent(6);
		if(res!=null) {
			System.out.println(res);
		} else {
			System.out.println("empno not found");
		}
		
	}


}
