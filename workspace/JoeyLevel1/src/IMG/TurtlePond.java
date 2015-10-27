package IMG;

import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class TurtlePond implements KeyEventDispatcher {

	// 1. Set a location for the food
	Random random = new Random();

	int cookieX = random.nextInt(500);
	int cookieY = random.nextInt(500);

	// 2. Choose the speed you want the Tortoise to go at
	int speed = 10;

	void setup() {
		// 3. Add an intro message to tell the user what to do
		JOptionPane
				.showMessageDialog(
						null,
						"You are the turtle. Find the food in less than 20 seconds or you die of hunger. When the background is yellow, you are 100 pixels away. When the background is orange, you are 50 pixels away. WHen the background is red, you are 20 pixels away. When you find the cookie you win. Have Fun! Press Enter to continue!");
		// 4. For debugging purposes, show the food
		showFood();
	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left (3 lines of code)
		Tortoise.turn(-90);
		Tortoise.move(speed);
		Tortoise.turn(90);
	}

	private void goRight() {
		// 6. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(-90);

	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the
		// background color to yellow
		if (Math.abs(tortoiseLocationX - cookieX) < 100
				&& Math.abs(tortoiseLocationY - cookieY) < 100) {
			Tortoise.getBackgroundWindow().setBackground(Color.YELLOW);
		}
		// 8. If the Tortoise is within 50 pixels of the food, set the
		// background color to orange
		if (Math.abs(tortoiseLocationX - cookieX) < 50
				&& Math.abs(tortoiseLocationY - cookieY) < 100) {
			Tortoise.getBackgroundWindow().setBackground(Color.ORANGE);
		}
		// 9. If the Tortoise is within 20 pixels of the food, set the
		// background color to red
		if (Math.abs(tortoiseLocationX - cookieX) < 20
				&& Math.abs(tortoiseLocationY - cookieY) < 20) {
			Tortoise.getBackgroundWindow().setBackground(Color.RED);
		}
		// 10. If tortoise is within 5 pixels of the cookie, make a pop-up to
		// tell them they found it
		if (Math.abs(tortoiseLocationX - cookieX) < 5
				&& Math.abs(tortoiseLocationY - cookieY) < 5) {
			JOptionPane.showMessageDialog(null,
					"AMAZING! You have found the COOKIE!");
		}
		// 11. If the Tortoise crosses it's own path, move them back to the
		// beginning
		// if (Math.abs(tortoiseLocationX )) {

		// 12. If more than 20 seconds have elapsed, tell them the turtle died
		// of hunger
		if (getTimeElapsed() == 20) {
			JOptionPane.showMessageDialog(null,
					"The turtle has died of hunger! YOU FAILED!");
			System.exit(0);
		}
	}

	private long getTimeElapsed() {
		Date currentTime = new Date();
		return (currentTime.getTime() - startTime.getTime()) / 1000;
	}

	void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void hideFood() {
		window.remove(component);
	}

	private void showFood() {
		// If the food doesn't show up, make sure you are on Java 1.6
		component.setLocation(cookieX, cookieY);
		window.add(component);
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	TurtlePanel window = Tortoise.getBackgroundWindow();
	Label component = new Label("*");
	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(Colors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(Colors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}
