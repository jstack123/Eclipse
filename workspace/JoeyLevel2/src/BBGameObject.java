import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BBGameObject {
int x;
int y;
int width;
int height;
public static BufferedImage courtBackgroundImg;
public BBGameObject() {
	try {
		courtBackgroundImg = ImageIO.read(this.getClass().getResourceAsStream("basketballCourt.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void update() {
	y--;
}
public void draw(Graphics g) {
	g.fillRect(x, y, 100, 100);
}
}
