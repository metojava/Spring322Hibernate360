package com.mycompany.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="cc_number")
	private String ccNumber;

	@Column(name="city_region")
	private String cityRegion;

	private String email;

	private String name;

	private String phone;



	public Customer(int id, String address, String ccNumber, String cityRegion,
			String email, String name, String phone) {
		super();
		this.id = id;
		this.address = address;
		this.ccNumber = ccNumber;
		this.cityRegion = cityRegion;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public Customer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCcNumber() {
		return this.ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCityRegion() {
		return this.cityRegion;
	}

	public void setCityRegion(String cityRegion) {
		this.cityRegion = cityRegion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + ", ccNumber="
				+ ccNumber + ", cityRegion=" + cityRegion + ", email=" + email
				+ ", name=" + name + ", phone=" + phone + "]";
	}



}