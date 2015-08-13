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
		Bug bug = new Bug();
		Bug bug2 = new Bug(Color.BLUE);

		Location location = new Location(4, 6);
		Location location2 = new Location(random.nextInt(10),
				random.nextInt(10));
		world.add(location, bug);
		world.add(location2, bug2);
		bug2.turn();
		bug2.turn();
		Flower flower = new Flower();

	}
}
