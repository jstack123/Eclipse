package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;

public class Box {
	Color color;
	int width;
	int height;
	int x;
	int y;
	int speedX;
	int speedY;
	boolean alive;

	public Box(Color color, int width, int height, int x, int y, int speedX, int speedY, boolean alive) {
		this.color = color;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY=speedY;
		this.alive = alive;
	}

	public boolean isAlive(boolean alive) {
		return alive;
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
		g.drawRect(x, y, width, height);
	}

	public void update() {
		x = x + speedX;
		y=y+speedY;
	}

	public void boundaryCheck() {
		if (x > 450) {
			speedX = -speedX;
			System.out.println("the boundary has been hit");
		}
		if (x < 0) {
			speedX = -speedX;
			System.out.println("the boundary has been hit");
		}
		if (y > 640) {
			speedY = -speedY;
			System.out.println("the boundary has been hit");
		}
		if (y < 0) {
			speedY = -speedY;
			System.out.println("the boundary has been hit");
		}
	}
}
