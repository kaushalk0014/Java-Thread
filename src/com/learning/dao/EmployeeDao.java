package com.learning.dao;

import java.util.ArrayList;
import java.util.List;

import com.learning.dto.Employee;

public class EmployeeDao {

		public static List<Employee> getAllEmployees() {
			 List<Employee> employees = new ArrayList<>();
			 
			 //create some dummy data
			 employees.add(new Employee(1, "Rakesh Kumar", 20, 30000));
			 employees.add(new Employee(2, "Pankaj Singh", 22, 35000));
			 employees.add(new Employee(3, "Rohan Roy", 18, 32000));
			 employees.add(new Employee(4, "Akash Kumar", 25, 40000));
			 employees.add(new Employee(5, "Sonu Kumar", 21, 37000));
			 employees.add(new Employee(6, "Golu Kumar", 23, 42000));
			 employees.add(new Employee(7, "Suraj Kumar", 19, 33000));
			 employees.add(new Employee(8, "Priti Kumari", 24, 38000));
			 employees.add(new Employee(9, "Sai Pallvai",  7, 31000));
			 employees.add(new Employee(10, "Dineesh Sharama", 26, 41000));
			return employees;
		}
}
