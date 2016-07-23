package src;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Knock Knock?");
			JOptionPane.showMessageDialog(null, "Who's There?");
		}
		JOptionPane.showMessageDialog(null, "Banana!");
		JOptionPane.showMessageDialog(null, ("Banana Who?"));
	}

}
