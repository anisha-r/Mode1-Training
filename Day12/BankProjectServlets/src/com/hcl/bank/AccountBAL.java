package com.hcl.bank;

public class AccountBAL {
	public static String  withdrawAmountBal(int accountNo,int withdrawAmount) {
		return new AccountDAO().withdrawAmountDao(accountNo,withdrawAmount);
	}
	public static String depositAccountBal(int accountNo,int depAmount) {
		return new AccountDAO().depositAccountDao(accountNo,depAmount);
	}
	public static String closeAccountBal(int accountNo) {
		return new AccountDAO().closeAccountDao(accountNo);
	}
	
	public static String updateAccountBal(int accountNo,
            String city,String state) {
		return new AccountDAO().updateAccountDao(accountNo,city,state);
		
	}
	
	public static Accounts searchAccountBal(int accountNo) {
		return new AccountDAO().searchAccountDao(accountNo);
	}
	public static String createAccountBal(Accounts objAccounts) {
		return new AccountDAO().createAccountDao(objAccounts);
	}
	public static int generateAccountBal() {
		return new AccountDAO().generateAccountNoDao();
	}

}
