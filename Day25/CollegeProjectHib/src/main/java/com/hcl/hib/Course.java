package com.hcl.hib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CourseList")

public class Course {
	
	private String courseNo;
	private int duration;
	private Date startDate;
	private Date endDate;
	private String Hod;
	
	@Id
	@Column (name="courseNo")
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	
	@Column (name="duration")
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Column (name="startDate")

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column (name="endDate")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column (name="Hod")
	public String getHod() {
		return Hod;
	}
	public void setHod(String hod) {
		Hod = hod;
	}
	
	

}
