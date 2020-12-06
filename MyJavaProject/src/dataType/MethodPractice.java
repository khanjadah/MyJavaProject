package dataType;

public class MethodPractice {

	public static void main(String[] args) {

		// variables outside method are called global variables
		// available to all methods inside class

		// Java is a programming language which is based on Object Oriented Programming.
		// It is not 100% OOP because of primitive data types.
		// It follows 4 pillars- Encapsulation, Inheritance, Abstraction, Polymorphism.

		// variables inside method are called local variables

		neha(); // calling method

	}

	public static void neha() {

		System.out.println("my name is neha");
		age();// calling method inside method
	}

	public static void age() {

		System.out.println("i am 15 years old");
	}
}
