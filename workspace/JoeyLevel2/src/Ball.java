import java.awt.Graphics;

public class Ball extends BBGameObject {
	Ball ball;
	int startX;
	int startY;
	int finishX;
	int finishY;
	double angle;
	double velocity;
	boolean isLaunching = false;

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		// think about making different classes for each different point
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.basketballImg, x, y, width, height, null);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void update() {
		if (isLaunching == true) {
			x += velocity * Math.cos(angle);
			y += velocity * Math.sin(angle);
		}
	}

	public void setup(int x, int y) {
		this.startX = x;
		this.startY = y;
		System.out.println(x);
		System.out.println(y);
	}

	public void launch(int x, int y) {
		this.finishX = x;
		this.finishY = y;
		int Xdif = startX - finishX;
		int Ydif = startY - finishY;
		// System.out.println(x);
		// System.out.println(y);
	   this.isLaunching=true;
		velocity = Math.sqrt((Xdif * Xdif) + (Ydif * Ydif)) * 0.25;
		if (Xdif != 0) {
			angle = Math.atan((double) Ydif / (double) Xdif);
		} else {
			angle = 0;
			velocity = 0;

		}
		if (finishX > startX) {
			velocity = -velocity;
		}
		System.out.println(velocity);
		System.out.println(angle);
		isLaunching = true;

	}
}
