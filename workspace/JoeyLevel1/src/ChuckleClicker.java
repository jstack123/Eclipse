
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame("ChuckleClicker");
	JPanel panel = new JPanel();
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");

	public static void main(String[] args) {
		ChuckleClicker chuck = new ChuckleClicker();
		chuck.makeButtons();
	}

	void makeButtons() {
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Why did the traffic light turn red?");
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "You would too if you had to change in the middle of the street!");
		}
	}
}
