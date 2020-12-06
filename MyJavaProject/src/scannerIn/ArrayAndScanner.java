package scannerIn;

import java.util.Scanner;

public class ArrayAndScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] asc = new int[5];

		System.out.print("Enter Value:    ");

		for (int i = 0; i < asc.length; i++) {

			asc[i] = input.nextInt();

			System.out.println("");

		}

	}

}
