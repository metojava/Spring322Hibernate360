package com.mycompany.dao;

import java.util.List;

import com.mycompany.model.Customer;

public interface CustomerDao {

	

	public List<Customer> getCustomerList();

	public Customer getCustomerById(int id);

	public int saveOrupdateCustomer(Customer customer);

	public void deleteCustomer(int id);
	
}
