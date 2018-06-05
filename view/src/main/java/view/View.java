package view;

import java.util.Observer;

import controller.IController;

/**
 * 
 * @author flori
 *
 */

public class View implements IView {

	private GameFrame frame;

	/**
	 * The View of the game Instanciate a new Game Frame
	 */
	public View() {

		this.frame = new GameFrame();
	}

	/**
	 * 
	 */
	public void repaint() {

	}

	/**
	 * Set the frame visible
	 */
	public void openFrame() {
		this.frame.setVisible(true);
	}

	/**
	 * Close the frame
	 */
	public void closeFrame() {
		this.frame.setVisible(false);
	}

	/**
	 * Get the Observer
	 * 
	 * @return getGamePanel
	 */
	public Observer getObserver() {
		return this.frame.getGamePanel();
	}

	/**
	 * Set the controller
	 */
	public void setController(IController controller) {
		this.frame.setController(controller);
	}

}
