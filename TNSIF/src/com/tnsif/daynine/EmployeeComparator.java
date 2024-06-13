package com.tnsif.daynine;

public class EmployeeComparator {
	public String name;
	public int eid;
	public double salary;
	
	public EmployeeComparator(String name, int eid , double salary) {
		super();
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}


}
