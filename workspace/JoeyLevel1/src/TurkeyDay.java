import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TurkeyDay implements MouseListener {
	public static void main(String[] args) {
		TurkeyDay turkey = new TurkeyDay();
		turkey.playSound("turkeysound.wav");
	}

	JFrame frame;
	JPanel panel;
	JLabel label;

	public TurkeyDay() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel(new ImageIcon(TurkeyDay.class.getResource("turkey.png")));
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.pack();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		playSound("turkeysound.wav");
		JOptionPane.showMessageDialog(null, "Happy Thanksgiving Day!!!!!!!!!");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
