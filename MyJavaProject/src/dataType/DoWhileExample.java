package dataType;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String response;
		
		do {
			
			
			
			System.out.println("Do u want to continue?: Yes or No");
			response = sc.nextLine();
			
			if(response.equalsIgnoreCase("Yes")) {
				
				System.out.println("Hurayra");
			}
			else {
				
				break;
			}
		}
        while(true);
	}

}
