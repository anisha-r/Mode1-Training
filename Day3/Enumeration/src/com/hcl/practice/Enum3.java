package com.hcl.practice;

enum Student {
	Anisha,Laksh,Rishab,Keerthana,Niveditha
}

enum Test {
	Insert,Update,Delete,
	}

public class Enum3 {
	
	public static void show() {
		Student[] arrStudent=Student.values();
		for (Student student : arrStudent) {
			System.out.println(student);
			
		}
	} public static void main(String[] args) {
		show();
	}

}
