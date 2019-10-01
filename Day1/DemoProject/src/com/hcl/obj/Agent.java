package com.hcl.obj;

public class Agent {
	
	public StringBuilder show(String agentId,String fullname,int maritalStatus,String zipcode) {
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		
		if(fullname.indexOf(' ')== -1) {
			sbError.append("Name contains both First name and last name " +"\r\n");
			isValid=false;
		}	
	     if(fullname.length()>20) {
	    	 sbError.append(" length of the character is 20" +"\r\n");
				isValid=false;
	     }
	    	 
		 if(agentId.charAt(0)!='A') {
			sbError.append("name starts with A" +"\r\n");
			isValid=false;
		}
		if(maritalStatus !=0 && maritalStatus !=1) {
			sbError.append("maital status should be 0 or 1" +"\r\n");
			isValid=false;
		}
		if(zipcode.length()>6) {
			sbError.append("zipcode must be 6" + "\r\n");
			isValid=false;
		}
		if(isValid==true) {
		     sbError.append("fullname " +fullname + "\r\n");
			 sbError.append("agentid " +agentId +"\r\n");
		     sbError.append("maritalstatus " +maritalStatus +"\r\n");
			 sbError.append("zipcode " +zipcode +"\r\n");
		  }
			return sbError;
		}
	
	public static void main(String[] args) {
		int maritalStatus;
		String fullname;
		String zipcode;
		String agentId;
		agentId = "Anu";
		fullname="Anisha Ravi";
		zipcode="Python";
		maritalStatus=0;
		StringBuilder sbRes=
		         new Agent().show(agentId, fullname, maritalStatus, zipcode);
		System.out.println(sbRes);
		
	}

}
