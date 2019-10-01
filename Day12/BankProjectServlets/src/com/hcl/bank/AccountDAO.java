package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	PreparedStatement pst;
	Connection con;
	
	public String withdrawAmountDao(int accountNo,int withdrawAmount) {
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts!=null) {
			int amount=objAccounts.getAmount();
			String status =objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result="Account Closed...";
			} else {
			if(amount-withdrawAmount >=1000) {
				String cmd="update accounts set amount=amount-? "
						+" where AccountNo=?";
				try {
					pst=con.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd = "insert into trans(AccountNo,Transamount,"
							+"Transtype) values(?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.setString(3, "D");
					pst.executeUpdate();
					result = "amount debited";
					
							
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				result="Insufficient fund";
			}
			}
			
		}else {
			result="Account not found";
		}
		
		return result;
	}
	
	public String depositAccountDao(int accountNo,int depAmount) {
		con=DaoConnection.getConnection();
		String result=" ";
		String cmd="update accounts set amount=amount+? "
				+" where AccountNo=?";
		Accounts objAccounts =searchAccountDao(accountNo);
		if(objAccounts==null) {
			result = "Account No not found";
		} else {
			String status=objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result="Account Closed...";
			} else {

		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd= "Insert into trans(AccountNo,TransAmount, "
					+" Transtype) values(?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.setString(3, "C");
			pst.executeUpdate();
			result = "amount credited...";
		} catch (SQLException e) {
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		}
		return result;
		
	}
	public String closeAccountDao(int accountNo) {
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccount=searchAccountDao(accountNo);
		if(objAccount==null) {
			result = "Account No not found";
		} else {
			
		
		String cmd = "Update accounts set status='inactive' "
		             + " where AccountNo=?";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result = "Account Closed...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		return result;
	}
	public String updateAccountDao(int accountNo,
			            String city,String state) {
		con=DaoConnection.getConnection();
		Accounts objAccounts = searchAccountDao(accountNo);
		String cmd = "Update Accounts set City=?, State=? "
				+ " where AccountNo=?";
		String result=" ";
		if(objAccounts==null) {
			result = "Account No not found";
		} else {
			String status = objAccounts.getStatus();
			if(status.equals("inactive")) {
				result="Account Closed Already";
			} else {
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result = "Account updated...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		}
		return result;
	}
	
	public Accounts searchAccountDao(int accountNo) {
		con=DaoConnection.getConnection();
		String cmd = "select * from Accounts where accountNo=?";
		Accounts objAccounts=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				objAccounts=new Accounts();
				objAccounts.setFirstName(rs.getString("firstName"));
				objAccounts.setLastName(rs.getString("lastName"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("State"));
				objAccounts.setAmount(rs.getInt("Amount"));
				objAccounts.setCheqfacil(rs.getString("CheqFacil"));
				objAccounts.setAccountType(rs.getString("accountType"));
				objAccounts.setStatus(rs.getString("status"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
	}

	public String createAccountDao(Accounts objAccounts) {
		con=DaoConnection.getConnection();
		String cmd = "insert into Accounts(AccountNo,firstname," 
		+"lastname,city,state,amount,cheqFacil,"
		+"AccountType)values(?,?,?,?,?,?,?,?)";
		String result=" ";
		try {
			pst=con.prepareStatement(cmd);
		    pst.setInt(1, objAccounts.getAccountNo());
		    pst.setString(2, objAccounts.getFirstName());
		    pst.setString(3, objAccounts.getLastName());
		    pst.setString(4, objAccounts.getCity());
		    pst.setString(5, objAccounts.getState());
		    pst.setInt(6, objAccounts.getAmount());
		    pst.setString(7, objAccounts.getCheqfacil());
		    pst.setString(8, objAccounts.getAccountType());
		    pst.executeUpdate();
		    result ="account created successfully...";
			
		} catch (SQLException e) {
	       e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	public int generateAccountNoDao() {
		
	con=DaoConnection.getConnection();
	int accno=0;
	String cmd="select case when max(accountNo) is null " 
	           +" then 1 else max(accountNo)+1 end accno " 
	           +" from accounts";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs =pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accno;
		
		
	}

}
