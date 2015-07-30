package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomerList();

	public Customer getCustomerById(int id);

	public int saveOrUpdateCustomer(Customer customer);

	public void deleteCustomer(int id);
}
