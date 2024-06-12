package com.tnsif.dayfour;

public class Executer {

		public static void main(String[] args) {
		  Address address = new Address("Kalyan", "Marine Drive", "Mumbai");
		   
		  Person person = new Person("Ashwini", address);
		  
		  System.out.println(person);
		}

}
