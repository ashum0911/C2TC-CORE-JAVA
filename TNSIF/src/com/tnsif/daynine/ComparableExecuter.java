package com.tnsif.daynine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableExecuter {
    
    public static void main(String[] args) {
        
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Ashwini", 105, 20000.0));
        emps.add(new Employee("Vedant", 102, 15000.0));
        emps.add(new Employee("Shika", 101, 19000.0));
        emps.add(new Employee("Ram", 104, 30000.0));
        emps.add(new Employee("Piyu", 103, 100000.0));
        
        // unsorted objects
        System.out.println("Natural ordering of Employee");
        emps.forEach(System.out::println);
        
        System.out.println("*   *   *   *   *   *   *   *   *   *    *");
        
        Collections.sort(emps);
        System.out.println("Sorted ordering of Employee on basis of IDs");
        emps.forEach(System.out::println);
        
    }
    
}
  
