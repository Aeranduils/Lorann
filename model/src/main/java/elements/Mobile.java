package elements;

import model.IMobile;
import model.Movement;

/**
 * 
 * @author flori
 *
 */
public class Mobile extends Element implements IMobile {

	private boolean alive = true;
	protected Movement direction;

	/**
	 * The Mobile elements
	 * 
	 * @param image
	 * @param y
	 *            Y position of the mobile
	 * @param x
	 *            X position of the mobile
	 */
	public Mobile(String image, int y, int x) {
		super(image, y, x);
		this.direction = Movement.UP;

	}

	public Movement getDirection() {
		return direction;
	}

	/**
	 * isHit ?
	 * 
	 * @return false
	 */
	public Boolean isHit() {
		return false;
	}

	/**
	 * Get the position of the mobile element
	 * 
	 * @return position
	 */

	/**
	 * Die
	 */

	protected void die() {
		this.alive = false;

	}

	/**
	 * isAlive
	 * 
	 * @return alive
	 */

	public boolean isAlive() {
		return this.alive;
	}

	/**
	 * Move
	 * 
	 * @param y
	 *            Y position
	 * @param x
	 *            X position
	 */
	public void move(int y, int x) {
		this.setPosition(y, x);
	}

	public void setDirection(Movement direction) {
		this.direction = direction;

	}

}
