package com.sree.driver.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sree.driver.entity.idclasses.DriverSpecialServiceIdClass;

@Entity
@Table(name="driver_special_service")
public class DriverSpecialServiceEntity {
	
	@EmbeddedId
    private DriverSpecialServiceIdClass driverSpecialServiceIdClass;
	
//	private String special_service_name;
//	@Id
//	private int driverid;
//	private int special_service_seq;
//	public String getSpecial_service_name() {
//		return special_service_name;
//	}
//	public void setSpecial_service_name(String special_service_name) {
//		this.special_service_name = special_service_name;
//	}
//	public int getdriverid() {
//		return driverid;
//	}
//	public void setdriverid(int driverid) {
//		this.driverid = driverid;
//	}
//	public int getSpecial_service_seq() {
//		return special_service_seq;
//	}
//	public void setSpecial_service_seq(int special_service_seq) {
//		this.special_service_seq = special_service_seq;
//	}
	@JsonProperty("start_date")
	private Date startDate;

	public DriverSpecialServiceIdClass getDriverSpecialServiceIdClass() {
		return driverSpecialServiceIdClass;
	}
	public void setDriverSpecialServiceIdClass(DriverSpecialServiceIdClass driverSpecialServiceIdClass) {
		this.driverSpecialServiceIdClass = driverSpecialServiceIdClass;
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
	@JsonProperty("end_date")
	private Date endDate;
}
