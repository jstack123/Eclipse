
public class IceCreamSundae {
	int scoops;
	boolean CupOrCone;
	String flavor;
	String toppings;

	public static void main(String[] args) {
		IceCreamSundae creamy = new IceCreamSundae(2, true, "dsaf", "asdf");
	}

	public IceCreamSundae(int scoops, boolean CupOrCone, String flavor, String toppings) {
		this.scoops = scoops;
		this.CupOrCone = CupOrCone;
		this.flavor = flavor;
		this.toppings = toppings;
	}
}
