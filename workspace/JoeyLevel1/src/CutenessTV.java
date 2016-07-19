import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame("cuteTube");
	JPanel panel = new JPanel();
	JButton button2 = new JButton("frogs");
	JButton button3 = new JButton("FluffyUnicorns");
	JButton randomButton = new JButton("Random");
	Random random = new Random();
	JButton button = new JButton("ducks");

	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();

	}

	public CutenessTV() {
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(randomButton);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		randomButton.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			showDucks();
		} else if (e.getSource().equals(button2)) {
			showFrog();
		} else if (e.getSource().equals(button3)) {
			showFluffyUnicorns();
		} else if (e.getSource().equals(randomButton)) {
			int i = random.nextInt(3);
			System.out.println(i);
			if (i == 0) {
				showDucks();
			} else if (i == 1) {
				showFrog();
			} else if (i == 2) {
				showFluffyUnicorns();
			}
		}
	}
}
