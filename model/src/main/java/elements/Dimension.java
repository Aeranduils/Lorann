package elements;

import model.IDimension;

/**
 * 
 * @author flori
 *
 */
public class Dimension implements IDimension {

	private int width;
	private int height;

	/**
	 * 
	 * @param height
	 * 
	 * @param width
	 */

	public Dimension(int height, int width) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Get width
	 * 
	 * @return width
	 */
	public int getwidth() {

		return this.width;

	}

	/**
	 * Get height
	 * 
	 * @return height
	 */
	public int getheight() {
		return this.height;
	}

	/**
	 * set the width
	 * 
	 * @param width
	 * 
	 */
	public void setwidth(int width) {
		this.width = width;

	}

	/**
	 * set the height
	 * 
	 * @param height
	 */
	public void setheight(int height) {

		this.height = height;
	}

}
