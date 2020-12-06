package launch;

public class Thali {

	public static void lunchset() {
		proteins();
		carb();

	}

	public static void proteins() {

		String[] meat = new String[4]; // 0,1,2,3 (4 positions)
		meat[0] = "Chicken";
		meat[1] = "Lamb";
		meat[2] = "Beef";

		System.out.println("I want " + meat[2] + " for my protein");

	}

	public static void carb() {

		String[] rice = new String[3];
		rice[0] = "White rice";
		rice[1] = "Brown Rice";
		System.out.println("I want " + rice[1]);
	}

	public static void veg() {
		String veg = "Carrot";
		System.out.println("For my veg I want " + veg);
	}

}
