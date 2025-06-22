package com.as;

import java.util.Scanner;

import com.as.repository.CustomerRepositoryImpl;
import com.as.service.CustomerService;

public class App {
	
	    public static void main(String[] args) {
	    	       
	    	        CustomerRepositoryImpl repository = new CustomerRepositoryImpl();
	    	        CustomerService customerService = new CustomerService(repository); // Dependency Injection
	    	        Scanner scanner = new Scanner(System.in);

	    	        while (true) {
	    	            System.out.println("\n------ Customer Management ------");
	    	            System.out.println("1. Add Customer");
	    	            System.out.println("2. Find Customer by ID");
	    	            System.out.println("3. Exit");
	    	            System.out.print("Choose an option: ");

	    	            int choice = scanner.nextInt();
	    	            scanner.nextLine(); 

	    	            switch (choice) {
	    	                case 1:
	    	                    System.out.print("Enter Customer ID: ");
	    	                    int id = scanner.nextInt();
	    	                    scanner.nextLine(); 
	    	                    System.out.print("Enter Customer Name: ");
	    	                    String name = scanner.nextLine();
	    	                    customerService.addCustomer(id, name);
	    	                    break;

	    	                case 2:
	    	                    System.out.print("Enter Customer ID to search: ");
	    	                    int searchId = scanner.nextInt();
	    	                    scanner.nextLine(); 
	    	                    System.out.println(customerService.getCustomerById(searchId));
	    	                    break;

	    	                case 3:
	    	                    System.out.println("Exiting...");
	    	                    scanner.close();
	    	                    System.exit(0);

	    	                default:
	    	                    System.out.println("Invalid option!");
	    	            }
	    	        }
	    	    }
	    	}