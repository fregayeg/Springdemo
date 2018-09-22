package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.models.Customer;

/**
 * This interface was extracted from the {@link HibernateCustomerRepository}
 * @author fre
 *
 */
public interface CustomerRepository {

	List<Customer> findAll();

}