package com.mycompany.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.model.Customer;
import com.mycompany.service.CustomerServiceImpl;

public class Tester {

	public static void main(String [] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CustomerServiceImpl customerServiceImpl =(CustomerServiceImpl) ctx.getBean("customerServiceImpl");
		
		List<Customer> customers = customerServiceImpl.getCustomerList();
		for(Customer c:customers)
		{
			
			System.out.println("Customer : "+c.getName());
			System.out.println(" lives on following address");
			System.out.println(" "+c.getAddress());
			System.out.println("------------------------------");
			
		}
		
	}
	
}
