package com.fre.service;

import java.util.List;

import com.fre.models.Customer;
import com.fre.repository.CustomerRepository;
import com.fre.repository.HibernateCustomerRepository;

/**
 * In this class we are making a method that could talk to our repository so we
 * can use it in main class to test
 * 
 * @author fre
 *
 */
public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerRepositry; // = new HibernateCustomerRepository();

	// TODO: create a constructor injection
	/*
	public CustomerServiceImp() {
	}

	public CustomerServiceImp(CustomerRepository customerRepository) {
		this.customerRepositry = customerRepository;
	}*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepositry.findAll();
	}
	
	// TODO: create a setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepositry = customerRepository;
	}
	
}
