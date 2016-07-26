import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	JFrame frame;
	JPanel panel;
	JTextField a;
	JTextField b;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;

	public SimpleCalculator() {
		frame = new JFrame("Simple Calculator");
		panel = new JPanel();
		a = new JTextField();
		b = new JTextField();
		add = new JButton("add");
		sub = new JButton("sub");
		mul = new JButton("mul");
		div = new JButton("div");
		frame.add(panel);
		panel.add(a);
		panel.add(b);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);

		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		SimpleCalculator simple = new SimpleCalculator();
	}
}
