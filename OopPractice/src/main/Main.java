package main;

import person.Person;
import rectangle.Rectangle;
import school.Classes;
import school.School;
import school.Student;
import school.Teacher;
import student.StudentManager;
import trafficLight.TrafficLight;
import java.time.LocalDate;
import java.time.LocalTime;

import airplane.Airplane;
import animal.Dog;
import book.BookManager;
import circle.Circle;
import employee.Employee;
import employee.NewEmployee;
import inventory.Inventory;
import library.Library;
import bank.Bank;

public class Main {

	public static void main(String[] args) {

		// Person - Question 1
		Person personA = new Person("Nguyen Dinh Thuong", 22);
		Person personB = new Person("Le Vo Khoi Nguyen", 22);
		System.out.println(personA);
		System.out.println(personB);

		// Animal_Dog - Question 2
		Dog dogA = new Dog();
		dogA.setName("Vu Tung Duong");
		dogA.setBreed("Corgi");
		System.out.println(dogA);

		// Rectangle - Question 3
		Double width = 4.0;
		Double height = 5.0;
		Rectangle rec = new Rectangle();
		Double area = rec.area(width, height);
		Double peri = rec.perimeter(width, height);
		System.out.println("\nArea: " + area);
		System.out.println("Perimeter: " + peri);

		// Circle - Question 4
		Double r = 3.0;
		Circle cir = new Circle();
		Double A = cir.Area(r);
		Double C = cir.Circumference(r);
		System.out.printf("\nArea: %.2f", A);
		System.out.printf("\nCircumference: %.2f", C);

		// Book - Question 5
		System.out.println("\n");
		String title = "Harry Potter";
		String author = "J.K.Rowling";
		String ISBN = "9788869183157";

		BookManager bookManager = new BookManager();
		bookManager.addBook(title, author, ISBN);
		bookManager.listBook();

		// Employee - Question 6
		System.out.println("\n");
		String name = "Nguyen Dinh Thuong";
		String job = "Software Developer";
		String titleEmployee = "Internship";
		float salary = 5000000;
		float percentageSalary = 15;

		Employee emp = new Employee(name, job, titleEmployee, salary);
		System.out.println(emp);
		emp.salaryCalculate(salary);

		System.out.println("\nAfter update the salary: ");
		emp.updateSalary(percentageSalary);
		System.out.println(emp);

		// Bank - Question 7
		System.out.println("\n");
		String accName = "Tran Quoc Toan";
		String accNumber = "726286823";
		float deposit = 10000000;
		float withdraw = 2000000;

		Bank bank = new Bank();
		bank.addAccount(accName, accNumber, deposit, withdraw);
		bank.removeAccount(accName, accNumber, deposit, withdraw);
		bank.showAccountDetail();

		// Question 8 - Traffic Light
		System.out.println("\n");
		TrafficLight tl = new TrafficLight("red", 60);
		tl.display();
		System.out.println("\nChange color to Yellow: ");
		tl.changeColor("yellow", 2);
		System.out.println("Is red: -> " + tl.isRed());
		System.out.println("Is yellow: -> " + tl.isYellow());
		System.out.println("Is green: -> " + tl.isGreen());

		// Employee - Question 9
		System.out.println("\n");
		LocalDate hireDate = LocalDate.parse("2022-12-25");
		NewEmployee ne = new NewEmployee("Nguyen Dinh Thuong", 5000000, hireDate);
		ne.detail();
		int yos = ne.yearOfService(hireDate);
		System.out.println("Worked for: " + yos + " years");

		// Student - Question 10
		System.out.println("\n");
		StudentManager stm = new StudentManager();
		stm.addStudent("Nguyen Van Thanh", "KHMT01", "K17");
		stm.addStudent("Nguyen Quan Hai", "KHMT01", "K18");
		stm.display();
		System.out.println("Detele student information: " + "Nguyen Van Thanh");
		stm.removeStudent("Nguyen Van Thanh");
		stm.display();

		// Library - Question 11
		System.out.println("\n");
		Library library = new Library();
		library.addBook(title, author, ISBN);
		library.addBook("Clean Code", "Robert C.Martin", "9780132350884");
		library.addBook("Clean CodeA", "Robert C.MartinA", "9780132350884A");
		library.addBook("Clean CodeB", "Robert C.MartinB", "9780132350884B");
		library.addBook("Clean CodeC", "Robert C.MartinC", "9780132350884C");
		library.display();
		System.out.println("\nRemove a book: ");
		library.removeBook("Clean CodeB", "Robert C.MartinB", "9780132350884B");
		library.display();

		// Airplane - Question 12
		System.out.println("\n");
		Airplane airplane = new Airplane("001", "Hong Kong", LocalTime.parse("10:35:40"), 0);
		airplane.flightStatus();
		int delayTime = 30;
		airplane.delayTime(delayTime);
		airplane.flightStatus();

		// Inventory - Question 13
		System.out.println("\n");
		Inventory inv = new Inventory();
		inv.addProduct("Laptop", "15");
		inv.addProduct("Mouse", "45");
		inv.addProduct("Keyboard", "10");
		inv.addProduct("Monitor", "23");
		inv.addProduct("Printer", "42");
		inv.display();

		System.out.println("Remove randome product: ");
		inv.removeProduct("Laptop");
		inv.display();

		// School - Question 14
		System.out.println("\n");
		School school = new School();

		Student student1 = new Student("Nguyen Dinh Thuong", 15);
		Student student2 = new Student("Tran Thi Mai", 17);
		Student student3 = new Student("Le Quang Huy", 18);
		Student student4 = new Student("Pham Minh Duc", 19);
		Student student5 = new Student("Hoang Thu Trang", 20);

		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);

