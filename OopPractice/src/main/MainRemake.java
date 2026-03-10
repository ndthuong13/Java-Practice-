package main;

import newSchool.Classes;
import newSchool.School;
import newSchool.Student;
import newSchool.Teacher;

public class MainRemake {
	public static void main(String[] args) {
		School school = new School();

		Student student1 = new Student("Nguyen Dinh Thuong", 15);
		Student student2 = new Student("Tran Thi Mai", 17);
		Student student3 = new Student("Le Quang Huy", 18);
		Student student4 = new Student("Pham Minh Duc", 19);
		Student student5 = new Student("Hoang Thu Trang", 20);

		Teacher teacher1 = new Teacher("Nguyen Van Hung", "Math");
		Teacher teacher2 = new Teacher("Tran Thi Lan", "Physics");
		Teacher teacher3 = new Teacher("Le Quang Minh", "Chemistry");
		Teacher teacher4 = new Teacher("Pham Thu Ha", "Biology");
		Teacher teacher5 = new Teacher("Hoang Van Nam", "English");

		Classes classes1 = new Classes("Math", teacher1);
		classes1.addStudent(student1);
		classes1.addStudent(student2);
		classes1.addStudent(student3);
		classes1.addStudent(student4);
		classes1.addStudent(student5);
		System.out.println("Math class: " + classes1.getStudent().size() + " students");
		classes1.displayStudent();
		System.out.println();

		Classes classes2 = new Classes("Physic", teacher2);
		classes2.addStudent(student1);
		classes2.addStudent(student3);
		classes2.addStudent(student5);
		System.out.println("Physic class: " + classes2.getStudent().size() + " students");
		classes2.displayStudent();
		System.out.println();

		Classes classes3 = new Classes("Chemistry", teacher3);
		classes3.addStudent(student1);
		classes3.addStudent(student3);
		classes3.addStudent(student5);
		System.out.println("Chemistry class: " + classes3.getStudent().size() + " students");
		classes3.displayStudent();
		System.out.println();

		Classes classes4 = new Classes("Biology", teacher4);
		classes4.addStudent(student1);
		classes4.addStudent(student3);
		classes4.addStudent(student5);
		System.out.println("Biology class: " + classes4.getStudent().size() + " students");
		classes4.displayStudent();
		System.out.println();

		Classes classes5 = new Classes("English", teacher5);
		classes5.addStudent(student1);
		classes5.addStudent(student2);
		classes5.addStudent(student3);
		classes5.addStudent(student4);
		classes5.addStudent(student5);
		System.out.println("English class: " + classes5.getStudent().size() + " students");
		classes5.displayStudent();
		System.out.println();

		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4); 	
		school.addStudent(student5);

		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		school.addTeacher(teacher3);
		school.addTeacher(teacher4);
		school.addTeacher(teacher5);

		school.addClass(classes1);
		school.addClass(classes2);
		school.addClass(classes3);
		school.addClass(classes4);
		school.addClass(classes5);

////		System.out.println("- Number of classes: " + school.getClasses().size());
////		school.displayClassA();
////		System.out.println("\n- Number of students: " + school.getStudent().size());
////		school.displayStudentA();
////		System.out.println("\n- Number of teachers: " + school.getTeacher().size());
////		school.displayTeacherA();
//		

	}
}
