package com.hcl.java;

public class SbEx {
	
	public void show(int age,String name,String course,String city) {
		
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
		System.out.println("age " +age);
		System.out.println("name " +name);
		System.out.println("course " +course);
		System.out.println("city " +city);
	}else {
		System.out.println(sbError);
	}
}	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=12;
		name="Anisha";
		course="Python";
		city="Delhi";
		new SbEx().show(age, name, course, city);
		
		
	}

}
