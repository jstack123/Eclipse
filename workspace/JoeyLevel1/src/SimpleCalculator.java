import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField a;
	JTextField b;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	JLabel answer;

	public SimpleCalculator() {
		frame = new JFrame("Simple Calculator");
		panel = new JPanel();
		a = new JTextField();
		b = new JTextField();
		add = new JButton("add");
		sub = new JButton("sub");
		mul = new JButton("mul");
		div = new JButton("div");
		answer = new JLabel("answer");
		frame.add(panel);
		panel.add(a);
		panel.add(b);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(answer);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		a.setColumns(5);
		b.setColumns(5);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		SimpleCalculator simple = new SimpleCalculator();
	}

	public int addNumber(JTextField a, JTextField b) {
		a.getText();
		int aAdd = Integer.parseInt(a.getText());
		int bAdd = Integer.parseInt(b.getText());
		return aAdd += bAdd;

	}

	public int subNumber(JTextField a, JTextField b) {
		a.getText();
		int aSub = Integer.parseInt(a.getText());
		int bSub = Integer.parseInt(b.getText());
		return aSub -= bSub;
	}

	public int mulNumber(JTextField a, JTextField b) {
		a.getText();
		int aMul = Integer.parseInt(a.getText());
		int bMul = Integer.parseInt(b.getText());
		return aMul *= bMul;
	}

	public int divNumber(JTextField a, JTextField b) {
		a.getText();
		int aDiv = Integer.parseInt(a.getText());
		int bDiv = Integer.parseInt(b.getText());
		return aDiv /= bDiv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add)) {
			answer.setText("" + addNumber(a, b));
		} else if (e.getSource().equals(sub)) {
			answer.setText("" + subNumber(a, b));
		} else if (e.getSource().equals(mul)) {
			answer.setText("" + mulNumber(a, b));
		} else if (e.getSource().equals(div)) {
			answer.setText("" + divNumber(a, b));
		}

	}

}
