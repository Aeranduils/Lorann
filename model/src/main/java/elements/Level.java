package elements;

import java.util.ArrayList;

import model.IDimension;
import model.IElement;
import model.ILevel;
import model.ILorann;
import model.IMobile;
import model.Movement;

/**
 * 
 * @author flori
 *
 */
public class Level implements ILevel {

	private int number;

	private ArrayList<IMobile> mobile;
	private int id;
	private IElement elements[][];
	private ILorann lorann;
	private IDimension dimension;

	/**
	 * The Level
	 * 
	 * @param id
	 *            Id of the level9999
	 * @param height
	 *            height of the level
	 * @param width
	 *            width of the level
	 * @param lorann
	 *            the lorann player
	 * @param number
	 *            the score
	 */
	public Level(int id, int height, int width, ILorann lorann, int number) {
		this.lorann = lorann;
		this.elements = new Element[height][width];
		this.mobile = new ArrayList<IMobile>();
		this.number = number;
		this.id = id;
		this.dimension = new Dimension(height, width);
	}

	/**
	 * Get dimension of the level
	 * 
	 * @return dimension
	 */
	public IDimension getDimension() {
		return this.dimension;
	}

	/**
	 * Set dimension of the level
	 * 
	 * @param dimension
	 */
	public void setDimension(IDimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * Add a mobile element
	 * 
	 * @param mobile
	 */
	public void addMobile(IMobile mobile) {
		this.mobile.add(mobile);
	}

	/**
	 * Remove a mobile element
	 * 
	 * @param mobile
	 */
	public void removeMobile(IMobile mobile) {
		this.mobile.remove(mobile);
	}

	/**
	 * Create the lorann spell
	 * 
	 * @param y
	 *            Y of the element
	 * @param x
	 *            X of the element
	 * @param lastY
	 *            last Y of the lorann player
	 * @param lastX
	 *            last X of the lorann player
	 */
	public void createSpell(int y, int x, int lastY, int lastX) {
		this.addMobile(new Spell(y, x, lastY, lastX));
	}

	/**
	 * Get number / score
	 * 
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Destroy an element
	 * 
	 * @param element
	 */
	public void destroyElement(IElement element) {
		if (element instanceof IMobile) {
			this.mobile.remove(element);
		} else {
			this.setElement(element.getPosition().getY(), element.getPosition().getX(), null);
		}
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public String getLoadQuerry(int id) {
		return null;
	}

	/**
	 * Set number / Score
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Get the Lorann player
	 * 
	 * @return lorann
	 */
	public ILorann getLorann() {
		return lorann;
	}

	/**
	 * Set the lorann player
	 * 
	 * @param lorann
	 */
	public void setLorann(ILorann lorann) {
		this.lorann = lorann;
	}

	/**
	 * Get the elements
	 * 
	 * @return elements
	 */
	public IElement[][] getElements() {
		return elements;
	}

	/**
	 * Set the elements
	 * 
	 * @param elements
	 */

	public void setElements(IElement[][] elements) {
		this.elements = elements;
	}

	/**
	 * Get the elements tab
	 * 
	 * @param y
	 * @param x
	 */

	public IElement getElement(int y, int x) {
		return this.elements[y][x];
	}

	/**
	 * Set the elements tab
	 * 
	 * @param y
	 * @param x
	 * @param element
	 */

	public void setElement(int y, int x, IElement element) {
		this.elements[y][x] = element;
	}

	/**
	 * Set the mobile element list
	 * 
	 * @param mobile
	 */

	public void setMobile(ArrayList<IMobile> mobile) {
		this.mobile = mobile;
	}

	/**
	 * Get the level id
	 * 
	 * @return id
	 */

	public int getId() {
		return id;
	}

	/**
	 * Set the level id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the list of mobile elements
	 */

	public ArrayList<IMobile> getMobile() {

		return (ArrayList<IMobile>) mobile.clone();
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFinished(boolean finished) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createSpell(int y, int x, Movement movement) {
		// TODO Auto-generated method stub

	}

}
