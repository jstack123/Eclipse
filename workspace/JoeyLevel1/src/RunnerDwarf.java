
public class RunnerDwarf {
	public static void main(String[] args) {
		// Sleepy
		Dwarf sleepy = new Dwarf("Sleepy");
		sleepy.eat();
		System.out.println(sleepy.getName());
		// Dopey
		Dwarf dopey = new Dwarf("Dopey");
		System.out.println(dopey.getName());
		System.out.println(dopey.getBeard());
		System.out.println(dopey.hasGlasses());
		// Doc
		Dwarf doc = new Dwarf("Doc");
		System.out.println(doc.getName());
		System.out.println(doc.getBeard());
		System.out.println(doc.hasGlasses());
	}
}
