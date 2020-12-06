package holiday;

public class Menu {

	public static void drink() {

		String[] drink = new String[4];

		drink[0] = "Lichi martini";
		drink[1] = "Mixed Coctail";
		drink[2] = "Beer";
		drink[3] = "Wine";

		System.out.println("              -::Happy Hour Slae::- ");

		System.out.println("---------------- Drinks  Are Hot ------------------" + "\n" + "\n" + drink[0] + "------"
				+ drink[1] + "------" + drink[2] + "-----" + drink[3] + "." + "\n");

		price();

	}

	public static void price() {

		// scanner numberInput = new scanner(System.in)
		double[] prices1 = new double[4];

		prices1[0] = 6.50;
		prices1[1] = 8.45;
		prices1[2] = 4.00;
		prices1[3] = 8.30;

		System.out.println(" I am going to Take ---$" + prices1[2] + " " + "Drink");

	}

}
	
	

