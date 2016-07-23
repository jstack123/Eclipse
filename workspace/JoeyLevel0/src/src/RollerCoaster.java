package src;
import javax.swing.JOptionPane;

public class RollerCoaster
{
	public static void main(String[] args)
	{

		String height = JOptionPane.showInputDialog("How tall are you?");
		int inches = Integer.parseInt(height);
		if (inches < 48)
		{
			JOptionPane.showMessageDialog(null, "You need to grow more!!!");
		} else
		{
			JOptionPane.showMessageDialog(null, "Have a good ride!!!!");
		}

	}

}
