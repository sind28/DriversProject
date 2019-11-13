package com.sree.driver.entity.idclasses;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class DriverSpecialServiceIdClass implements Serializable{
	private String special_service_name;
	private int driverid;
	private int special_service_seq;
	public DriverSpecialServiceIdClass() {
		
	}
	
	public DriverSpecialServiceIdClass(String special_service_name, int driverid, int special_service_seq) {
		super();
		this.special_service_name = special_service_name;
		this.driverid = driverid;
		this.special_service_seq = special_service_seq;
	}
	public String getspecial_service_name() {
		return special_service_name;
	}
	public void setspecial_service_name(String special_service_name) {
		this.special_service_name = special_service_name;
	}
	public int getdriverid() {
		return driverid;
	}
	public void setdriverid(int driverid) {
		this.driverid = driverid;
	}
	public int getspecial_service_seq() {
		return special_service_seq;
	}
	public void setspecial_service_seq(int special_service_seq) {
		this.special_service_seq = special_service_seq;
	}
}
