import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld2 {
	public static void main(String[] args) {
		Bug bug = new Bug();
		Bug bug2 = new Bug(Color.GREEN);
		Location loc = new Location(5, 5);
		Location loc2 = new Location(3, 2);
		Location flowerLoc = new Location(8, 6);
		Location flowerLoc2 = new Location(2, 3);
		Flower flower = new Flower();
		Flower flower2 = new Flower(Color.RED);
		World world = new World();
		world.show();
		world.add(loc, bug);
		world.add(loc2, bug2);
		world.add(flowerLoc, flower);
		world.add(flowerLoc2, flower2);

		bug.setColor(Color.BLUE);
		bug.turn();
		flower2.setColor(Color.orange);
	}

}
