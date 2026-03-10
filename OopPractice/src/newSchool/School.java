package newSchool;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Classes> listClass = new ArrayList<>();
	private List<Student> listStudent = new ArrayList<>();
	private List<Teacher> listTeacher = new ArrayList<>();

	public School() {

	}

	public School(List<Classes> listClass, List<Student> listStudent, List<Teacher> listTeacher) {
		this.listClass = listClass;
		this.listStudent = listStudent;
		this.listTeacher = listTeacher;
	}

	public void addStudent(Student student) {
		listStudent.add(student);
	}

	public void addTeacher(Teacher teacher) {
		listTeacher.add(teacher);

	}

	public void addClass(Classes classes) {
		listClass.add(classes);
	}

	public void removeStudent(Student student) {
		listStudent.remove(student);
	}

	public void removeTeacher(Teacher teacher) {
		listTeacher.remove(teacher);

	}

	public void removeClass(Classes classes) {
		listClass.remove(classes);
	}

	public List<Classes> getClasses() {
		return listClass;
	}

	public List<Student> getStudent() {
		return listStudent;
	}

	public List<Teacher> getTeacher() {
		return listTeacher;
	}

	public void displayStudentA() {
		if (!listStudent.isEmpty()) {
			for (Student st : listStudent) {
				System.out.println(st);
			}
		}
	}

	public void displayTeacherA() {
		if (!listTeacher.isEmpty()) {
			for (Teacher tc : listTeacher) {
				System.out.println(tc);
			}
		}
	}

	public void displayClassA() {
		if (!listClass.isEmpty()) {
			for (Classes c : listClass) {
				System.out.println(c);
			}
		}
	}
}
