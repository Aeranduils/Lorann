package elements;

/**
 * 
 * @author flori
 *
 */

public class Door extends Element {

	private boolean open;

	/**
	 * 
	 * @param y
	 *            Y position of the element
	 * @param x
	 *            X position of the element
	 */
	public Door(int y, int x) {
		super("gate_closed.png", y, x);
	}

	/**
	 * 
	 * @return false
	 */

	public boolean isOpen() {
		return false;
	}

	/**
	 * 
	 * @param open
	 * @return true
	 */
	public boolean setDoorOpen(boolean open) {
		return this.open = true;
	}
}
