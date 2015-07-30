package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.dao.CustomerDao;
import com.mycompany.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomerList() {
		
		return customerDao.getCustomerList();
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerDao.getCustomerById(id);
	}

	@Override
	public int saveOrUpdateCustomer(Customer customer) {
		
		return customerDao.saveOrupdateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
		
	}

	

}
