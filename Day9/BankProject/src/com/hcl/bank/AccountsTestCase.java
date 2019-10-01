package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Test;

public class AccountsTestCase {
	
	@Test
	public void testWithdrawAccount() {
		assertEquals("amount debited",  AccountBAL.withdrawAmountBal(3, 3000));
		assertEquals("Insufficient fund",  AccountBAL.withdrawAmountBal(3, 3000000));
		assertEquals("Account not found",  AccountBAL.withdrawAmountBal(-3, 3000000));
		assertEquals("Account Closed...",  AccountBAL.withdrawAmountBal(1, 300));
	}
	
	@Test
	public void testDepositAccount() {
		assertEquals("amount credited...",  AccountBAL.depositAccountBal(3, 3000));
		assertEquals("Account No not found",  AccountBAL.depositAccountBal(-3, 3000));
		assertEquals("Account Closed...",  AccountBAL.depositAccountBal(1, 3000));
	}
	
	@Test
	public void testCloseAccount() {
		assertEquals("Account Closed...", AccountBAL.closeAccountBal(4));
		assertEquals("Account No not found", AccountBAL.closeAccountBal(-4));
	}
	@Test
	public void testUpdateAccount() {
		assertEquals("Account updated...", AccountBAL.updateAccountBal(2, "chennai", "TN" ));
		assertEquals("Account No not found", AccountBAL.updateAccountBal(-2, "chennai", "TN"));
		assertEquals("Account Closed Already", AccountBAL.updateAccountBal(1, "chennai", "TN"));
	}
	
	@Test
	public void testSearchAccount() {
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
	}
	@Test
	public void testCreateAccount() {
		Accounts objAccounts = new Accounts();
		int accno = AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Bindhu");
        objAccounts.setLastName("sree");
        objAccounts.setCity("bangalore");
        objAccounts.setState("KA");
        objAccounts.setAmount(99222);
        objAccounts.setCheqfacil("Yes");
        objAccounts.setAccountType("savings");
        assertEquals("account created successfully...", AccountBAL.createAccountBal(objAccounts));
	}
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testGenerateAccountNo() {
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from Accounts";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
	}

	@Test
	public void testGettersAndSetters() {
		Accounts objAccounts = new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Sai");
		objAccounts.setLastName("Krishna");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("KA");
		objAccounts.setAmount(88222);
		objAccounts.setCheqfacil("Yes");
		objAccounts.setAccountType("Savings");
		objAccounts.setStatus("active");
		
		assertEquals(1, objAccounts.getAccountNo());
		assertEquals("Sai", objAccounts.getFirstName());
		assertEquals("Krishna", objAccounts.getLastName());
		assertEquals("Bangalore", objAccounts.getCity());
		assertEquals("KA", objAccounts.getState());
		assertEquals(88222, objAccounts.getAmount());
		assertEquals("Yes", objAccounts.getCheqfacil());
		assertEquals("Savings", objAccounts.getAccountType());
		assertEquals("active", objAccounts.getStatus());
		
	}

}
