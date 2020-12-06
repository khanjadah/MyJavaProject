package dataType;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;
		String name;
		long phone;

		System.out.print("Enter any number----");
		number = input.nextInt();

		System.out.print("Enter your Name---->");
		name = input.next();

		System.out.print("Enter your Phone Number------->");
		phone = input.nextLong();

	}

}
