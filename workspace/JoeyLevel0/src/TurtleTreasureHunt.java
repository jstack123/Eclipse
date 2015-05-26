package src;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;
	int shift = 3;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
		Tortoise.move(shift);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(shift);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(270);
		Tortoise.move(shift);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(shift);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		if (tortoiseLocationX > 497 && tortoiseLocationX < 578
				&& tortoiseLocationY < 348 && tortoiseLocationY > 297) {
			JOptionPane
					.showMessageDialog(null,
							"Hello! You found me! Next clue: Find a dangerous and metal thingie!");
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		if (tortoiseLocationX > 398 && tortoiseLocationX < 437
				&& tortoiseLocationY > 234 && tortoiseLocationY < 333) {
			JOptionPane
					.showMessageDialog(
							null,
							"ARRRRRRRRRRRR! How did you find me?! Next clue: Go on and find something that flies!");
		}

		if (tortoiseLocationX > 407 && tortoiseLocationX < 440
				&& tortoiseLocationY > 84 && tortoiseLocationY < 120) {
			JOptionPane
					.showMessageDialog(null,
							"Caw! Caw! Darn, you found me!  Next clue: Find something that swims!");

		}
		if (tortoiseLocationX > 314 && tortoiseLocationX < 338
				&& tortoiseLocationY > 396 && tortoiseLocationY < 420) {
			JOptionPane
					.showMessageDialog(
							null,
							"Gulp! Gulp! Come on! Why did you find me? Next clue: Find something with a type of hat!");

		}
		if (tortoiseLocationX > 131 && tortoiseLocationX < 155
				&& tortoiseLocationY > 270 && tortoiseLocationY < 339) {
			JOptionPane.showMessageDialog(null,
					"Hi! You have finished the tresure hunt! Great job!");

		}
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"http://s30.postimg.org/oi69jth7l/fetch1.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane
				.showMessageDialog(null,
						"Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
