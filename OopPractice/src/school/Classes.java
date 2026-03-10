package school;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	private String ClassName;
	private Teacher teacher;
	private List<Student> stList = new ArrayList<>();

	public Classes(String className, Teacher teacher) {
		ClassName = className;
		this.teacher = teacher;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	//return List of Student
	public List<Student> getStList() {
		return stList;
	}
	
	//Show List of Student
	public void displayStudent() {
		if(!stList.isEmpty()) {
			for (Student st : stList) {
				System.out.println(st);
			}
		}
	}
	
	public void addStudent(Student student) {
		stList.add(student);
	}

	public void removeStudent(Student student) {
		stList.remove(student);
	}

	@Override
	public String toString() {
		return "Classes [ClassName: " + this.getClassName() + "]";
	}
	
	

}
