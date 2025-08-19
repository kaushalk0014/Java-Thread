package com.learning.dto;

public class Employee {

	private Integer id;
	private String name;
	private Integer salary;
	private Integer noOfWorkingDays;
	private Integer basicSalary;

	public Employee(Integer id, String name, Integer noOfWorkingDays, Integer basicSalary) {
		this.id = id;
		this.name = name;
		this.noOfWorkingDays = noOfWorkingDays;
		this.basicSalary = basicSalary;
	}
	
	public Employee() {
		// Default constructor
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(Integer noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

}
