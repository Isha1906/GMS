package com.gms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
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
	
	
	

}
