package com.pluralsight.models;

/**
 * This class is a simple object with few fields 
 * @author fre
 *
 */
public class Customer {
	
	// properties
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
