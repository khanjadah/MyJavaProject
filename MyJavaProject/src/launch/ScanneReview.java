package launch;

import java.util.Scanner;

public class ScanneReview {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the item name.");
		String name = sc.nextLine();

		System.out.println("Please enter the price.");
		double price = sc.nextDouble();

		System.out.println("Please enter the quantity.");
		int quantity = sc.nextInt();

		System.out.println("Your total is $" + (price * quantity));

	}

}
