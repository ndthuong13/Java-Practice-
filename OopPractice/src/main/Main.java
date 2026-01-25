package main;

import person.Person;
import rectangle.Rectangle;
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

	}
}
