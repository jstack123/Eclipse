package src;
import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {

		String cats = JOptionPane.showInputDialog("How many cats do you have?");

		int parse = Integer.parseInt(cats);

		if (parse > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!!!");
		}
		if (parse < 3) {
			playVideo("https://www.youtube.com/watch?v=wf_IIbT8HGk");
		}

		if (parse == 0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}

		if (parse == 3) {
			JOptionPane.showMessageDialog(null, ("You are original!"));
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
