
public class Deluxe_Burger extends Hamburger {

	public Deluxe_Burger() {
		super("Deluxe", "White", 100.00, "Gold Flaked Bugs");
		super.addHamburgerAddition1("Chips", 2.44);
		super.addHamburgerAddition2("energy drink", 0.12);
	}

	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add additional items to deluxe burger");
	}

	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add additional items to deluxe burger");
	}

	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add additional items to deluxe burger");
	}

	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add additional items to deluxe burger");
	}
	

}
