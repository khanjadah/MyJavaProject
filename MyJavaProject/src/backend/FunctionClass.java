package backend;

import java.util.Scanner;

/*if & else - we use to give direction to our code, code can have multiple choices. We have to direct our 

if (condition){

what to do if condition is met.
}
else if (condition)

What to do else if condition is met.

else if (condition){

What to do else if condition is met AS MANY AS NEDDED.
}
   else{
   
   what to do if not met any condition at last. 
   }
--------------------------------------------------------
RULES-
1.We need atleast one IF
2. Else if and Else are on need basis 
3.Else does not require any condition.
4.ELse if can be used as many times as needed. 

----
Public- is a access modifier. It means how the variable or anything can be accessed.
Public-can be accessed by all packages and class 
Private- can be accessed by the same class only
Protected-
Default- when no access modifier is given 

---------
Static- means that the value belongs to the class.
        If its not static, we have to create an object of the class to use the function or variable. 
        Static methods can be accessed by calling the package and class name.
        Non-Static methods needs an object to be created. 
        Static method can be accessed in non static way (not recommended)
        but Non Static method cannot be accessed in a static way.
------------
==  :means its checking if its true or false. 
=   : assigning 
------------
Loop-is to do something over and over again  based on a condition. 
While loop-
Do While loop-
For loop-
For each loop-  

*/
public class FunctionClass {

	static String empName;
	String custName;
	static int empId;
	double[] product = new double[10];
	double discount;
	double tax;
	double subTotal;
	double total;
	static double[] price = new double[10];

	static Scanner sc;

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

			} catch (Exception e) {

				System.out.println("Please enter only Integer Number :");
			}
		}

		while (true);

		System.out.println(empName);
	}

	public static void priceInput() {

		do {

			try {
				sc = new Scanner(System.in);

				System.out.print("Please enter price 1 :  ");
				price[0] = sc.nextDouble();

				if (price[0] > 0 && price[0] <= 5000) {
					break;

				} else {
					System.out.println("Incorrect input please enter Less then 5000$ :");
				}

			} catch (Exception e) {

				System.out.println("Incorrect input, please enter number only...");
			}
		}

		while (true);
		do {

			try {
				sc = new Scanner(System.in);

				System.out.print("Please enter price 2 : ");
				price[1] = sc.nextDouble();

				if (price[0] > 0 && price[0] <= 5000) {
					break;

				} else {
					System.out.println("Incorrect input please enter Less then 5000$ :");
				}

			} catch (Exception e) {

				System.out.println("Incorrect input, please enter number only...");
			}
		}

		while (true);

		do {

			try {
				sc = new Scanner(System.in);

				System.out.print("Please enter price 3 : ");
				price[2] = sc.nextDouble();

				if (price[0] > 0 && price[0] <= 5000) {
					break;

				} else {
					System.out.println("Incorrect input please enter Less then 5000$ :");
				}

			} catch (Exception e) {

				System.out.println("Incorrect input, please enter number only...");
			}
		}

		while (true);

	}

	public static double subTotal() {

		return price[0] + price[1] + price[2];
	}

	public static double discount() {

		if (subTotal() > 100) {

			double discount = subTotal() * 0.10;
			return discount;
			
		} else if (subTotal() > 500) {

			double discount = subTotal() * 0.30;
			return discount;
			
		} else if (subTotal() > 1000) {

			double discount = subTotal() * 0.50;
			return discount;
		} 
		else {

			double discount = subTotal() * 0.05;
			return discount;
		}
	}

	public static double tax() {

		double tax = subTotal() * 0.0875;
		return tax;

	}

	public static double total() {

		double total = subTotal() + tax() - discount();
		return total;
	}

}
