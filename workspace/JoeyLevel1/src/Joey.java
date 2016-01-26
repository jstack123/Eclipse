import javax.swing.JOptionPane;

public class Joey {
	int age = 12;
	String name = "Joey";

	public static void main(String[] args) {
		Joey joey = new Joey();
		System.out.println(joey.compareAge(5));
		System.out.println(joey.isMyBirthMonth("December"));
		System.out.println(joey.getName());
		JOptionPane.showMessageDialog(null, "Hello my name is " + joey.getName() + ".");
		String old = JOptionPane.showInputDialog("How old are you?");
		int number = Integer.parseInt(old);
		int difference = joey.compareAge(number);
		String or;
		if (difference < 0) {
			or = "younger";
		} else {
			or = "older";
		}
		difference = Math.abs(difference);
		JOptionPane.showMessageDialog(null, "Oh I am " + difference + " years " + or + " than you.");
	}

	public int compareAge(int anotherAge) {
		int difference = age - anotherAge;
		return difference;
	}

	String birthMonth = "April";

	public boolean isMyBirthMonth(String month) {
		if (birthMonth.equals(month)) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}
}