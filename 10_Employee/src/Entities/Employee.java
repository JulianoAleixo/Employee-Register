package Entities;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	// Constructor
	public Employee() {
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Functions 
	public void increaseSalary(double percentage) {
		setSalary(this.salary += (percentage / 100) * this.salary);
	}
	
	// To String 
	public String toString() {
		return id + ", " + name + ", U$" + String.format("%.02f", salary);
	}
}
