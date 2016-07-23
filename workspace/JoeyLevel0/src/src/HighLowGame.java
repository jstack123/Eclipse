package src;
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100 + 1);
		// 2. Print out the random variable above
		System.out.println(random);
		// 10. do the following 10 times
		for (int i = 0; i < 10; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String guess = JOptionPane
					.showInputDialog("Please guess a number.");
			// 4. convert the usersÕ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (number == random) {
				JOptionPane.showMessageDialog(null,
						"You got it correct! You win!");
			}
			// 6. win
			else if (number > random) {
				JOptionPane.showMessageDialog(null,
						"You guessed too high. Try again");
			}
			// 7. if the guess is high

			// 8. tell them it's too high
			else if (number < random) {
				JOptionPane.showMessageDialog(null,
						"You guessed to low. Try again");
			}
			// 9. if the guess is low
			// 10. tell them it's too low
		}
		JOptionPane.showMessageDialog(null, "Sorry you lost.");
		// 10. lose
	}
}
