package com.gms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Ship_Name;
	private String Ship_address;
	private String Ship_City;
	private int Ship_Zipcode;
	private int Contact_Number;
	private String Email;
	public String getShip_Name() {
		return Ship_Name;
	}
	public void setShip_Name(String ship_Name) {
		Ship_Name = ship_Name;
	}
	public String getShip_address() {
		return Ship_address;
	}
	public void setShip_address(String ship_address) {
		Ship_address = ship_address;
	}
	public String getShip_City() {
		return Ship_City;
	}
	public void setShip_City(String ship_City) {
		Ship_City = ship_City;
	}
	public int getShip_Zipcode() {
		return Ship_Zipcode;
	}
	public void setShip_Zipcode(int ship_Zipcode) {
		Ship_Zipcode = ship_Zipcode;
	}
	public int getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(int contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	

}
