package sarah1;

// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {

	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String John="flying";
		String Jackson="strenth";
		String Joey="every superpower";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Xmen=JOptionPane.showInputDialog(null, "Type in either Joey, Jackson, or John, and see which has which superpower.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (Xmen.equals ("John")) {
	JOptionPane.showMessageDialog(null, "John's superpower is " +John+".");
	
}
if (Xmen.equals("Jackson")) {
	JOptionPane.showMessageDialog(null, "Jackson's superpower is " +Jackson+".");
}
if (Xmen.equals("Joey")) {
	JOptionPane.showMessageDialog(null, "Joey has "+Joey+" in the world.");
}

	}
}

