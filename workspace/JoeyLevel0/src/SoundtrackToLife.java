package src;
import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife
{

	public static void main(String[] args)
	{

		String mood = JOptionPane
				.showInputDialog("What mood are you in right now?");

		if (mood.equals("happy"))
		{
			playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		} else
		{
			playVideo("https://www.youtube.com/watch?v=gMTeytJeSp8");
		}

	}

	static void playVideo(String youTubeLink)
	{
		try
		{
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
