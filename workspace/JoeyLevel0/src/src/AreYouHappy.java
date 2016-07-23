package src;
import javax.swing.JOptionPane;

public class AreYouHappy
{
	public static void main(String[] args)
	{
		String Happy = JOptionPane.showInputDialog(null, "Are You Happy?");
		if (Happy.equals("yes"))
			JOptionPane.showMessageDialog(null,
					"Keep Doing Whatever You're Doing.");
		if (Happy.equals("no"))
		{
			String Want = JOptionPane
					.showInputDialog("Do You Want To Be Happy?");
			if (Want.equals("no"))
				JOptionPane.showMessageDialog(null,
						"Keep Doing Whatever You're Doing.");
			if (Want.equals("yes"))
				JOptionPane.showMessageDialog(null,
						"You Better Change Something.");
		}

	}

}
