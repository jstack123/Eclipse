

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PigLatin {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setName("Joey's Pig Latin Translator");
		JPanel panel = new JPanel();
		frame.add(panel);
		TextField text = new TextField(20);
		panel.add(text);
		JButton button = new JButton("translate");
		panel.add(button);
		TextField text2 = new TextField(20);
		panel.add(text2);
		frame.pack();
		
		
	}
}
