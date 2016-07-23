package src;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SlaveTortoise {
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		String color = JOptionPane.showInputDialog("What color do you want?");
		// String color =
		// JOptionPane.showInputDialog("What color do you want?");
		Tortoise.setPenColor(Color.getColor(color));
		// Tortoise.setPenColor(Color.getColor(color));
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("green")) {
			Tortoise.setPenColor(Color.green);
		}
		if (color.equals("yellow")) {
			Tortoise.setPenColor(Color.yellow);
		}
		if (color.equals("orange")) {
			Tortoise.setPenColor(Color.orange);
		}
		if (color.equals("gray")) {
			Tortoise.setPenColor(Color.gray);
		}
		if (color.equals("gray")) {
			Tortoise.setPenColor(Color.gray);
		}
		if (color.equals("black")) {
			Tortoise.setPenColor(Color.black);
		}
		if (color.equals("magenta")) {
			Tortoise.setPenColor(Color.magenta);
		}
		if (color.equals("white")) {
			Tortoise.setPenColor(Color.white);
		}
		if (color.equals("pink")) {
			Tortoise.setPenColor(Color.pink);
		}
		if (color.equals("cyan")) {
			Tortoise.setPenColor(Color.cyan);
		}
		if (color.equals("lightGray")) {
			Tortoise.setPenColor(Color.lightGray);
		}

		Tortoise.setSpeed(10);
		Tortoise.show();
		if (shape.equals("square")) {
			drawSquare(50);
		} else if (shape.equals("triangle")) {
			drawTriangle(200);

		} else {
			drawCircle(10);
		}

	}

	private static void drawCircle(int size) {

		int turn = 100;
		for (int i = 0; i < turn; i++) {
			Tortoise.move(size);
			Tortoise.turn(360.0 / turn);

		}
	}

	private static void drawTriangle(int size) {
		for (int i = 0; i < 3; i++) {

			Tortoise.move(size);
			Tortoise.turn(360 / 3);
		}
	}

	private static void drawSquare(int size) {
		for (int i = 0; i < 4; i++) {

			Tortoise.move(size);
			Tortoise.turn(90);

		}
	}

}
