package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.plaf.FontUIResource;

public class BoxManager {
	Box fat;
	ArrayList<Box> fodder;
	int enemyTimer = 0;
	int spawnEnemyTimer = 50;
	
	public BoxManager() {
		this.fat = fat;
		this.fodder = fodder;
		fat = new Box(Color.RED, 100, 100, 200, 400, 5, 5, true);
		fodder = new ArrayList<Box>();
	}

	public void addEnemy(Box little) {
		fodder.add(little);
	}

	public void update() {
		fat.update();
		for (int i = 0; i < fodder.size(); i++) {
			Box little = fodder.get(i);
			little.update();
		}
		manageEnemies();
		checkEnemyBoxes();
		cleanupEnemyBoxes();
	}

	public void draw(Graphics g) {
		fat.draw(g);
		for (int i = 0; i < fodder.size(); i++) {
			Box little = fodder.get(i);
			little.draw(g);
		}
	}

	public void manageEnemies() {
		Box little2 = new Box(Color.RED, 25, 25, 300, 500, 5, 5, true);
		enemyTimer++;
		if (enemyTimer > spawnEnemyTimer) {
			fodder.add(little2);
			enemyTimer = 0;
		}
	}

	public void checkBoxEat(Box A, Box B) {
		if (A.x <= B.x && A.x + A.width >= B.x + B.width && A.y <= B.y && A.y + A.height >= B.y + B.height) {
			B.alive=false; 
			System.out.println("false");
		}
	}

	public void checkEnemyBoxes() {
		for (int i = 0; i < fodder.size(); i++) {
			checkBoxEat(fat, fodder.get(i));
		}
	}
	public void cleanupEnemyBoxes() {
		for (int i = 0; i < fodder.size(); i++) {
			if (fodder.get(i).alive==false) {
				fodder.remove(i);
			}
			
		}
	}
	
}
