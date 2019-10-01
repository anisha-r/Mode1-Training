package com.hcl.bank;

public class DepositAccount {
	private int depAmount ;
	private int accountNo;
	public int getDepAmount() {
		return depAmount;
	}
	public void setDepAmount(int depAmount) {
		this.depAmount = depAmount;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
public String depositAccount() {
        
		return AccountBAL.depositAccountBal(depAmount, accountNo);
	}
	
}
