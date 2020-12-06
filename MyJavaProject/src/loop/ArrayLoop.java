package loop;

public class ArrayLoop {

	public static void main(String[] args) {

		String[] name = new String[5];
		name[0] = "Faria";
		name[1] = "Rakib";
		name[2] = "Banik";
		name[3] = "Rokea";
		name[4] = "Tanzela";

		System.out.println("Total person---------   " + name.length);

		for (int i = 0; i < 5; i++) {

			System.out.println(name[i]);

		}

		forEachLoop();

	}

	public static void forEachLoop() {

		String[] name = { "Faria", "Rakib", "Banik", "Rokea", "Tanzela" };

		for (int i = 0; i < 5; i++) {

			System.out.println(name[i]);

		}
	}

}
