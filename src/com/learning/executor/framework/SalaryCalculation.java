package com.learning.executor.framework;

import com.learning.dto.Employee;

public class SalaryCalculation implements Runnable {

	private Employee employee;
	
	public SalaryCalculation(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public void run() {
		int salary = employee.getBasicSalary() * employee.getNoOfWorkingDays();
		employee.setSalary(salary);
		
		System.out.println("Current Thread Name "+ Thread.currentThread().getName());
	}
}
