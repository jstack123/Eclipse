import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		Random random = new Random();
		World world = new World();
		world.show();
		for (int i = 0; i < 1000; i++) {
			Location location3 = new Location(random.nextInt(10),random.nextInt(10));
			Flower flowerall = new Flower();
			if (location3.getRow() %2==0) {
				flowerall.setColor(Color.RED);
			} else {
				flowerall.setColor(Color.WHITE);
			}
			world.add(location3, flowerall);
		}
		Bug bug = new Bug();
		Bug bug2 = new Bug(Color.BLUE);

		Location location = new Location(4, 6);
		Location location2 = new Location(random.nextInt(10),
				random.nextInt(10));
	
		Location left = new Location(location2.getRow(), location2.getCol()-1);
		Location right = new Location(location2.getRow(), location2.getCol()+1);
		world.add(location, bug);
		world.add(location2, bug2);
		bug2.turn();
		bug2.turn();
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		world.add(left, flower);
		world.add(right, flower2);
		
	}
}
