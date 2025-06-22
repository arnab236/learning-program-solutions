package com.as.service;

import com.as.models.Employee;

public class EmployeeManagementSystem {
	    private Employee[] employees;
	    private int size;
	    private static final int DEFAULT_CAPACITY = 10;

	    public EmployeeManagementSystem() {
	        employees = new Employee[DEFAULT_CAPACITY];
	        size = 0;
	    }

	    // Add an employee (O(1) amortized, O(n) worst-case when resizing)
	    public void addEmployee(Employee emp) {
	        if (size == employees.length) {
	            resizeArray();
	        }
	        employees[size++] = emp;
	    }

	    // Search by employeeId (O(n))
	    public Employee searchEmployee(int employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                return employees[i];
	            }
	        }
	        return null;
	    }

	    // Traverse all employees (O(n))
	    public void traverseEmployees() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(employees[i]);
	        }
	    }

	    // Delete an employee by ID (O(n))
	    public boolean deleteEmployee(int employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                // Shift remaining elements left
	                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
	                employees[--size] = null; // Clear last reference
	                return true;
	            }
	        }
	        return false;
	    }

	    // Resize array when full (O(n))
	    private void resizeArray() {
	        Employee[] newArray = new Employee[employees.length * 2];
	        System.arraycopy(employees, 0, newArray, 0, size);
	        employees = newArray;
	    }

	    // Get current number of employees (O(1))
	    public int getSize() {
	        return size;
	    }
	}
