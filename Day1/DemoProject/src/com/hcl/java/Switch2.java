package com.hcl.java;

public class Switch2 {
	public void check(String opt) {
		switch(opt.toUpperCase()) {
		case "INSERT":
			System.out.println("Insert operation");
			break;
		case "UPDATE":
			System.out.println("Update operation");
			break;
		case "DELETE":
			System.out.println("Delete operation");
			break;

		}
	}
	public static void main(String[] args) {
		String op="InSeRT";
		new Switch2().check(op);
	}

}
