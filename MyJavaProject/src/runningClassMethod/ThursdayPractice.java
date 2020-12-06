package runningClassMethod;

public class ThursdayPractice {

	public static void clothing() {

		// int number = 10;

		String[] cloths = new String[10];

		cloths[0] = "T-shirt";
		cloths[1] = "Pant";
		cloths[2] = "Bra";
		cloths[3] = "Hat";
		cloths[4] = "Socks";
		cloths[5] = "Underware";
		cloths[6] = "Burkha";
		cloths[7] = "Trowser";
		cloths[8] = "Cap";
		cloths[9] = "Jacket";

		System.out.println("KMart is selling  " + cloths[1]);
		System.out.println("KMart is having sale on   " + cloths[3] + "    And    " + cloths[7] + "\n"
				+ "__________________________________________");

	}

	public static void price() {

		double[] prices = new double[10];

		prices[0] = 30.30;
		prices[1] = 23.99;
		prices[2] = 12.39;
		prices[3] = 50.00;
		prices[4] = 7.99;
		prices[5] = 25.65;
		prices[6] = 99.99;
		prices[7] = 65.45;
		prices[8] = 35.56;
		prices[9] = 189.89;

		System.out.println("I am going to purchase Bras,Hat and T-shirt");
		System.out.println("Total is going to be $"
				+ (prices[2] + prices[3] + prices[0] + "\n" + "_________________________________________"));

	}

}
