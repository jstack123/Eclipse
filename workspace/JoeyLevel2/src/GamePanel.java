import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font startAndEndMenu;
	Font scoreFont;
	public static BufferedImage courtBackgroundImg;
	public static BufferedImage basketballImg;
	Ball ball = new Ball(100, 200, 25, 25);
	boolean inZone = false;
	Hoop hoop = new Hoop(875, 370, 60, 60);
	int score = 0;
	int currentZoneScore = 0;
	int mouseX;
	int mouseY;

	ScoreZone[] zone = new ScoreZone[12];
	// work on making arrays for zones

	public GamePanel()

	{
		zone[0] = new ScoreZone(700, 375, 50, 50, 1);
		zone[1] = new ScoreZone(675, 500, 50, 50, 2);
		zone[2] = new ScoreZone(675, 250, 50, 50, 2);
		zone[3] = new ScoreZone(535, 375, 50, 50, 3);
		zone[4] = new ScoreZone(900, 25, 50, 50, 3);
		zone[5] = new ScoreZone(900, 725, 50, 50, 3);
		zone[6] = new ScoreZone(625, 130, 50, 50, 3);
		zone[7] = new ScoreZone(625, 620, 50, 50, 3);
		zone[8] = new ScoreZone(380, 375, 50, 50, 4);
		zone[9] = new ScoreZone(240, 375, 50, 50, 5);
		zone[10] = new ScoreZone(300, 25, 50, 50, 5);
		zone[11] = new ScoreZone(300, 725, 50, 50, 5);

		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Times New Roman", Font.BOLD, 75);
		startAndEndMenu = new Font("Arial", Font.ITALIC, 50);
		scoreFont = new Font("Times New Roman", Font.HANGING_BASELINE, 40);
		try {
			courtBackgroundImg = ImageIO.read(this.getClass().getResourceAsStream("basketballCourt.png"));
			basketballImg = ImageIO.read(this.getClass().getResourceAsStream("basketball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint();
	}

	public void paintComponent(Graphics g) {
		// object.draw(g);

		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);

		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	public void checkPosition() {
		double distance = Math.sqrt((ball.getX() - hoop.getX()) * (ball.getX() - hoop.getX())
				+ (ball.getY() - hoop.getY()) * (ball.getY() - hoop.getY()));
		System.out.println(distance);
		if (distance < 25) {
			score += currentZoneScore;
			ball.setX(mouseX);
			ball.setY(mouseY);
			ball.isLaunching = false;
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		ball.update();
		if (ball.isLaunching) {
			checkPosition();
		}
		if ((ball.getX() > 1000 || ball.getX() < 0) || (ball.getY() > 800 || ball.getY() < 0)) {
			ball.setX(mouseX);
			ball.setY(mouseY);
			ball.isLaunching = false;
		}
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, BasketballGame.WIDTH, BasketballGame.HEIGHT);
		g.setColor(Color.BLUE);
		g.setFont(titleFont);
		g.drawString("Joey's Basketball Game", 150, 200);
		g.setFont(startAndEndMenu);
		g.drawString("Press ENTER to play.", 225, 400);
		g.drawString("Press SPACE for instructions.", 175, 600);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawImage(courtBackgroundImg, 0, 0, BasketballGame.WIDTH, BasketballGame.HEIGHT, null);
		// g.drawImage(basketballImg, 550, 400, 25, 25, null);
		ball.draw(g);
		for (int i = 0; i < zone.length; i++) {
			zone[i].draw(g);
		}
		hoop.draw(g);
		g.setColor(Color.BLACK);
		g.setFont(scoreFont);
		g.drawString("Score: " + score, 90, 150);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, BasketballGame.WIDTH, BasketballGame.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("GAME OVER!!!", 225, 200);
		g.setFont(startAndEndMenu);
		g.drawString("You scored a total of " + score + " points", 100, 400);
		// next time work on moving the x-value and the y-value to more in the
		// middle of the
		// hoop to make the shot more accurate and try to make the program have
		// a timer
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		for (int j = 0; j < zone.length; j++) {
			if (zone[j].checkIfInZone(e.getX(), e.getY()) == true) {
				// System.out.println("zoneistrue");
				inZone = true;
				currentZoneScore = zone[j].pointValue;
				break;
			} else {
				inZone = false;
				// System.out.println("zoneisfalse");
			}
		}

		if (inZone == true) {
			// ball.setX(ball.getX() + 1);
			ball = new Ball(e.getX(), e.getY(), 25, 25);
			ball.setup(e.getX(), e.getY());
			System.out.println("zoneistrue");
		}
		ball.setX(e.getX() - ball.getWidth() / 2);
		ball.setY(e.getY() - ball.getHeight());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		ball.launch(e.getX(), e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			currentState = MENU_STATE;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			JOptionPane.showMessageDialog(null,
					"Hello! Welcome to Joey's Basketball Game! In this game you goal is to score as many points as you can in 30 seconds. To shoot, drag your mouse back, let it go, and let it fly. The further you drag your mouse, the more power on the shoot. At the end, see how many points you get! Good luck! Have fun!");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		// if (ball.getX() > ball.getY() - 100) {
		// ball.setX(ball.getX() + 1);
		// }
		// System.out.println(e.getX());

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		if (ball.isLaunching == false) {
			ball.setX(e.getX() - ball.getWidth() / 2);
			ball.setY(e.getY() - ball.getHeight());
		}
		try {
			Robot robot = new Robot();

		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
