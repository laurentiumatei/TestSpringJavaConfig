package com.test.repository;

import java.util.List;

import com.test.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}