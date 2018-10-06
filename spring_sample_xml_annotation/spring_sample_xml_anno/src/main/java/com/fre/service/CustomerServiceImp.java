package com.fre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fre.models.Customer;
import com.fre.repository.CustomerRepository;
//import com.fre.repository.HibernateCustomerRepository;

/**
 * In this class we are making a method that could talk to our repository so we
 * can use it later from the main class
 * 
 * @NOTE: this class is the responsible on the business logic
 * 
 * @author fre
 *
 */
@Service("customerService") // This is a bean definition by annotation
public class CustomerServiceImp implements CustomerService {
	
	// TODO: Member variable injection using annotation
	//@Autowired
	private CustomerRepository customerRepository; // = new HibernateCustomerRepository();
	
	// TODO: Setter inject using annotation
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}
	// TODO: Constructor injection using annotation
	@Autowired
	public CustomerServiceImp(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
		System.out.println("we are using a constructor injection");
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
