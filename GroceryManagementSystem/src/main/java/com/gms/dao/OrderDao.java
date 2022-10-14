package com.gms.dao;

import com.gms.entity.Order;

public interface OrderDao {
	void saveOrder(Order o);
	Order  updateOrder(Order o,int id);
	void deleteOrder(int id);
	Order  getOrder(int id);
}
