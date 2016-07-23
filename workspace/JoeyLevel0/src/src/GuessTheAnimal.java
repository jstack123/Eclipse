package src;

import javax.swing.JOptionPane;

public class GuessTheAnimal {
	public static void main(String[] args) {

		String fourlegs = JOptionPane.showInputDialog("Does it have 4 legs");

		if (fourlegs.equals("yes")) {
			// JOptionPane.showMessageDialog(null, "It might be a pig.");
			String stripes = JOptionPane
					.showInputDialog("Does it have stripes?");
			if (stripes.equals("yes")) {
				JOptionPane.showMessageDialog(null, "It might be a zebra");
			} else {
				JOptionPane.showMessageDialog(null, "It might be a pig");
			}
		} else {
			String twolegs = JOptionPane.showInputDialog("Does it have 2 legs");
			if (twolegs.equals("yes")) {
				String fur = JOptionPane
						.showInputDialog("Is it covered in fur?");
				if (fur.equals("yes")) {
					JOptionPane
							.showMessageDialog(null, "It might be a monkey.");
				} else {
					JOptionPane.showMessageDialog(null, "It might be a bird.");
				}
			} else {
				String water = JOptionPane
						.showInputDialog("Does it live in water?");
				if (water.equals("yes")) {
					JOptionPane.showMessageDialog(null, "It might be a fish");
				} else {
					JOptionPane.showMessageDialog(null, "It might be a spider");
				}
			}

		}

	}
}
