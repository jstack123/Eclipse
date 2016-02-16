
public class Dog {
	String size;
	String name;
	int age;
	String color;

	public Dog(int age, String color, String name, String size) {
		this.age = age;
		this.color = color;
		this.name = name;
		this.size = color;
	}

	void dogSprint() {
		System.out.println("The dog is sprinting.");
	}

	void dogJump() {
		System.out.println("The dog is jumping up around.");
	}
}
