package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box fat;
	ArrayList<Box> fodder;

	public BoxManager() {
		this.fat = fat;
		this.fodder = fodder;
		fat = new Box(Color.RED, 50, 50, (int) (Math.random() * 500), (int) (Math.random() * 700), 5, 5, true);
	}

	public void update() {
		fat.update();
	}

	public void draw(Graphics g) {
		fat.draw(g);
	}
}
