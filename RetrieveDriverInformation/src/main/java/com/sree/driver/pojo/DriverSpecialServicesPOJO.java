package com.sree.driver.pojo;

import java.util.Date;

public class DriverSpecialServicesPOJO {
	private String specialServiceId;
	private Date startDate;
	private Date endDate;
	private String specialServiceName;
	public String getSpecialServiceName() {
		return specialServiceName;
	}
	public void setSpecialServiceName(String specialServiceName) {
		this.specialServiceName = specialServiceName;
	}
	private int specialServiceSeq;
	public String getSpecialServiceId() {
		return specialServiceId;
	}
	public void setSpecialServiceId(String specialServiceId) {
		this.specialServiceId = specialServiceId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getSpecialServiceSeq() {
		return specialServiceSeq;
	}
	public void setSpecialServiceSeq(int specialServiceSeq) {
		this.specialServiceSeq = specialServiceSeq;
	}
}
