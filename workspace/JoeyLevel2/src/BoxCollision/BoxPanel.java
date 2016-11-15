package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BoxPanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 250;
	int y = 5;
	Box box;

	public BoxPanel() {
		timer = new Timer(1000 / 60, this);
		box = new Box(Color.RED, 50, 50, 70, 70, 5, 5, true);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 50, 50);
		g.setColor(Color.RED);
		box.draw(g);
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		box.update();
		y++;
		box.boundaryCheck();
	}
}
