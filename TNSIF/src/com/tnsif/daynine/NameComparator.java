package com.tnsif.daynine;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeComparator>{
	// == equals compareTo-------> String comparison


	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}
