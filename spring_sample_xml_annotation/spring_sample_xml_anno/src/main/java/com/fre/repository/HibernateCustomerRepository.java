package com.fre.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fre.models.Customer;

/**
 * This class is for repository purpose
 * 
 * @NOTE: This class is responsible on the data manipulation procedure
 * 
 * @author fre
 *
 */
@Repository("customerRepository") // This is a bean definition by annotation
public class HibernateCustomerRepository implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.CustomerInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Firas");
		customer.setLastName("Rega");

		customers.add(customer);

		return customers;
	}
}
