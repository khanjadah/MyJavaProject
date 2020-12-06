package toolsForJava;

public class StaticPractice {

	String name;
	int id;
	static String universityName = "Laguadia College.";

	StaticPractice(String n, int i) {

		name = n;
		id = i;

	}

	void displayInformation() {

		System.out.println("Name    :" + name + "\n");
		System.out.println("ID    :" + id + "\n");
		System.out.println(
				"University Name :---->   " + universityName + "\n" + "___________________________________________");
	}

}
