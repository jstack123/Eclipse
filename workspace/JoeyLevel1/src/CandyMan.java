import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	int candy = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("CandyMan");

	public CandyMan() {
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File(
					"/Users/WTS10/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File(
					"/Users/WTS10/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {

		CandyMan man = new CandyMan();

	}

	public void actionPerformed(ActionEvent arg0) {
		candy++;
		// TODO Auto-generated method stub
		if (candy == 5) {
			playSound(1);
		}
	}
}
