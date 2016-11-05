import java.awt.Graphics;

public class BBGameObject {
int x;
int y;
int width;
int height;
public void update() {
	y--;
}
public void draw(Graphics g) {
	g.fillRect(x, y, 100, 100);
}
}
