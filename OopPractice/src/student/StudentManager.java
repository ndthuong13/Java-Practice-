package student;

import java.util.*;
public class StudentManager {
	private List<Student> listStudent = new ArrayList<>();
	
	public void addStudent(String name, String grade, String course) {
		listStudent.add(new Student(name, grade, course));
	}
	
	public boolean removeStudent(String name) {
		listStudent.removeIf(listStudent -> listStudent.getName().equalsIgnoreCase(name));
		return true; 
	}
	public void display() {
		if(!listStudent.isEmpty()) {
			for(Student st : listStudent) {
				System.out.println(st);
			}
		}else {
			System.out.println("List null");
		}
	}
}
