package com.tnsif.daynine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExecuter {

    public static void main(String[] args) {

        List<EmployeeComparator> emps = new ArrayList<>();
        emps.add(new EmployeeComparator("Ashwini", 105, 20000.0));
        emps.add(new EmployeeComparator("Vedant", 102, 15000.0));
        emps.add(new EmployeeComparator("Shika", 101, 19000.0));
        emps.add(new EmployeeComparator("Ram", 104, 30000.0));
        emps.add(new EmployeeComparator("Piyu", 103, 100000.0));

        // unsorted objects
        System.out.println("Natural ordering of Employee");
        emps.forEach(System.out::println);

        System.out.println("*   *   *   *   *   *   *   *   *   *    *");

        // Sorted ordering of Employee on basis of Salary:
        Collections.sort(emps, new SalaryComparator());
        System.out.println("Sorted ordering of Employee on basis of Salary:");
        emps.forEach(System.out::println);

        System.out.println("*   *   *   *   *   *   *   *   *   *    *");

        // Sorted ordering of Employee on basis of Names:
        Collections.sort(emps, new NameComparator());
        System.out.println("Sorted ordering of Employee on basis of Names:");
        emps.forEach(System.out::println);
    }
}
