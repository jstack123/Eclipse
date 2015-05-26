import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {

		// // Copyright Wintriss Technical Schools 2013
		// 1. have the tortoise start in the bottom left corner
		Tortoise.setX(10);
		Tortoise.setY(440);
		// Tortoise.moveTo(10, 440);
		// 2. draw a house of height 100 |**|_
		Tortoise.turn(90);
		Tortoise.setSpeed(10);
		drawHouse("Small", Color.ORANGE);
		drawHouse("Large", Color.BLUE);
		// 3. extract that into a method that takes height as a parameter
		//
		// 4. draw 9 houses of different heights
		drawHouse("medium", Color.RED);
		drawHouse("medium", Color.YELLOW);
		drawHouse("large", Color.BLACK);
		drawHouse("small", Color.MAGENTA);
		drawHouse("small", Color.BLUE);
		drawHouse("large", Color.CYAN);
		drawHouse("medium", Color.LIGHT_GRAY);
		// 5. make the method take a String instead of a height
		//
		// “small” 60
		// “medium” 120
		// “large” 250
		//
		// 6. make the method take a color

		// 7. make the grass (between houses) always green
		//
		// 8. give the houses peaked roofs
		//
		// 9. extract that into a method “drawPointyRoof” and “drawFlatRoof”
		//
		// 10. make large houses have flat rooves
		//
		// 11. make the roof type selection random

	}

	private static void drawHouse(String size, Color housecolor) {
		int height = 0;
		if (size.equalsIgnoreCase("small")) {
			height = 60;
		}
		if (size.equalsIgnoreCase("medium")) {
			height = 120;
		}
		if (size.equalsIgnoreCase("large")) {
			height = 250;
		}
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(10);
		Tortoise.setPenColor(housecolor);
		Tortoise.turn(270);
		Tortoise.move(height);
		if (size.equalsIgnoreCase("large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}

		Tortoise.move(height);
		Tortoise.turn(270);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(10);
	}

	private static void drawPointyRoof() {
		Tortoise.turn(55);
		Tortoise.move(60);
		Tortoise.turn(70);
		Tortoise.move(60);
		Tortoise.turn(55);
	}

	private static void drawFlatRoof() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
	}
}
