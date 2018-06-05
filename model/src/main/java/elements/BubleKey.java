package elements;

/**
 * 
 * @author flori A Key that open the door
 *
 */

public class BubleKey extends Items {

	/**
	 * 
	 * @param y
	 *            Y position of the element
	 * @param x
	 *            X position of the element
	 */

	public BubleKey(int y, int x) {
		super("crystal_ball.png", y, x);
	}

	public int getValue() {
		return 150;
	}
}
