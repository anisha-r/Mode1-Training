package com.hcl.ems;

import java.util.Date;

public class LeaveHistory {
	private int leaId;
	private Date leaStartDate;
	private Date leaEndDate;
	private int leaNoOfDays;
	private String leaReason;
	private LeaveType leaType;
	private LeaveStatus leaStatus; 
	private Date leaAppliedOn;
	private String leaMgrComments;
	private int empId;
	public int getLeaId() {
		return leaId;
	}
	public void setLeaId(int leaId) {
		this.leaId = leaId;
	}
	public Date getLeaStartDate() {
		return leaStartDate;
	}
	public void setLeaStartDate(Date leaStartDate) {
		this.leaStartDate = leaStartDate;
	}
	public Date getLeaEndDate() {
		return leaEndDate;
	}
	public void setLeaEndDate(Date leaEndDate) {
		this.leaEndDate = leaEndDate;
	}
	public int getLeaNoOfDays() {
		return leaNoOfDays;
	}
	public void setLeaNoOfDays(int leaNoOfDays) {
		this.leaNoOfDays = leaNoOfDays;
	}
	public String getLeaReason() {
		return leaReason;
	}
	public void setLeaReason(String leaReason) {
		this.leaReason = leaReason;
	}
	public LeaveType getLeaType() {
		return leaType;
	}
	public void setLeaType(LeaveType leaType) {
		this.leaType = leaType;
	}
	public LeaveStatus getLeaStatus() {
		return leaStatus;
	}
	public void setLeaStatus(LeaveStatus leaStatus) {
		this.leaStatus = leaStatus;
	}
	public Date getLeaAppliedOn() {
		return leaAppliedOn;
	}
	public void setLeaAppliedOn(Date leaAppliedOn) {
		this.leaAppliedOn = leaAppliedOn;
	}
	public String getLeaMgrComments() {
		return leaMgrComments;
	}
	public void setLeaMgrComments(String leaMgrComments) {
		this.leaMgrComments = leaMgrComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
}
