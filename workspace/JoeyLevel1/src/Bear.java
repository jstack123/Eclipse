public class Bear {
	int numberOfFamilyMembers;
	String favoritePlace;

	Bear(int familyMembers, String place) {
		numberOfFamilyMembers = familyMembers;
		favoritePlace = place;
	}

	void swim() {
		System.out.println("I am swimming at the " + favoritePlace + "!");
	}

	void eat() {
		System.out.println("I am eating with my " + numberOfFamilyMembers
				+ " family members!");
	}

	public static void main(String[] args) {

		Bear bear = new Bear(6, "forest");
		bear.swim();
		bear.eat();

		Bear teddy = new Bear(0, "desert");
		teddy.swim();
		teddy.eat();
	}
}
