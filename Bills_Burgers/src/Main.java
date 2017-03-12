
public class Main {
//The purpose of this project is to help a ficticious company manage there hamburger shop
	
	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic","White", 3.56, "Sausage");
//		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.12);
		System.out.println("Total Price: " + hamburger.itemizeHamburger());
		
		Healthy_Burger healthy_hamburger = new Healthy_Burger(10.85, "Mushroom");
		healthy_hamburger.addHamburgerAddition1("Egg", 0.27);
		healthy_hamburger.addHamburgerAddition2("Secret Sauce", 0.75);
		System.out.println("Total Price: " + healthy_hamburger.itemizeHamburger());
		
		Deluxe_Burger deluxe_hamburger = new Deluxe_Burger();
		deluxe_hamburger.addHamburgerAddition1("should not add", 21.21);
		System.out.println("Total Price: " + deluxe_hamburger.itemizeHamburger());
	}

}
