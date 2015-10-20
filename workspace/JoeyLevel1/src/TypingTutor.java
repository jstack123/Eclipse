import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame("Type or Die");
	JLabel label = new JLabel();

	public TypingTutor() {

		frame.setVisible(true);
		frame.add(label);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(100.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("you typed: " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("You are Correct");
		} else {
			System.out.println("YOU ARE WRONG!!! FAILURE!!!");
		}
		if (e.getKeyChar() == currentLetter) {
			frame.setBackground(Color.GREEN);
			frame.setForeground(Color.GREEN);
			label.setBackground(Color.GREEN);
			label.setForeground(Color.GREEN);
		} else {
			frame.setBackground(Color.RED);
			frame.setForeground(Color.RED);
			label.setBackground(Color.RED);
			label.setForeground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}

}
