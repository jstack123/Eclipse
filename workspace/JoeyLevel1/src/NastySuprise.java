import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();

	public void createUI() {
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {
		NastySuprise suprise = new NastySuprise();
		suprise.createUI();

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (trick == e.getSource()) {
			showPictureFromTheInternet("http://www.therobotsvoice.com/wp-content/uploads/2014/04/ocreview1.jpg");
		}
		if (treat == e.getSource()) {
			showPictureFromTheInternet(
					"http://2.bp.blogspot.com/-TzqPhujUbfo/UB7wYP7IcFI/AAAAAAAAAvE/yqxne632vrU/s1600/raining+candy.jpg");
		}
	}
}
