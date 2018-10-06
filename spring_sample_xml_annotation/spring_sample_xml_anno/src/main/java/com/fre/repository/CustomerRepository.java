package com.fre.repository;

import java.util.List;

import com.fre.models.Customer;

/**
 * This interface was extracted from the HibernateCustomerRepository 
 * @author fre
 *
 */
public interface CustomerRepository {

	List<Customer> findAll();

}