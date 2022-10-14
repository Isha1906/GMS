package com.gms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="cart")
public class Cart {
	
     @Id
       private int cart_id;
       private String username;
       private int product_id;
       private String product_name;
       private int Quantity_per_product;
       private int unit_price;
       private int total_amount;
       private String Date;
       private String status;
	
       
}
