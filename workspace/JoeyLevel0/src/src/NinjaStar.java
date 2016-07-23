package src;
import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class NinjaStar
{

	public static void main(String[] args)
	{

		int baseSize = 300;
		int flameSize = 200;
		Tortoise.setX(400);
		Tortoise.setY(100);

		Tortoise.show();

		Tortoise.setSpeed(10);

		for (int i = 0; i < 25; i++)
		{

			Tortoise.turn(360 / 8);

			Tortoise.move(64);

			Tortoise.turn(-40);
			Tortoise.setPenColor(Color.magenta);
			;

			Tortoise.move(flameSize);

			Tortoise.turn(170);

			Tortoise.move(flameSize);
			Tortoise.setPenColor(Color.BLACK);

			Tortoise.turn(64);

			Tortoise.move(baseSize);

		}
	}

}
