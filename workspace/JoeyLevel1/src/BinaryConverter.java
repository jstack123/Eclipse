import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("convert");
	JTextField answer1 = new JTextField(20);
	JTextField answer2 = new JTextField(20);

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("[01]{8}", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	public static void main(String[] args) {
		BinaryConverter binary = new BinaryConverter();

	}

	public BinaryConverter() {
		frame.add(panel);
		panel.add(answer1);
		panel.add(button);
		panel.add(answer2);
		button.addActionListener(this);
		answer1.setText("answer");

		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	String getUserAnswer() {
		return answer1.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int output = convert(getUserAnswer());
		answer2.setText("" + output);
	}
}
