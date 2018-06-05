package model;

import java.awt.Image;

/**
 * 
 * @author flori
 *
 */
public interface ILorann extends IMobile {
	/**
	 * Get the image
	 */
	Image getImage();

	/**
	 * is Alive ?
	 */
	boolean isAlive();

	/**
	 * Set alive
	 * 
	 * @param alive
	 */

	void setAlive(boolean alive);

	void setSpell(boolean b);

	void setMovement(Movement direction);

}
