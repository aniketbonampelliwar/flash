package com.techdenovo.EmployeeManagementModule.dao;

import com.techdenovo.EmployeeManagementModule.Employee;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDao {
	ArrayList<Employee> employees = new ArrayList<Employee>();

			
			Scanner scanner = new Scanner(System.in);
			
			public void inputEmployee() {
				Employee newEmployee = new Employee();
        	
			
            //System.out.println("Getting details of employee " + (i + 1) + ".....");

            System.out.println("Enter Firstname:");
            newEmployee.setFirstName(scanner.next());

            System.out.println("Enter Lastname:");
            newEmployee.setLastName(scanner.next());

            System.out.println("Enter salary:");
            newEmployee.setSalary(scanner.nextInt());

            System.out.println("Enter ID:");
            newEmployee.setId(scanner.nextInt());
            
            employees.add (newEmployee );
        }
		
	
		public void display() {
			if (employees.isEmpty()) {
				System.out.println("Employee details is empty");
			}
				for (Employee employee : employees) {
				String finalSalary =Integer.toString(employee.getSalary());
				String finalId =Integer.toString (employee.getId());
			    String array[] = {"FirstName:"+employee.getFirstName(),"LastName:"+employee.getLastName(),"Salary:"+finalSalary,"Id:"+finalId};
			    System.out.println(Arrays.toString(array));
				}  
			}
		public void search() {
			if (employees.isEmpty()) {
				System.out.println("Employee details is empty");
				
			}
			 int searchId = scanner.nextInt();
             int found = 0;
             for (Employee employee : employees) {

                 if (employee.getId() == searchId) {
                     System.out.println("Employee found sucessfully:");
                     System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
                     System.out.println("Salary: " + employee.getSalary());
                     System.out.println("ID: " + employee.getId());
                     found = 1;
                     
                 		}
         	}
             		if (found == 0) {
             			System.out.println("Employee with ID " + searchId + " not found.");
                 
             			}
             			
				}
		
				}
			
		
		

		
				
	
		
		