package elements;

import java.awt.Image;

import model.IElement;
import model.IPosition;
import model.ISprite;
import model.Sprite;

/**
 * 
 * @author flori
 *
 */
public class Element implements IElement {

	protected String image;
	protected ISprite sprite;
	protected IPosition position;

	/**
	 * 
	 * @param image
	 *            Icon of the element
	 * @param y
	 *            Y position of the element
	 * @param x
	 *            X position of the element
	 */
	public Element(String image, int y, int x) {
		this.sprite = new Sprite(image);
		this.position = new Position(y, x);

	}

	/**
	 * 
	 * @param image
	 *            Icon of the element
	 * @param position
	 *            Position of the element
	 */
	public Element(String image, Position position) {
		this.position = position;
		this.sprite = new Sprite(image);
	}

	/**
	 * 
	 * @param y
	 *            Y position of the element
	 * @param x
	 *            X position of the element
	 * @param sprite
	 *            Sprite of the element
	 */
	public Element(int y, int x, Sprite sprite) {
		this.position = new Position(y, x);
		this.sprite = sprite;
	}

	/**
	 * 
	 * @param position
	 *            Position of the element
	 * @param sprite
	 *            Sprite of the element
	 */

	public Element(Position position, Sprite sprite) {
		this.position = position;
		this.sprite = sprite;
	}

	/**
	 * Get the icon of the element
	 * 
	 * @return image
	 */

	public Image getImage() {
		return this.sprite.getImage();

	}

	/**
	 * Get the sprite of the element
	 * 
	 * @return sprite
	 */
	public ISprite getSprite() {
		return sprite;
	}

	/**
	 * Set the sprite of the element
	 * 
	 * @param sprite
	 */
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	/**
	 * Get the position of the element
	 * 
	 * @return position
	 */
	public IPosition getPosition() {
		return position;
	}

	/**
	 * Set the position of the element
	 * 
	 * @param position
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}

	/**
	 * Set the position of the element
	 * 
	 * @param y
	 * @param x
	 */
	public void setPosition(int y, int x) {
		this.position.setY(y);
		this.position.setX(x);
	}

	/**
	 * Set the sprite of the element
	 * 
	 * @param sprite
	 */
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;

	}

}
