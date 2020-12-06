package toolsForJava;

import java.util.Scanner;



public class Main {
	
	static Scanner sc;
	static int empId;
	static String empName;
	static boolean ifContinue;

	public static void main(String[] args) {
		
		do {
			empInput();
			
			sc = new Scanner(System.in);
			
			do {
				System.out.println("Is this Id correct? YES/NO?");
				String response = sc.next();
				
				if(response.equalsIgnoreCase("Yes")) {
					
					System.out.println("Perfect");
					ifContinue = false;
					break;
				}
				else if(response.equalsIgnoreCase("No")) {
					
					
					System.out.println("Sorry Try with valid ID");
					ifContinue = true;
					break;
					
				}
				else {
					
					System.out.println("Incorrect Input , please enter Yes or No ");
				}	
			}
			while(true);
		}
		while(ifContinue == true);
		
		
		

	}
	
	public static void empInput() {

		
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Please Enter your Employee Id:   ");
        try {
        	empId = sc.nextInt();

			if (empId == 1) {

				empName = "Banik";
				break;
				
			} else if (empId == 2) {

				empName = "Rony";
				break;
				
			} else if (empId == 3) {

				empName = "Haque";
				break;
				
			} else if (empId == 4) {

				empName = "Imran";
				break;
				
			} else if (empId == 5) {

				empName = "Shivangi";
				break;
				
			} else 
			{
				System.out.println("Incorrect Employee ID");
			}
        }
		catch(Exception e) {
			
			System.out.println("Please enter Integer number only");
			
		}
			
		

			
		}
        while(true);
		
		System.out.println(empName);
	}

}
