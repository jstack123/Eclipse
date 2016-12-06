package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BoxPanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 250;
	int y = 5;
	Box box;
	Random random;
	BoxManager manager;
	public BoxPanel() {
		timer = new Timer(1000 / 60, this);
		//Color color = new Color(random.nextInt(0xFFFFFF));
		box = new Box(Color.RED, 50, 50, (int) (Math.random() * 500), (int) (Math.random() * 700), 5, 5, true);
		random = new Random();
		manager = new BoxManager();
	}

	public void paintComponent(Graphics g) {
		manager.draw(g);
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		manager.update();
	}
}
