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
		g.drawString("Hoop", x + 15, y + 40);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
