// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.show();
		// 2. Give your frame a title
		frame.setTitle("Joey's Fabulous Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader
		// method
		JPanel header = new JPanel();
		// 4. Add the header component to the quizPanel
		quizPanel.add(header);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the firstButton variable to hold a button using the
		// createButton method
		firstButton = createButton("$200");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that
		// your game looks like Figure 1 in the Jeopardy Handout -
		// http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the
		// createButton method
		secondButton = createButton("$400");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);

		thirdButton = createButton("$600");
		quizPanel.add(thirdButton);

		fourthButton = createButton("$800");
		quizPanel.add(fourthButton);

		fifthButton = createButton("$1000");
		quizPanel.add(fifthButton);
		// 11. Add an action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Add buttons so that you have $200, $400, $600, $800 and $1000
	 * questions
	 * 
	 * [optional] Use the showImage or playSound methods when the user answers a
	 * question [optional] Add new topics for the quiz
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton dollar = new JButton();
		// Set the text of the button to the dollarAmount
		dollar.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		this.buttonCount++;
		// Return your new button instead of the temporary button
		return dollar;

	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:

		// Use the method that plays the jeopardy theme music.
		this.playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == fifthButton) {
			this.askQuestion("Who is the best person in the world?", "Joey",
					1000);
		} else if (buttonPressed == secondButton) {

			this.askQuestion(
					"What is the color of the sky, list three different colors?",
					"Blue, Gray, White", 400);
		} else if (buttonPressed == thirdButton) {
			this.askQuestion(
					"Which baseball player had the most home runs all time, that didn't take steroids?",
					"Hank Aaron", 600);
		} else if (buttonPressed == fourthButton) {
			this.askQuestion(
					"Who is considered the best NCAA coach of all time?",
					"coach K", 800);
		} else {
			this.askQuestion(
					"Who is considered the best guard of all time in the NBA?",
					"Magic Johnson", 200);
		}
		// Call the askQuestion() method

		// Fill in the askQuestion() method. When you play the game, the score
		// should change.

		// Or if the buttonPressed was the secondButton

		// Call the askQuestionRecipe with a harder question

		// Clear the button text (set the button text to nothing)
		buttonPressed.setText(null);
		buttonPressed.removeActionListener(this);
		boolean done = true;
		if (firstButton.getText() != null) {
			done = false;
		} else if (secondButton.getText() != null) {
			done = false;
		} else if (thirdButton.getText() != null) {
			done = false;
		} else if (fourthButton.getText() != null) {
			done = false;
		} else if (fifthButton.getText() != null) {
			done = false;
		}
		if (done) {
			JOptionPane.showMessageDialog(null, "Congrats! Your score is "
					+ score + " !");
			System.exit(0);
		}
	}

	private void askQuestion(String question, String correctAnswer,
			int prizeMoney) {
		// Remove this temporary message

		// Use a pop up to ask the user the question
		String answer = JOptionPane.showInputDialog(question);
		// If the answer is correct
		if (answer.equalsIgnoreCase(correctAnswer)) {
			score += prizeMoney;
			JOptionPane.showMessageDialog(null,
					"YOU WERE CORRECT!!! You earned $" + prizeMoney);
		} else {
			score -= prizeMoney;
			JOptionPane.showMessageDialog(null,
					"HAHAHA YOU FAILED!!! You lost $" + prizeMoney);
		}
		updateScore();
		// Increase the score by the prizeMoney

		// Call the updateScore() method

		// Pop up a message to tell the user they were correct

		// Otherwise

		// Decrement the score by the prizeMoney

		// Pop up a message to tell the user the correct answer

		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(
					// "http://www.jointheleague.org/sounds/jeopardy.wav"));
							"http://wavs.unclebubby.com/wav/TV/Misc/jeapordy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass()
				.getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
