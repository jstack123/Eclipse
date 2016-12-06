package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box fat;
	ArrayList<Box> fodder;
	int enemyTimer = 0;
	int spawnEnemyTimer=30;
	

	public BoxManager() {
		this.fat = fat;
		this.fodder = fodder;
		fat = new Box(Color.RED, 50, 50, 200,400, 5, 5, true);
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
	}

	public void draw(Graphics g) {
		fat.draw(g);
		for (int i = 0; i < fodder.size(); i++) {
			Box little = fodder.get(i);
			little.draw(g);
		}
	}
	public void manageEnemies() {
		Box little2= new Box(Color.RED, 25, 25, 300, 500, 5, 5, true);
		enemyTimer++;
		if(enemyTimer > spawnEnemyTimer) {
			fodder.add(little2);
			enemyTimer = 0;
		}
	}
	public void checkBoxEat() {
//	work on here	for (int i = 0; i < array.length; i++) {
			
		}
	}