		Teacher teacher1 = new Teacher("Nguyen Van Hung", "Math");
		Teacher teacher2 = new Teacher("Tran Thi Lan", "Physics");
		Teacher teacher3 = new Teacher("Le Quang Minh", "Chemistry");
		Teacher teacher4 = new Teacher("Pham Thu Ha", "Biology");
		Teacher teacher5 = new Teacher("Hoang Van Nam", "English");

		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		school.addTeacher(teacher3);
		school.addTeacher(teacher4);
		school.addTeacher(teacher5);

		Classes classes1 = new Classes("Math", teacher1);
		classes1.addStudent(student1);
		classes1.addStudent(student2);
		classes1.addStudent(student3);
		classes1.addStudent(student5);

		Classes classes2 = new Classes("Physics", teacher2);
		classes2.addStudent(student1);
		classes2.addStudent(student2);
		classes2.addStudent(student3);
		classes2.addStudent(student5);

		Classes classes3 = new Classes("Chemistry", teacher3);
		classes3.addStudent(student1);
		classes3.addStudent(student2);
		classes3.addStudent(student3);
		classes3.addStudent(student5);

		Classes classes4 = new Classes("Biology", teacher4);
		classes4.addStudent(student1);
		classes4.addStudent(student2);
		classes4.addStudent(student3);
		classes4.addStudent(student5);

		Classes classes5 = new Classes("English", teacher5);
		classes5.addStudent(student1);
		classes5.addStudent(student2);
		classes5.addStudent(student3);
		classes5.addStudent(student5);

		school.addClass(classes1);
		school.addClass(classes2);
		school.addClass(classes3);
		school.addClass(classes4);
		school.addClass(classes5);

		System.out.println("School information: ");
		System.out.println("Number of Class: " + school.getClasses().size());
		System.out.println("Number of Teacher: " + school.getTeacher().size());
		System.out.println("Number of Student: " + school.getStudent().size());
		
		System.out.println("\n");
		System.out.println("Math class information: ");
		System.out.println("Class name: " + classes1.getClassName());
		System.out.println("Teacher name: " + classes1.getTeacher());
		System.out.println("Number of Student: " + classes1.getStList().size());
		System.out.println("List of Student: ");
		classes1.displayStudent();
		
//		System.out.println("\n");
//		System.out.println("Physic class information: ");
//		System.out.println("Class name: " + classes2.getClassName());
//		System.out.println("Teacher name: " + classes2.getTeacher());
//		System.out.println("Number of Student: " + classes2.getStList().size());
//		
//		System.out.println("\n");
//		System.out.println("Chemistry class information: ");
//		System.out.println("Class name: " + classes3.getClassName());
//		System.out.println("Teacher name: " + classes3.getTeacher());
//		System.out.println("Number of Student: " + classes3.getStList().size());
//
//		System.out.println("\n");
//		System.out.println("Biology class information: ");
//		System.out.println("Class name: " + classes4.getClassName());
//		System.out.println("Teacher name: " + classes4.getTeacher());
//		System.out.println("Number of Student: " + classes4.getStList().size());
//
//		System.out.println("\n");
//		System.out.println("English class information: ");
//		System.out.println("Class name: " + classes5.getClassName());
//		System.out.println("Teacher name: " + classes5.getTeacher());
//		System.out.println("Number of Student: " + classes5.getStList().size());
//		
		school.removeClass(classes1);
		school.removeStudent(student5);
		school.removeTeacher(teacher1);
		
		System.out.println("\nSchool information: ");
		System.out.println("Number of Class: " + school.getClasses().size());
		System.out.println("Number of Teacher: " + school.getTeacher().size());
		System.out.println("Number of Student: " + school.getStudent().size());
		
		
		
	}
}
