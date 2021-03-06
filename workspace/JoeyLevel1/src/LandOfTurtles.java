import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		/* 1. Get the panel to show */
		panel.showPanel();
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		Random random = new Random();
		int maxX = panel.getWidth();
		int maxY = panel.getHeight();
		System.out.println("width" + maxX + "height" + maxY);
		int beachHeight = 275;
		for (int i = 0; i < 50; i++) {
			Turtle turtle = new Turtle();
			panel.addTurtle(turtle);
			turtle.setX(random.nextInt(maxX));
			turtle.setY(random.nextInt(beachHeight) + (maxY-beachHeight));
		}

		/* 4. Put 50 Turtles on the beach. */

	}
}
