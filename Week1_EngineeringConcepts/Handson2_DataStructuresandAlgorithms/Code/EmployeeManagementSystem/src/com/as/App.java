package com.as;

import java.util.Scanner;

import com.as.models.Employee;
import com.as.service.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {
		
		        EmployeeManagementSystem ems = new EmployeeManagementSystem();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n----- Employee Management System -----");
		            System.out.println("1. Add Employee");
		            System.out.println("2. Search Employee");
		            System.out.println("3. List All Employees");
		            System.out.println("4. Delete Employee");
		            System.out.println("5. Exit");
		            System.out.print("Choose an option: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Employee ID: ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine();
		                    System.out.print("Enter Name: ");
		                    String name = scanner.nextLine();
		                    System.out.print("Enter Position: ");
		                    String position = scanner.nextLine();
		                    System.out.print("Enter Salary: ");
		                    double salary = scanner.nextDouble();
		                    ems.addEmployee(new Employee(id, name, position, salary));
		                    break;

		                case 2:
		                    System.out.print("Enter Employee ID to search: ");
		                    int searchId = scanner.nextInt();
		                    Employee emp = ems.searchEmployee(searchId);
		                    System.out.println(emp != null ? emp : "Employee not found!");
		                    break;

		                case 3:
		                    ems.traverseEmployees();
		                    break;

		                case 4:
		                    System.out.print("Enter Employee ID to delete: ");
		                    int deleteId = scanner.nextInt();
		                    boolean deleted = ems.deleteEmployee(deleteId);
		                    System.out.println(deleted ? "Employee deleted!" : "Employee not found!");
		                    break;

		                case 5:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    System.exit(0);

		                default:
		                    System.out.println("Invalid option!");
		            }
		        }
		    }
}
