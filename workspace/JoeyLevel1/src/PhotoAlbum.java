// Copyright Wintriss Technical Schools 2013
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoAlbum extends MouseAdapter {

	/* We’re going to make a slideshow of cool optical illusions. */

	// 1. Make a Frame variable and initialize it using "new Frame()"
	JFrame photo = new JFrame();
	JLabel type;
	private void makeAlbum() {
		// 2. Make the frame visible
		photo.setVisible(true);
		// 3. Set the size of the frame
		photo.setSize(500, 500);
		// 4. find 2 images and save them to your disk

		// 5. make a variable. make it hold the location of your image. e.g.
		// “/Users/illusion.jpg”
		String hold = "IMG/797367-optical-illusions.jpg";
	

		// 6. create a variable of type "JLabel" but don’t initialize it
		
		// 7. use one of the the "loadImage..." methods below to initialize your
		// JLabel
		type = loadImageFromComputer(hold);
		// 8. add the JLabel to the frame
		photo.add(type);
		// 9. call the pack() method on the frame
		photo.pack();

		// 10. add a mouse listener ("this") to your frame
		photo.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print to the console when the mouse is pressed

		System.out.println("here");
		// 12. remove everything from the frame (the image will not disappear
		// until step 14)
		//photo.removeAll();
		photo.remove(type);
		// 13. load a new image like before (this is more than one line of code)
		
		String hold = "IMG/Vibration2.jpg";
		JLabel image;
		image = loadImageFromComputer(hold);
		// 14. pack the frame
		photo.add(image);
		
		photo.pack();
		
		photo.addMouseListener(this);
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	public JLabel loadImageFromTheInternet(String imageURL)
			throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new PhotoAlbum().makeAlbum();
	}
}
