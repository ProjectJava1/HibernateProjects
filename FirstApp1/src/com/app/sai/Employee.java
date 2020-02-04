package com.app.sai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Employee {
	@Id
	@Column(name="eid")
	private int eId;
	@Column(name="ename")
	private String eName;
	@Column(name="efee")
	private double eFee;
	@Column(name="course")
	private String course;
	public int getEId() {
		return eId;
	}
	public void setEId(int eId) {
		this.eId = eId;
	}
	public String getEName() {
		return eName;
	}
	public void setEName(String eName) {
		this.eName = eName;
	}
	public double getStdFee() {
		return eFee;
	}
	public void setEFee(double eFee) {
		this.eFee = eFee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [eId=" + eId + ", eName=" + eName + ", eFee=" + eFee + ", Course=" + course + "]";
	}
	
	}
