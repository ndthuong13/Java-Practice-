package employee;

import java.time.LocalDate;
import java.time.Period;

public class NewEmployee {
	private String name;
	private float salary;
	private LocalDate hireDate;
	
	
	public NewEmployee() {

	}

	public NewEmployee(String name, float salary, LocalDate hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public int yearOfService(LocalDate hireDate) {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	public void detail() {
		System.out.println("Name: " + this.getName());
		System.out.println("Salary: " + this.getSalary());
		System.out.println("Hire Date " + this.getHireDate());
	}
}
