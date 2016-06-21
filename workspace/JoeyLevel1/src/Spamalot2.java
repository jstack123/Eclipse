import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot2 {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(100);
	JButton bad = new JButton("BAD");
	JButton good = new JButton("GOOD");

	public Spamalot2() {
		frame.add(panel);
		panel.add(text);
		panel.add(bad);
		panel.add(good);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		Spamalot2 spam = new Spamalot2();
	}
}
