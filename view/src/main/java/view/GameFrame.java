package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IController;

/**
 * 
 * @author flori
 *
 */
class GameFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;

	private int width = 900;

	private int height = 680;

	private IController controller;

	private GamePanel panel;

	/**
	 * The Game Frame of the game
	 */
	GameFrame() {

		this.setTitle("Lorran");
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new GamePanel();
		this.panel.setBackground(Color.BLACK);
		this.setContentPane(this.panel);
		this.setResizable(false);

		this.addKeyListener(this);

	}

	/**
	 * Repaint the component
	 */
	public void repaint() {
		this.panel.repaint();
	}

	/**
	 * Get the Game Panel
	 * 
	 * @return panel
	 */
	public GamePanel getGamePanel() {
		return this.panel;
	}

	/**
	 * Get width of the panel
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Get height of the panel
	 * 
	 * @return height
	 */

	public int getHeight() {
		return height;
	}

	/**
	 * Get the controller
	 * 
	 * @return controller
	 */

	public IController getController() {
		return controller;
	}

	/**
	 * The KeyPressed Output
	 */

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_NUMPAD8:
		case KeyEvent.VK_Z:
		case KeyEvent.VK_UP:
			this.controller.orderPerform(Order.UP);
			break;
		case KeyEvent.VK_NUMPAD2:
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
			this.controller.orderPerform(Order.DOWN);
			break;
		case KeyEvent.VK_NUMPAD4:
		case KeyEvent.VK_Q:
		case KeyEvent.VK_LEFT:
			this.controller.orderPerform(Order.LEFT);
			break;
		case KeyEvent.VK_NUMPAD6:
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
			this.controller.orderPerform(Order.RIGHT);
			break;
		case KeyEvent.VK_NUMPAD1:
			this.controller.orderPerform(Order.DIAGBOTLEFT);
			break;
		case KeyEvent.VK_NUMPAD3:
			this.controller.orderPerform(Order.DIAGBOTRIGHT);
			break;
		case KeyEvent.VK_NUMPAD7:
			this.controller.orderPerform(Order.DIAGTOPLEFT);
			break;
		case KeyEvent.VK_NUMPAD9:
			this.controller.orderPerform(Order.DIAGTOPRIGHT);
			break;
		case KeyEvent.VK_SPACE:
			this.controller.orderPerform(Order.SPELL);
			break;

		}
	}

	/**
	 * Key typed
	 */

	public void keyTyped(KeyEvent e) {

	}

	/**
	 * Set the controller
	 * 
	 * @param controller
	 */

	public void setController(IController controller) {
		this.controller = controller;

	}

	/**
	 * Key Released
	 */

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}