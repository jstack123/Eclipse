// Copyright The League of Amazing Programmers 2014
import java.text.NumberFormat;

import java.util.Locale;

import javax.swing.JOptionPane;

public class ChangeCalculator
{

	public static void main(String[] args)
	{

		String nickels = JOptionPane
				.showInputDialog("How many nickels do u have?");

		int n = Integer.parseInt(nickels);

		String dimes = JOptionPane.showInputDialog("How many dimes do u have");
		int d = Integer.parseInt(dimes);

		String quarters = JOptionPane
				.showInputDialog("How many quarters do u have?");
		int q = Integer.parseInt(quarters);

		double money = 0.0;
		money += 0.05 * n;
		money += 0.10 * d;
		money += 0.25 * q;
		NumberFormat currencyFormatter = NumberFormat
				.getCurrencyInstance(Locale.US);
		JOptionPane.showMessageDialog(null,
				"You have " + currencyFormatter.format(money) + " .");

	}
}
