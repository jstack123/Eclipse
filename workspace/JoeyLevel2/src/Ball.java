import java.awt.Graphics;

public class Ball extends BBGameObject {
	Ball ball;

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		// think about making different classes for each different point
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.basketballImg, x, y, width, height, null);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
