package model;

/**
 * 
 * @author flori
 *
 */
public interface IMobile extends IElement {
	/**
	 * Move Up
	 */

	Movement getDirection();

	void setDirection(Movement direction);

	void move(int y, int x);

}
