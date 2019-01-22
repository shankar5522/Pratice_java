/**
 * 
 */
package com.constructor;

/**
 * @author Shankar
 * 
 * https://beginnersbook.com/2013/12/java-constructor-chaining-with-example/
 *
 */
class Employee {
	public String empName;
	public int empSalary;
	public String address;

	//default constructor of the class
	public Employee() {
		//this will call the constructor with String param
		this("Chaitanya");
		System.out.println("This is Default Constructor");
	}

	public Employee(String name) {
		//call the constructor with (String, int) param
		this(name, 120035);
		System.out.println("This is Signle Parameter Constructor");
	}

	public Employee(String name, int sal) {
		//call the constructor with (String, int, String) param
		this(name, sal, "Gurgaon");
		System.out.println("This is 2 paramater constructor");
		//this(name, sal, "Gurgaon");     //  not allowed as this()/super keyword should be 1st line in any constructor
	}

	public Employee(String name, int sal, String addr) {
		System.out.println("This is first line in Final Constructor");
		this.empName = name;
		this.empSalary = sal;
		this.address = addr;
		System.out.println("This is last line in Final Constructor");
	}

	void disp() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + address);
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.disp();

		/*		Employee obj = new Employee("shankar", 10, "Mumbai");
				obj.disp();*/
	}
}
