package student;

public class Student {
	private String name;
	private String grade;
	private String course;

	public Student() {

	}

	public Student(String name, String grade, String course) {
		super();
		this.name = name;
		this.grade = grade;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", grade: " + grade + ", course: " + course + "]";
	}
	
	
	

}
