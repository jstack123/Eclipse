package BoxCollision;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BoxPanel extends JPanel implements ActionListener{
	Timer timer;
	int x = 250;
	int y = 5;
	public BoxPanel() {
		timer = new Timer(1000/60, this);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 50, 50);
	}
	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		y++;
		
	}
}
