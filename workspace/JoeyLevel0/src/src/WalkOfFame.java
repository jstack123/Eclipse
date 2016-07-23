package src;
// Copyright Wintriss Technical Schools 2014
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge. A solution
 * is printed in the red curriculum folder.
 */

public class WalkOfFame {

	public static void main(String[] args) {
int size = 30;
		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(100);
		Tortoise.show();
		// 2. Make the Tortoise draw a star shape. Hint: 144.
for (int i = 0; i < 50; i++) {
	 Random rand = new Random();
	for (int t = 0; t < 5; t++) {
		Tortoise.setSpeed(10);
		Tortoise.move(size);
		Tortoise.turn(144);
	}
	Tortoise.penUp();
	Tortoise.turn(90);
	Tortoise.move(size);
	Tortoise.turn(270);
	Tortoise.move(2);
	Tortoise.penDown();
	

	for (int r = 0; r < 5; r++) {
		
		Tortoise.setSpeed(10);
		Tortoise.move(size);
		Tortoise.turn(144);
	
}
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://postimg.org/image/40rsesa8h/
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
