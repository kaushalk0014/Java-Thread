package com.learning.executor.framework;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.learning.dao.EmployeeDao;
import com.learning.dto.Employee;

public class ExecutorsMainTest {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<Employee> employees =  EmployeeDao.getAllEmployees();
		
		for(Employee employee : employees) {
			 SalaryCalculation salaryCalculation = new SalaryCalculation(employee);
			 executorService.submit(salaryCalculation);
		}
		
		System.out.println("All tasks submitted for execution.");
		
		for(Employee employee : employees) {
			 
			System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary()+" No of Working Days: " + employee.getNoOfWorkingDays() + ", Basic Salary: " + employee.getBasicSalary());
		}
	}
}
