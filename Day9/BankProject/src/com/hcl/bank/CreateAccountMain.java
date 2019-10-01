package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	
	public static void main(String[] args) {
		int accountno=AccountBAL.generateAccountBal();
//		System.out.println(accountno);
		Accounts objAccounts = new Accounts();
		objAccounts.setAccountNo(accountno);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		objAccounts.setFirstName(sc.nextLine());
		System.out.println("enter the last name");
		objAccounts.setLastName(sc.nextLine());
		System.out.println("enter the city ");
		objAccounts.setCity(sc.nextLine());
		System.out.println("enter the state ");
		objAccounts.setState(sc.nextLine());
		System.out.println("enter Amount");
		objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("enter cheqfacil");
		objAccounts.setCheqfacil(sc.nextLine());
		System.out.println("enter account type");
		objAccounts.setAccountType(sc.nextLine());
		System.out.println(AccountBAL.createAccountBal(objAccounts));
	
		
	}

}
