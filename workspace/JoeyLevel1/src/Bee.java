
public class Bee {
	static boolean attackTheWasp;

	public static void main(String[] args) {
		Bee bee = new Bee();
		Bee bee2 = new Bee();
		Bee bee3 = new Bee();
		bee.attackTheWasp = true;
		System.out.println(bee.attackTheWasp);
		System.out.println(bee2.attackTheWasp);
		System.out.println(bee3.attackTheWasp);
	}

}
