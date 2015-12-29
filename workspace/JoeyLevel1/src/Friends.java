
public class Friends {
	public static void main(String[] args) {
		new Friends().getGoing();
	}

	private void getGoing() {
		Boy jim = new Boy("jim", 2);
		Boy aaron = new Boy("aaron", 1);
		Boy daniel = new Boy("daniel", 4);
		Boy chris = new Boy("chris", 24);
		Boy trent = new Boy("trent", 89);
		jim.cry();
		aaron.cry();
		daniel.cry();
		chris.cry();
		trent.cry();
	}

	public class Boy {
		String name;
		int age;
		int height;
		String run;

		private void cry() {
			System.out.println("My name is " + name + " and I'm crying.");
		}

		public Boy(String name, int age) {
			this.name = name;
			System.out.println("I'm constructing a " + name + " and he is " + age + " years old." + "");
			if (name.equals("trent")) {
				System.out.println("My name is trent and I feel bad that my name is trent.");
			}
		}
	}
}
