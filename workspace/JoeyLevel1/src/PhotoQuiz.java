// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// ÒCopy Image URLÓ)
		String basketball = "http://cdn28.us2.fansshare.com/photos/nba/basketball-wallpapers-teams-749116662.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component bballComponent = createImage(basketball);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(bballComponent);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane
				.showInputDialog("What types of teams are these?");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equalsIgnoreCase("basketball")
				|| question.equalsIgnoreCase("Basketball teams")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(bballComponent);
		// 10. find another image and create it
		String tracks = "https://www.nature-watch.com/images/products/large/413e.jpg";
		// 11. add the second image to the quiz window
		Component animalComponent = createImage(tracks);
		quizWindow.add(animalComponent);

		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane
				.showInputDialog("What types of tracks are these?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (question2.equalsIgnoreCase("raccoon tracks")
				|| question2.equalsIgnoreCase("raccoon")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
