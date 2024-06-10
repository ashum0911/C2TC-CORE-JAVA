package com.tnsif.daytwo;

import java.util.Scanner; // Import statement for Scanner class

public class Executor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Customer Id : ");
        int id = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter Customer Name : ");
        String name = sc.nextLine();
        
        System.out.println("Enter Customer City : ");
        String city = sc.nextLine();
        
        Customer c1=new Customer();  //default constructor called
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomercity(city);
        
        Customer c2 = new Customer(id,name,city);
        System.out.println(c2);
        
        System.out.println("Customer Details: " +c1);
    }

}
