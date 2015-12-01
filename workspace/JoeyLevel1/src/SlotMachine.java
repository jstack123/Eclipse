import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
	}

	JFrame frame;
	JPanel panel;
	JLabel a;
	JLabel b;
	JLabel c;
	JButton play;

	public SlotMachine() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		a = new JLabel();
		b = new JLabel();
		c = new JLabel();
		play = new JButton("PLAY");
		play.addActionListener(this);
		frame.add(panel);
		panel.add(a);
		a.setText("Number 1");
		panel.add(b);
		b.setText("Number 2	");
		panel.add(c);
		c.setText("Number 3");
		panel.add(play);
		frame.pack();
	}

	void spinWheel(int wheel) {
		if (wheel == 1) {
			Random r = new Random();
			int v = r.nextInt(10);
			a.setText("" + v);
		} else if (wheel == 2) {
			Random r = new Random();
			int v = r.nextInt(10);
			b.setText("" + v);
		} else if (wheel == 3) {
			Random r = new Random();
			int v = r.nextInt(10);
			c.setText("" + v);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		spinWheel(1);
		spinWheel(2);
		spinWheel(3);
	}
}
