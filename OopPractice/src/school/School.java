package school;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Teacher> listTeacher = new ArrayList<>();
	private List<Student> listStudent = new ArrayList<>();
	private List<Classes> listClass = new ArrayList<>();

	public void addStudent(Student student) {
		listStudent.add(student);
	}

	public void addTeacher(Teacher teacher) {
		listTeacher.add(teacher);
	}

	public void addClass(Classes classA) {
		listClass.add(classA);
	}

	public void removeStudent(Student student) {
		listStudent.remove(student);
	}

	public void removeTeacher(Teacher teacher) {
		listTeacher.remove(teacher);
	}

	public void removeClass(Classes classA) {
		listClass.remove(classA);
	}
	
	public List<Student> getStudent(){
		return listStudent;
	}
	public List<Teacher> getTeacher(){
		return listTeacher;
	}
	public List<Classes> getClasses(){
		return listClass;
	}

	public void displayClasses() {
		if(!listClass.isEmpty()) {
			for(Classes c : listClass) {
				System.out.println(c);
			}
		}
	}
	
	public void displayTeacher() {
		if(!listTeacher.isEmpty()) {
			for(Teacher t : listTeacher) {
				System.out.println(t);
			}
		}
	}
	
	public void displayStudent() {
		if(!listStudent.isEmpty()) {
			for(Student st : listStudent) {
				System.out.println(st);
			}
		}
	}

}
