package com.techdenovo.EmployeeManagementModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.techdenovo.EmployeeManagementModule.dao.EmployeeDao;

public class App {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	        Scanner scanner = new Scanner(System.in);
	        char choice;
	        EmployeeDao employeeDao = new EmployeeDao();
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Select Option 1 to fill details of employees");
	            System.out.println("2. Select Option 2 to get the details of employees");
	            System.out.println("3. Select Option 3 to search an employee");
	            System.out.println("4. Select option 4 to Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.next().charAt(0);

	            switch (choice) {
	                case '1':
	                    System.out.println("You selected Option 1");
	                    employeeDao.inputEmployee();
	                    
	                    break;
	                case '2':
	                    System.out.println("You selected Option 2");
	                    employeeDao.display();

	                    break;
	                case '3':
	                    System.out.println("You selected Option 3");
	                    System.out.println("Enter the ID to search:");
	                    employeeDao.search();
	                    
	                case '4':
	                    System.out.println("Exiting from Menu.....");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } 
	        while (choice != '4');
	        
	        scanner.close();
	    }
	
	}


