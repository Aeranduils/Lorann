package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author flori
 *
 */
public class GameLoop extends Thread implements ActionListener {

	private Controller controller;
	private int tick;
	private long interval;
	private boolean stop;

	/**
	 * GameLoop of the game
	 * 
	 * @param controller
	 */
	public GameLoop(Controller controller) {
		this.tick = 0;
		this.setInterval(60);
		this.controller = controller;
	}

	/**
	 * GameLoop of the game
	 * 
	 * @param interval
	 */
	public GameLoop(int interval) {
		this.tick = 0;
		this.setInterval(interval);
		this.stop = false;
	}

	/**
	 * Get tick of the clock loop
	 * 
	 * @return tick
	 */

	public int getTick() {
		return tick;
	}

	/**
	 * Get the interval between each tick of the clock loop
	 * 
	 * @return interval
	 */

	public long getInterval() {
		return interval;
	}

	/**
	 * Set the interval between each tick of the clock loop
	 * 
	 * @param interval
	 */

	public void setInterval(long interval) {
		this.interval = interval;
	}

	/**
	 * Stop the loop
	 */

	public void stopLoop() {
		this.stop = true;
	}

	/**
	 * Run the clock loop
	 */

	public void run() {
		while (true) {
			this.controller.update();
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.tick++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
