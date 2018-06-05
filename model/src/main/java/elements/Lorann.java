package elements;

import model.ILorann;
import model.Movement;

/**
 * 
 * @author flori
 *
 */

public class Lorann extends Mobile implements ILorann {

	private boolean permeability;
	private boolean spell;
	private int score = 0;
	private boolean alive;

	/**
	 * The lorann player
	 * 
	 * @param y
	 * @param x
	 */
	public Lorann(int y, int x) {
		super("lorann_l.png", y, x);
		this.setAlive(true);
	}

	/**
	 * Move lorann up
	 */

	/**
	 * GET PERMEABILITY
	 * 
	 * @return true
	 */

	public boolean getPermeability() {
		return setPermeability(true);

	}

	/**
	 * Get the score
	 * 
	 * @return score
	 */

	public int getScore() {
		return score;
	}

	/**
	 * is permeability ?
	 * 
	 * @return permeability
	 */
	public boolean isPermeability() {
		return permeability;
	}

	/**
	 * Set the permeability
	 * 
	 * @param permeability
	 * @return permeability
	 */
	public boolean setPermeability(boolean permeability) {
		this.permeability = permeability;
		return permeability;
	}

	/**
	 * isAlive ?
	 * 
	 * @return alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * Set alive
	 * 
	 * @param alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setSpell(boolean spell) {
		this.spell = spell;

	}

	@Override
	public void setMovement(Movement direction) {
		this.direction = direction;

	}

}
