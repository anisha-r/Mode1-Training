package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="feedback")

public class FbResult {
	
	private int count;
	private String fbValue;
	@Id
	@Column (name="count")

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Column (name="fbvalue")

	public String getFbValue() {
		return fbValue;
	}
	public void setFbValue(String fbValue) {
		this.fbValue = fbValue;
	}

	
	
	

}
