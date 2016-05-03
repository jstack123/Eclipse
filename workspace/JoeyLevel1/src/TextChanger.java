import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextChanger implements ActionListener {
	String color;
	int textSize;
	String font;
	String backgroundColor;

	public TextChanger(String color, int textSize, String font, String backgroundColor) {
		this.color = color;
		this.textSize = textSize;
		this.font = font;
		this.backgroundColor = backgroundColor;
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		panel.add(text);
		frame.setVisible(true);
		frame.pack();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Red");
	JButton button2 = new JButton("Green");
	JButton button3 = new JButton("Blue");
	JLabel text = new JLabel("Choose a color");

	public static void main(String[] args) {
		TextChanger changer = new TextChanger("red", 12, "TimesNewRoman", "green");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			text.setText("You chose red");
			text.setForeground(Color.RED);
		} else if (buttonPressed == button2) {
			text.setText("You chose green");
			text.setForeground(Color.GREEN);
		} else if (buttonPressed == button3) {
			text.setText("You chose blue");
			text.setForeground(Color.BLUE);
		} else {
			text.setText("You chose nothing.");
		}
		button1.setText("small");
		button2.setText("medium");
		button3.setText("large");
	}
}
