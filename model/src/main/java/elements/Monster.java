package elements;

import model.Movement;

/**
 * 
 * @author flori
 *
 */
public class Monster extends Mobile {

	private MonsterStrategy strategy;

	/**
	 * The Monster
	 * 
	 * @param image
	 * @param y
	 *            Y position
	 * @param x
	 *            X position
	 */
	public Monster(int y, int x, Movement direction) {
		super("monster_1.png", y, x);

	}

	/**
	 * Set the monster strategy
	 * 
	 * @param strategy
	 */
	public void setMonsterStrategy(MonsterStrategy strategy) {
		this.strategy = strategy;

	}

	/**
	 * Get the monster strategy
	 * 
	 * @return strategy
	 */
	public MonsterStrategy getMonsterStrategy() {
		return strategy;
	}

	/**
	 * Move
	 */

	public void move() {
		strategy.move();
	}

}
