package com.techdenovo.EmployeeManagementModule;

public class Employee {
	    private String firstName;
	    private String lastName;
	    private int salary;
	    private int id;
	    
	    
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Employee(String firstName, String lastName, int salary, int id) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;                                       // using for displaying the employee details
			this.salary = salary;
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;                                       // using for getting employee details 
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	    
	
}
