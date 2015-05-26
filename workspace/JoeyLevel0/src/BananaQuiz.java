package src;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{

	public static void main(String[] args)
	{
		
		String banana = JOptionPane.showInputDialog("Do u like bananas?");

		if (banana.equals("no"))
		{
			JOptionPane.showMessageDialog(null, "You are crazy!!!!!!!");
		}

		else
		{
			String peel = JOptionPane
					.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, peel
					+ " is much better with bananas!!!");
		}

	
	}

}
