package com.as.service;

import com.as.repository.CustomerRepository;

public class CustomerService {
	
	    private final CustomerRepository customerRepository;

	    // Constructor Injection (Dependency is injected here)
	    public CustomerService(CustomerRepository customerRepository) {
	        this.customerRepository = customerRepository;
	    }

	    public void addCustomer(int id, String name) {
	        customerRepository.addCustomer(id, name);
	    }

	    public String getCustomerById(int id) {
	        String customer = customerRepository.findCustomerById(id);
	        if (customer == null) {
	            return "Customer not found!";
	        }
	        return "Customer Found: ID=" + id + ", Name=" + customer;
	    }
	}