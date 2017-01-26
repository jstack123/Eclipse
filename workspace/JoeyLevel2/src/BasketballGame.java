import javax.swing.JFrame;

public class BasketballGame {
	static final int WIDTH = 1000;
	static final int HEIGHT = 800;
	JFrame frame;
	GamePanel game;

	public static void main(String[] args) {
		BasketballGame game = new BasketballGame();
	}

	public BasketballGame() {
		frame = new JFrame("Basketball Game");
		game = new GamePanel();
		setup();
	}

	public void setup() {
		frame.add(game);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.addKeyListener(game);
		frame.addMouseListener(game);
		frame.addMouseMotionListener(game);
		game.startGame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
