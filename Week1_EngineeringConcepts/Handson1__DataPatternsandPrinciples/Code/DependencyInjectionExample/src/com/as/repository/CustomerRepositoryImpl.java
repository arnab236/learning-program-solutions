package com.as.repository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	    private final Map<Integer, String> customers = new HashMap<>();

	    @Override
	    public void addCustomer(int id, String name) {
	        customers.put(id, name);
	        System.out.println("Customer added: ID=" + id + ", Name=" + name);
	    }

	    @Override
	    public String findCustomerById(int id) {
	        return customers.get(id);
	    }
	}

