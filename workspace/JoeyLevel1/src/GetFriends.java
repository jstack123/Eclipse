import javax.swing.JOptionPane;

public class GetFriends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate Kanvar = new Classmate();
		Classmate Drew = new Classmate();
		Classmate Keith = new Classmate();
		Classmate Toby = new Classmate();
		Classmate Melissa = new Classmate();
		Classmate Sherlin = new Classmate();
		// 4. set descriptions for each Classmate
		Kanvar.setdescription(
				"He LOVES Star Wars. Kanvar likes tasering Toby and pretzels. Kanvar is somehow in my class and not in second grade.");
		Toby.setdescription(
				"He has a great Monday shirt, which says Vegan, Vegetarian, and Meatarian. Toby is also addicted to video games.");
		Drew.setdescription(
				"He is going to the University of Michigan for college. Drew is at CCA right now. He also likes jeans. ");
		Melissa.setdescription("She loves Justin Bieber and music. She likes streching");
		Sherlin.setdescription(
				"She likes ponytails. She likes checking her emails and texts. She loves to check her typing speed.");
		Keith.setdescription("He likes oats and honey bars. He got a new Hyundai today and he likes computers.");
		// 5. Use your getter to print out each description

		String k = Kanvar.getdescription();
		String t = Toby.getdescription();
		String d = Drew.getdescription();
		String m = Melissa.getdescription();
		String s = Sherlin.getdescription();
		String ke = Keith.getdescription();

		JOptionPane.showMessageDialog(null, (k));
		JOptionPane.showMessageDialog(null, (t));
		JOptionPane.showMessageDialog(null, (d));
		JOptionPane.showMessageDialog(null, (s));
		JOptionPane.showMessageDialog(null, (s));
		JOptionPane.showMessageDialog(null, (ke));
	}

}

class Classmate {
	String description;

	// 1. create a setter that sets a description for this person
	void setdescription(String description) {
		this.description = description;
	}

	// 2. create a getter that gets a description of this person
	String getdescription() {
		return description;
	}
}
