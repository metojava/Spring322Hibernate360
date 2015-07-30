package com.mycompany.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Customer> listCustomers = session.createQuery("from Customer c")
				.list();
		tx.commit();
		session.close();
		return listCustomers;
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, id);
		session.close();

		return customer;
	}

	@Override
	public int saveOrupdateCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(customer);
		tx.commit();
		session.close();
		return customer.getId();
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, id);
		session.delete(customer);
		session.close();
		
	}

}
