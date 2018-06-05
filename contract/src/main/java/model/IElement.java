package model;

import java.awt.Image;

/**
 * 
 * @author flori
 *
 */
public interface IElement {
	/**
	 * Get the position
	 * 
	 * @return position
	 */
	IPosition getPosition();

	/**
	 * Set the position
	 * 
	 * @param position
	 */
	void setPosition(IPosition position);

	/**
	 * Set the Position
	 * 
	 * @param y
	 * @param x
	 */
	void setPosition(int y, int x);

	/**
	 * Get the sprite
	 * 
	 * @return sprite
	 */
	ISprite getSprite();

	/**
	 * Get the image
	 * 
	 * @return image
	 */
	Image getImage();

	/**
	 * Set the sprite
	 * 
	 * @param sprite
	 */
	void setSprite(ISprite sprite);

}
