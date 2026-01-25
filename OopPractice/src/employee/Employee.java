package employee;

public class Employee {

	private String name;
	private String job;
	private String title;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String job, String title, float salary) {
		this.name = name;
		this.job = job;
		this.title = title;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float salaryCalculate(float salary){
		return salary * 12;
	}
	
	public void updateSalary(float percentage) {
		salary += salary * percentage / 100;
	}
	@Override
	public String toString() {
		return "Employee [\nname: " + this.getName() 
		+ ", \njob: " + this.getJob() 
		+ ", \ntitle: " + this.getTitle() 
		+ ", \nsalary: " + this.getSalary() 
		+ "]";
	}
	
	
}
