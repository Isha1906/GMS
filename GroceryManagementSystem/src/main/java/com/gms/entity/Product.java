package com.gms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Product_Id;
	private String Product_Name;
	private int Quantity;
	private float Price;
	//private int Category_Id;
	
	
	

}
