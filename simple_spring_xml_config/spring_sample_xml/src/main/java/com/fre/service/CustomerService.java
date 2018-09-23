package com.fre.service;

import java.util.List;

import com.fre.models.Customer;

/**
 * This interface was extracted from the {@link CustomerServiceImp}
 * @author fre
 *
 */
public interface CustomerService {

	List<Customer> findAll();

}