package com.hcl.obj;


public class SbEx {
	
	public StringBuilder show(int age,String name,String course,String city) {
		
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(age<=20) {
			sbError.append("Age must be greater than 20" + "\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')== -1) {
			sbError.append("Name contains both First name and last name" +"\r\n");
			isValid=false;
		}
		if(!course.equalsIgnoreCase("JAVA")) {
			sbError.append("Only java course is allowed" + "\r\n");
			isValid=false;
		}
		
		if(isValid==true) {
	     sbError.append("age " +age + "\r\n");
		 sbError.append("name " +name +"\r\n");
	     sbError.append("course " +course +"\r\n");
		 sbError.append("city " +city +"\r\n");
	  }
		return sbError;
	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=12;
		name="Anisha";
		course="Python";
		city="Delhi";
		StringBuilder sbRes=
		new SbEx().show(age, name, course, city);
		System.out.println(sbRes);
		
		
	}



		
	}

