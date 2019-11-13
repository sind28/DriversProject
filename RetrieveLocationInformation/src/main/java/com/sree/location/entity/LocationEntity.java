package com.sree.location.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="location")
public class LocationEntity {

	@Id
	private int locationid;
	@JsonProperty("location_name")
	private String location_name;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	public int getlocationid() {
		return locationid;
	}
	public void setlocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getlocation_name() {
		return location_name;
	}
	public void setlocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
