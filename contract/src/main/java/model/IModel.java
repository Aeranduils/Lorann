package model;

import java.util.Observable;

/**
 * 
 * @author flori
 *
 */
public interface IModel {
	/**
	 * Get the Level
	 * 
	 * @return level
	 */
	ILevel getLevel();

	/**
	 * Get the observable
	 * 
	 * @return observable
	 */

	Observable getObservable();

	/**
	 * LevelTuto is loaded ?
	 */
	boolean loadTuto();

	/**
	 * Load the tuto level
	 */
	void loadTuto1();

	/**
	 * Level is loaded ?
	 * 
	 * @param id
	 * 
	 */
	boolean loadLevel(int id);

	/**
	 * 
	 */
	void flush();

	/**
	 * Get Element
	 * 
	 * @param y
	 * @param x
	 * @return
	 */
	IElement getElement(int y, int x);

	/**
	 * Get element tab
	 * 
	 * @return
	 */
	IElement[][] getElements();

	/**
	 * Get lorann player
	 * 
	 * @return lorann
	 */
	ILorann getLorann();
}
