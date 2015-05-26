package src;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friends can read it.
 * 
 * Toolbox: String variables, main() method, JOptionPane.showInputDialog,
 * JOptionPane.showMessageDialog, String.equals, if statement
 */

public class SecretMessageSystem {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You only get three tries.");

		String password = JOptionPane.showInputDialog("What is the password?");

		String message = JOptionPane.showInputDialog("What is the message?");

		for (int i = 0; i < 3; i++) {

			String guess = JOptionPane.showInputDialog("Tell me the password?");

			if (password.equals(guess)) {
				JOptionPane.showMessageDialog(null, message);
				break;
			} else {
				if (i < 2) {
					JOptionPane.showMessageDialog(null,
							"Wrong password. Please try again.");
				} else {
					JOptionPane
							.showMessageDialog(null, "You are out of tries.");
				}
			}

		}
	}
}
