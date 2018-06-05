package elements;

import model.IPosition;

/**
 * 
 * @author flori
 *
 */
public class Position implements IPosition {

	private int x;
	private int y;
	private int lastX;
	private int lastY;

	/**
	 * The position
	 * 
	 * @param y
	 *            Y position
	 * @param x
	 *            X position
	 */
	public Position(int y, int x) {

		this.x = x;
		this.y = y;

	}

	/**
	 * The position
	 * 
	 * @param position
	 */

	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
	}

	/**
	 * Get X position
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Set X position
	 * 
	 * @param x
	 */

	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Get Y position
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Set Y position
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Get the last X position
	 * 
	 * @return lastX
	 */

	public int getLastX() {
		return lastX;
	}

	/**
	 * Set the last X position
	 * 
	 * @param lastX
	 */

	public void setLastX(int lastX) {
		this.lastX = lastX;
	}

	/**
	 * Get the last Y position
	 * 
	 * @return lastY
	 */

	public int getLastY() {
		return lastY;
	}

	/**
	 * Set the last Y position
	 * 
	 * @param lastY
	 */

	public void setLastY(int lastY) {
		this.lastY = lastY;
	}

}
