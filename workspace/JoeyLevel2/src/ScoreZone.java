import java.awt.Font;
import java.awt.Graphics;

public class ScoreZone extends BBGameObject{
	int pointValue;
	Font scoreFont;
	public ScoreZone(int x, int y, int width, int height, int p) {
		super(x,y,width,height);
		pointValue=p;
		scoreFont = new Font("Arial", Font.PLAIN,20);
	}
	public void draw(Graphics g) {
		g.drawOval(x, y, width, height);
		g.setFont(scoreFont);
		g.drawString(""+pointValue, x+20, y+30);
	}
	//continue making the scorezones
}
