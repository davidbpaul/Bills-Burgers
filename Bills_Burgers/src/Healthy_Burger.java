
public class Healthy_Burger extends Hamburger{
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public Healthy_Burger(double price, String meat) {
		super("Healthy Burger", "Brown rye", price, meat);
	
	}
	public void addHealthAddition1(String name, double price){
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}
	public void addHealthAddition2(String name, double price){
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}
	public double itemizeHamburger() {
		double hamburgerPrice = super.itemizeHamburger();
		if(this.healthyExtra1Name != null){
			hamburgerPrice += this.healthyExtra1Price ;
			System.out.println("Added " + this.healthyExtra1Name + " for an Extra " + this.healthyExtra1Price );
		}
		if(this.healthyExtra2Name != null){
			hamburgerPrice += this.healthyExtra2Price ;
			System.out.println("Added " + this.healthyExtra2Name  + " for an Extra " + this.healthyExtra2Price );
		}
		return hamburgerPrice;
	}
	
	
}
