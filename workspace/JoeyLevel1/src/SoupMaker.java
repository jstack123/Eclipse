public class SoupMaker {
	public static void main(String[] args) {
		CupOfSoup soup = new CupOfSoup("ClamChowder");
		Kettle kettle = new Kettle();
		soup.makeSoup(kettle.getWater());
		kettle.boil();
		soup.makeSoup(kettle.getWater());
	}
	/* Make A Cup of Soup with the classes below */

}

class CupOfSoup {

	private String flavor;

	CupOfSoup(String flavor) {
		this.flavor = flavor;
	}

	void makeSoup(Kettle.Water hotWater) {
		if (hotWater.isHot())
			System.out.println("Making " + this.flavor + " flavored Cup of Soup");
		else
			System.out.println("Can't make a Cup of Soup with cold water! ");
	}
}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}
}