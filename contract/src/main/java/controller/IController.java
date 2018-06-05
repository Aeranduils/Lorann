package controller;

import model.IModel;
import view.Order;

/**
 * 
 * @author flori
 *
 */
public interface IController {
	/**
	 * Get the order
	 * 
	 * @param order
	 */
	public void orderPerform(Order order);

	/**
	 * Set the lorann model
	 * 
	 * @param model
	 */
	public void setModel(IModel model);

	/**
	 * Begin the game
	 */
	public void start();

}
