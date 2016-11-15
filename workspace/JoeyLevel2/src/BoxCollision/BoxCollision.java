package BoxCollision;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxCollision {
	static final int WIDTH = 500;
	static final int LENGTH = 700;
	JFrame frame;
	BoxPanel panel;

	public BoxCollision() {
		frame = new JFrame("BoxCollision");
		panel = new BoxPanel();
		setup();
		panel.startGame();
	}

	public static void main(String[] args) {
		BoxCollision box = new BoxCollision();
	}
	public void setup() {
		frame.add(panel);
		frame.setSize(WIDTH, LENGTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
