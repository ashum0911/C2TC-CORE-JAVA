package com.tnsif.daynine;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(),o2.getSalary());
	}
	

}
