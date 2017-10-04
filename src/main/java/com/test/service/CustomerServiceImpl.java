package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.test.model.Customer;
import com.test.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralshight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
		
		
	}
}
