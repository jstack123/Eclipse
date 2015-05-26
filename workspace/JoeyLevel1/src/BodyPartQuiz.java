import java.awt.Frame;
import java.awt.Image;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/joeystack/Documents/workspace/JoeyLevel1/src/michael-jordan-tongue_display_image.jpg";
	String secondImage = "Bill_Gates_July_2014.jpg";
	String thirdImage = "soozeblb_1397592319_jackie%20robinson.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(1000, 1000);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String celebrity1 = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		if (celebrity1.equalsIgnoreCase("Michael Jordan")) {
			score++;
			JOptionPane.showMessageDialog(null,
					"Fantastic Job!!! You get 1 point!!! Your score: " + score
							+ " point" + (score == 0 ? "" : "s"));

		} else {
			JOptionPane.showMessageDialog(null,
					"Failure!!! You get no points. Your score: " + score
							+ " point" + (score == 0 ? "" : "s"));
		}

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		ImageIcon icon = new ImageIcon(fileName);
		if (fileName == firstImage) {
			Image image;
			image = icon.getImage();
			image = window.createImage(new FilteredImageSource(image
					.getSource(), new CropImageFilter(140, 63, 110, 53)));
			icon = new ImageIcon(image);
		}

		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
