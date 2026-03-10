package newSchool;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	private String nameClass;
	private Teacher teacher;
	private List<Student> listStudent = new ArrayList<>();

	public Classes() {
		
	}
	
	public Classes(String nameClass, Teacher teacher) {
		this.nameClass = nameClass;
		this.teacher = teacher;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void addStudent(Student student) {
		listStudent.add(student);
	}
	
	public void removeStudent(Student student) {
		listStudent.remove(student);
	}
	
	//return list of student
	public List<Student> getStudent(){
		return listStudent;
	}

	//show list of Student
	public void displayStudent() {
		if(!listStudent.isEmpty()) {
			for(Student st : listStudent) {
				System.out.println(st);
			}
		}
	}
	
	@Override
	public String toString() {
		return "+ Class: " + this.getNameClass() + ", Teacher: " + this.getTeacher();
	}

	
	
	
}
