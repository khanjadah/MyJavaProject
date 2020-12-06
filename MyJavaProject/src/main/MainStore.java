package main;

import java.util.Scanner;
import backend.FunctionClass;
import backend.Intro;

/*If introduction method are not static , we have to create object for calling
 those method or function. call with variable name

 Intro in = new Intro();
 in.introduction();*/

public class MainStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Intro in = new Intro();// create an object of class.

		boolean ifCondition = false;

		do {
			
			FunctionClass.empInput();
			sc = new Scanner(System.in);
			
			do {
				
				System.out.println("Is this Employee ID is Correct?: Yes or No?");
				String response = sc.nextLine();

				if (response.equalsIgnoreCase("No")) {
					
					ifCondition = true;
					break;

				} else if (response.equalsIgnoreCase("Yes")) {
					
					ifCondition = false;
					break;
					
				} else {

					System.out.println("Error:  Incorrect Input ! Please enter YES/NO :@ ");
				}

			} while (true);

		} while (ifCondition == true);

		FunctionClass.priceInput();
		FunctionClass.subTotal();
		FunctionClass.discount();
		
		
		
		
		System.out.println("Your total is :  "+FunctionClass.total());
		
		Intro.end();

	}

}
