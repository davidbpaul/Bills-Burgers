
public class Hamburger {
	private String name;
	private String bread;
	private double price;
	private String meat;
	
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	
	
	
	public Hamburger(String name, String bread, double price, String meat) {
		this.name = name;
		this.bread = bread;
		this.price = price;
		this.meat = meat;
	}
	
	public void addHamburgerAddition1(String name, double price){
		this.addition1Name = name;
		this.addition1Price = price;
	}
	public void addHamburgerAddition2(String name, double price){
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addHamburgerAddition3(String name, double price){
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addHamburgerAddition4(String name, double price){
		this.addition4Name = name;
		this.addition4Price = price;
	}
	public double itemizeHamburger(){
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger " + " on a " + this.bread + " roll with " + this.meat + " price is " + hamburgerPrice);
		
		if(this.addition1Name != null){
			hamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an Extra " + this.addition1Price);
		}
		if(this.addition2Name != null){
			hamburgerPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an Extra " + this.addition2Price);
		}
		if(this.addition3Name != null){
			hamburgerPrice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an Extra " + this.addition3Price);
		}
		if(this.addition4Name != null){
			hamburgerPrice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an Extra " + this.addition4Price);
		}
		return hamburgerPrice;
		
	}
	

	
	
	
}
