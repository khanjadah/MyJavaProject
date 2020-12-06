package holidaySecond;

public class AppetizersMenu {

	public static void appetizers() {

		String[] appetizer = new String[5];

		appetizer[0] = "Wings";
		appetizer[1] = "Onion Ring";
		appetizer[2] = "Chicken Mushroom";
		appetizer[3] = "Crab Cake";
		appetizer[4] = "Chilli Beaf";

		System.out.println("_____________________________________________________");

		System.out.println("I like to take   " + appetizer[4] + " & " + appetizer[1] + "\n");

		price();
	}

	public static void price() {

		double[] prices2 = new double[5];

		prices2[0] = 16.50;
		prices2[1] = 6.45;
		prices2[2] = 12.70;
		prices2[3] = 8.30;
		prices2[4] = 9.30;

		System.out.println("My Total price ----$" + (prices2[4] + prices2[1]));

	}

}
