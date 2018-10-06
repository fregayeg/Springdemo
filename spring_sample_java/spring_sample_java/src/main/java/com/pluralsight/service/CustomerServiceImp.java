package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.models.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * In this class we are making a method that could talk to our repository so we
 * can use it in main class to test
 * 
 * @author fre
 *
 */
@Service("customerService")
//@Scope("singleton") // this adds a scope to our bean by giving the a string naming USING JAVA
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // this adds a scope to our bean by giving the an Enum USING JAVA
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // this add a scope to our bean ... USING JAVA
public class CustomerServiceImp implements CustomerService {
	
	//@Autowired
	private CustomerRepository customerRepository; // = new HibernateCustomerRepository();

	public CustomerServiceImp() {
		
	}
	public CustomerServiceImp(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
		System.out.println("We are using consructor injection");
	}

	// TODO: make a setter injection
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
