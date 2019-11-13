package com.sree.driver.pojo;

import java.util.Date;
import java.util.Map;

public class DriverInformation {
	private int driverid;
	
	private String first_name;
	private String last_name;
	private Date date_of_birth;
	private String rate_offering_id;
	private int home_location_id;
	private String driver_type;
	private String isactive;
	private Date date_of_hire;
	private Map<Integer,DriverSpecialServicesPOJO> specialServices;
	private String locDetails;
	public String getLocDetails() {
		return locDetails;
	}
	public void setLocDetails(String locDetails) {
		this.locDetails = locDetails;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getRate_offering_id() {
		return rate_offering_id;
	}
	public void setRate_offering_id(String rate_offering_id) {
		this.rate_offering_id = rate_offering_id;
	}
	public int getHome_location_id() {
		return home_location_id;
	}
	public void setHome_location_id(int home_location_id) {
		this.home_location_id = home_location_id;
	}
	public String getDriver_type() {
		return driver_type;
	}
	public void setDriver_type(String driver_type) {
		this.driver_type = driver_type;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public Date getDate_of_hire() {
		return date_of_hire;
	}
	public void setDate_of_hire(Date date_of_hire) {
		this.date_of_hire = date_of_hire;
	}
	public Map<Integer,DriverSpecialServicesPOJO > getSpecialServices() {
		return specialServices;
	}
	public void setSpecialServices(Map<Integer,DriverSpecialServicesPOJO> specialServices) {
		this.specialServices = specialServices;
	}
}
