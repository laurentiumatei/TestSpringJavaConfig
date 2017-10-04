package com.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.test.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${someProperty}")
	private String someValue;
	
	/* (non-Javadoc)
	 * @see com.pluralshight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName(someValue);
		customer.setLastName("Mate");
		
		customers.add(customer);
		
		return customers;	
	}
}
