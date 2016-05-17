import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public WhackAMole() {

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("WhackAMole");
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Hit me");
		JButton button2 = new JButton("Hit me");
		JButton button3 = new JButton("Hit me!");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
