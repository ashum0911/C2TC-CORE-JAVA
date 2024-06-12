package com.tnsif.daysix;

public class Executor {
	public static void main(String[] args) {
		Employee e1= new Employee("Ashwini", 13,1000);
		System.out.println(e1);
		
		Manager m1= new Manager( "Vedant", 12,1000,50);
		System.out.println(m1);
	}

}
