package com.capgemini.demo.comp;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.compareTo(emp2);
		
		//your logic
	//	return Double.valueOf(emp1.getSalary()).compareTo(Double)

//		if (emp1.getSalary() > emp2.getSalary())
//			return 1;
//		else if (emp1.getSalary() < emp2.getSalary())
//			return -1;
//		else
//			return 0;

	}

}


