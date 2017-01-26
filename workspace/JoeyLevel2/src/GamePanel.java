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
	public static BufferedImage courtBackgroundImg;
	public static BufferedImage basketballImg;
	Ball ball = new Ball(100, 200, 25, 25);
	ScoreZone zones = new ScoreZone(700, 375, 50, 50, 1);
	ScoreZone zones2 = new ScoreZone(675, 500, 50, 50, 2);
	ScoreZone zones2b = new ScoreZone(675, 250, 50, 50, 2);
	ScoreZone zones3 = new ScoreZone(535, 375, 50, 50, 3);
	ScoreZone zones3LeftC = new ScoreZone(800, 100, 50, 50, 3);
	ScoreZone zones4 = new ScoreZone(350, 400, 50, 50, 4);
	ScoreZone zones5 = new ScoreZone(250, 400, 50, 50, 5);

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Times New Roman", Font.BOLD, 75);
		startAndEndMenu = new Font("Arial", Font.ITALIC, 50);
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
		System.out.println(currentState);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);

		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

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
		zones.draw(g);
		zones2.draw(g);
		zones2b.draw(g);
		zones3.draw(g);
		zones3LeftC.draw(g);
		zones4.draw(g);
		zones5.draw(g);

	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, BasketballGame.WIDTH, BasketballGame.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("GAME OVER!!!", 225, 200);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
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
		System.out.println("hi");

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		ball.setX(e.getX());
		ball.setY(e.getY());
		System.out.println("ballX");
		try {
			Robot robot = new Robot();
			// robot.
			// work on mouse and ball
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
