package com.hexaware.fundamentals;

import inheritance.Child;

class Employee extends Object{

	public Employee() {
		super();   // If we don't write this it is done by compiler
	    System.out.println("Employee object created");
	} 
	
	
	String eName;  //instance variable and is instance specific is initialized by jvm
	int eId;
	static String cmpName; // static variable and is class specific same for all instances
}

public class Basics extends Child{
	public static void main(String[] args) {
		System.out.println(Employee.cmpName); //shows null given by jvm
		Employee e1=new Employee();
		System.out.println(e1.eName);
		System.out.println(e1);
		int a; //wont be able to print as not initialized by jvm
		Integer ab=Integer.parseInt("10");
		Double d=Double.parseDouble("10.5");
		Boolean b=Boolean.parseBoolean("Yash");//Everything other than true or True is false
		System.out.println(b);
		Basics bob=new Basics();
		System.out.println(bob.name);//protected ACCESS
		
		
		
		
		
		

	}

	

}
