package com.student;

public class Employee {
	int emp_id;
	String emp_name;
	
	public Employee() {								// Default Constructor
		System.out.println("Hi..Im Sushant");
	}
	
	public Employee(int emp_id, String emp_name) {   //Parameterized  Constructor

		this.emp_id = emp_id;
		this.emp_name = emp_name;
		System.out.println("Emp_id="+this.emp_id +"\nEmployee Name="+this.emp_name);
	
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();   
		Employee e2=new Employee(1,"Ram");
		Employee e3=new Employee(2,"Sham");
	}
    
}
