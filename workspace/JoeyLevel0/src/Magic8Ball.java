// Copyright Wintriss Technical Schools 2013
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball
{

	public static void main(String[] args)
	{
		boolean speak = true;

		int magic = new Random().nextInt(4);

		String question = JOptionPane
				.showInputDialog("ENTER A QUESTION NOW!!!");

		if (magic == 0)
		{
			if (speak)
				try
				{
					Runtime.getRuntime().exec("say Totally!");
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
				JOptionPane.showMessageDialog(null, "Totally!");
		}

		if (magic == 1)
		{
			if (speak)
				try
				{
					Runtime.getRuntime().exec("say No no no,not today.");
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			JOptionPane.showMessageDialog(null, "No no no, not today.");
		}

		if (magic == 2)
		{
			JOptionPane.showMessageDialog(null,
					"Maybe or maybe not. Dun Dun Dun!");
		}

		if (magic == 3)
		{
			JOptionPane.showMessageDialog(null, "SHUT UP!!! GO AWAY");
		}

	}
}
