package model;

import java.util.ArrayList;

/**
 * 
 * @author flori
 *
 */
public interface ILevel {
	/**
	 * Get the dimension
	 * 
	 * @return dimension
	 */
	IDimension getDimension();

	/**
	 * Set the dimension
	 * 
	 * @param dimension
	 */
	void setDimension(IDimension dimension);

	/**
	 * Add a mobile element
	 * 
	 * @param mobile
	 */
	void addMobile(IMobile mobile);

	/**
	 * Remove a mobile element
	 * 
	 * @param mobile
	 */
	void removeMobile(IMobile mobile);

	/**
	 * Get the number
	 * 
	 * @return number
	 */
	int getNumber();

	/**
	 * Set the number
	 * 
	 * @param number
	 */
	void setNumber(int number);

	/**
	 * Get the lorann player
	 * 
	 * @return lorann
	 */
	ILorann getLorann();

	/**
	 * Set the lorann player
	 * 
	 * @param lorann
	 */

	void setLorann(ILorann lorann);

	/**
	 * Get the mobile list
	 * 
	 * @return mobile
	 */
	ArrayList<IMobile> getMobile();

	/**
	 * Create a lorann spell
	 * 
	 * @param y
	 * @param x
	 * @param movement
	 */
	void createSpell(int y, int x, Movement movement);

	/**
	 * is finished ?
	 * 
	 * @return
	 */
	boolean isFinished();

	/**
	 * Set isFinished ?
	 * 
	 * @param finished
	 */

	void setFinished(boolean finished);

	/**
	 * Get the ID
	 * 
	 * @return id
	 */
	int getId();

	/**
	 * Get element position
	 * 
	 * @param y
	 * @param x
	 * 
	 */
	IElement getElement(int y, int x);

	/**
	 * Get the element tab
	 */
	IElement[][] getElements();

	/**
	 * Set the element tab
	 * 
	 * @param elements
	 */

	void setElements(IElement[][] elements);

}
