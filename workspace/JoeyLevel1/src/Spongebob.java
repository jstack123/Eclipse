
public class Spongebob {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		String name = spongebob.getName();
		System.out.println(name);
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		String name2 = patrick.getName();
		System.out.println(name2);
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("Squidward");
		String name3 = squidward.getName();
		System.out.println(name3);
		squidward.eat();
		squidward.laugh();
		SeaCreature mrkrabs = new SeaCreature("MrKrabs");
		String name4 = mrkrabs.getName();
		System.out.println(name4);
		mrkrabs.eat();
		SeaCreature sandy = new SeaCreature("Sandy");
		String name5 = mrkrabs.getName();
		System.out.println(name5);
		sandy.eat();
	}
}
