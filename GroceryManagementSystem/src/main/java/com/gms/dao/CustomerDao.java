package com.gms.dao;

import com.gms.entity.Customer;

public interface CustomerDao {
	
	void saveCustomer(Customer c);
	Customer updateCustomer(Customer c,int id);
	void deleteCustomer(int id);
	Customer getCustomer(int id);
	

}
