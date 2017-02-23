import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Hoop extends BBGameObject {
	Hoop hoop;
	Font hoopFont;

	public Hoop(int x, int y, int width, int height) {
		super(x, y, width, height);
		hoopFont = new Font("Arial", Font.BOLD, 20);
	}

	public void draw(Graphics g) {
		g.drawOval(x, y, width, height);
		g.setColor(Color.RED);
		g.setFont(hoopFont);
		g.drawString("Hoop", x, y);
	}
}
