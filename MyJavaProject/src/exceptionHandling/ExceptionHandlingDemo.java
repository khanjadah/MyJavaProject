package exceptionHandling;


/*  An exception is run time error.
An exception is an abnormal condition that arises in a code sequence at run time.

The exception handling  is of the powerful mechanism to handle the runtime errors.
Exception handling is managed by 5 keywords-
1)try .
2)catch.
3)finally.
4)throw.
5)throws. */

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 0;
			int result = x/y;
			
			System.out.println("Result :   "+result);
			
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Exception :  "+e); //Here we can use multiple catch.
			}catch(ArithmeticException e2) {
				
				System.out.println("Exception  :  "+e2);
			}
		
		finally {
			System.out.println("Last line of the  program ");//Finally keyword is use for , if catch is not working but anyhow we run our code for next level.
		}
		
		
		
		

	}

}
