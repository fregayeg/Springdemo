package com.pluralsight.service;

import java.util.List;

import com.pluralsight.models.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepository;

/**
 * In this class we are making a method that could talk to our repository so we can use it 
 * in main class to test
 * @author fre
 *
 */
public class CustomerServiceImp implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepository(); 
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
