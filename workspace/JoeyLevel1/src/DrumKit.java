// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel myDrum;
	JLabel myDrum2;
	JLabel myDrum3;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame myJFrame = new JFrame();
		// 2. Make the frame visible
		myJFrame.setVisible(true);
		// 3. Set the size of the frame
		myJFrame.setSize(700, 600);
		// 4. Set the title of the frame
		myJFrame.setTitle("Joey's Frame");
		// 5. Make a JPanel and initialize it.
		JPanel myJPanel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		myJFrame.add(myJPanel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
		// 8. Put the name of your image in a String variable.
		String drum3 = "Drum3.jpg";
		String drum2 = "Drum2.jpg";
		String drum = "images.jpg";
		// 9. Use the "createLabelImage()" method to initialize the drumImage
		// variable.
		myDrum3 = createLabelImage(drum3);
		myDrum2 = createLabelImage(drum2);
		myDrum = createLabelImage(drum);
		// 10. Add the image to the panel
		myJPanel.add(myDrum3);
		myJPanel.add(myDrum2);
		myJPanel.add(myDrum);
		// 11. Set the layout of the panel to "new GridLayout()"
		myJPanel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		myJFrame.pack();
		// 13. add a mouse listener to your drumImage.
		myDrum3.addMouseListener(this);
		myDrum2.addMouseListener(this);
		myDrum.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked");

		JLabel drumClicked = (JLabel) e.getSource();

		// 15. Download a drum sound and drop it into your "default package".
		// There are some sounds here: http://bit.ly/drum-sounds or you can also
		// get them from freesound.org
		// 16. If they clicked on the drumImage...
		if (drumClicked == myDrum) {
			playSound("HardCoreDrums.wav");
		}
		if (drumClicked == myDrum2) {
			playSound("drumSound2.wav");
		}
		if (drumClicked == myDrum3) {
			playSound("drumSound3.wav");
		}
		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName)
			throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
