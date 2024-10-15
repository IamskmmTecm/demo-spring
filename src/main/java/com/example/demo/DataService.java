package com.example.demo;


import lombok.Data;

//@Data // Data annotation is from Lombok. it automatically generate setter method and toString method(unfortunately in this project its not working)
public class DataService {
	
	private int id;
	private String name;
	private int salary;
	public DataService(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "DataService [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
