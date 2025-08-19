package com.learning.dao;

import java.util.ArrayList;
import java.util.List;

import com.learning.dto.Employee;

public class EmployeeDao {

		public static List<Employee> getAllEmployees() {
			 List<Employee> employees = new ArrayList<>();
			 
			 //create some dummy data
			 employees.add(new Employee(1, "John Doe", 20, 30000));
			 employees.add(new Employee(2, "Jane Smith", 22, 35000));
			 employees.add(new Employee(3, "Alice Johnson", 18, 32000));
			 employees.add(new Employee(4, "Bob Brown", 25, 40000));
			 employees.add(new Employee(5, "Charlie White", 21, 37000));
			 employees.add(new Employee(6, "Diana Green", 23, 42000));
			 employees.add(new Employee(7, "Ethan Black", 19, 33000));
			 employees.add(new Employee(8, "Fiona Blue", 24, 38000));
			 employees.add(new Employee(9, "George Yellow",  7, 31000));
			 employees.add(new Employee(10, "Hannah Purple", 26, 41000));
			return employees;
		}
}
