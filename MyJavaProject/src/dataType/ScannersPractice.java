package dataType;

import java.util.Scanner;

public class ScannersPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter Your Name Here--");

		String name = sc.nextLine();

		System.out.print("Please Enter Your Age Here--");

		byte age = sc.nextByte();

		System.out.print("Please Enter Price 1 Here--");

		double price1 = sc.nextDouble();

		System.out.print("Please Enter Price 2 Here--");

		double price2 = sc.nextDouble();

		System.out.println("My name is ---" + name);
		System.out.println("i am " + age + " years old");
		System.out.println("Total price is---$" + (price1 + price2));

	}

}
