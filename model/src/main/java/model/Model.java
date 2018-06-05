package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import elements.BallWall;
import elements.BubleKey;
import elements.Door;
import elements.Gold;
import elements.HorizontalWall;
import elements.Level;
import elements.Lorann;
import elements.Monster;
import elements.VerticalWall;
import model.dao.LorannBDDConnector;

/**
 * 
 * @author flori
 *
 */
public class Model extends Observable implements IModel {

	private Level level;
	private ILorann lorann;
	private ArrayList<Integer> levelId;

	/**
	 * The Lorann Model
	 */
	public Model() {

		this.lorann = new Lorann(1, 1);

	}

	/**
	 * Load the tuto level
	 */
	public void loadTuto1() {

		this.level = new Level(1, 20, 12, new Lorann(1, 1), 1);
		this.level.setElement(10, 5, new VerticalWall(10, 5));
		this.level.setElement(1, 5, new VerticalWall(1, 5));
		this.level.setElement(19, 5, new VerticalWall(19, 5));
		this.level.setElement(18, 6, new Door(5, 7));

	}

	/**
	 * Get the level
	 * 
	 * @return level
	 */
	public final Level getLevel() {
		return this.level;
	}

	/**
	 * Load level tuto ?
	 * 
	 * @return true
	 */

	public boolean loadLevel() {
		this.loadTuto1();
		return true;

	}

	/**
	 * Tell that data has changed
	 */
	public void flush() {
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Get the observable
	 * 
	 * @return this
	 */
	public Observable getObservable() {
		return this;
	}

	/**
	 * Get element position
	 * 
	 * @return Element position (y,x)
	 * 
	 */

	public IElement getElement(int y, int x) {
		return this.level.getElement(y, x);
	}

	/**
	 * Get element tab
	 * 
	 * @return element tab
	 */
	public IElement[][] getElements() {
		return this.level.getElements();
	}

	/**
	 * Get the lorann player
	 * 
	 * @return lorann
	 */

	public final ILorann getLorann() {
		return this.lorann;
	}

	/**
	 * Get the level ID
	 * 
	 * @return level ID
	 */

	public ArrayList<Integer> getLevelId() {
		return levelId;
	}

	/**
	 * Load tuto ?
	 * 
	 * @return true
	 */

	public boolean loadTuto() {
		return true;
	}

	public boolean loadLevel(int id) {
		LorannBDDConnector dbConnection = LorannBDDConnector.getInstance();
		try {
			ResultSet rawLevel = dbConnection.getLevelById(id);
			if (rawLevel.first()) {
				this.level = new Level(rawLevel.getInt(1), rawLevel.getInt(3), rawLevel.getInt(4), this.lorann,
						rawLevel.getInt(2));
			} else {
				System.err.println("The level " + id + " doesn't exists");
				this.loadTuto1();
			}
			ResultSet rawElements = dbConnection.getElementsByIdLevel(id);
			while (rawElements.next()) {
				if (rawElements.getString(2).equals("cross-wall")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new BallWall(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("vertical-wall")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new VerticalWall(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("horizontal-wall")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new HorizontalWall(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("door")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new Door(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("life-bubble")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new BubleKey(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("money")) {
					this.level.setElement(rawElements.getInt(3), rawElements.getInt(4),
							new Gold(rawElements.getInt(3), rawElements.getInt(4)));
				} else if (rawElements.getString(2).equals("hero")) {
					IPosition loc = this.level.getLorann().getPosition();
					loc.setX(rawElements.getInt(3));
					loc.setY(rawElements.getInt(4));
					this.level.getLorann().setDirection(Movement.valueOf(rawElements.getString(5)));
				} else if (rawElements.getString(2).equals("monster")) {
					this.level.addMobile(new Monster(rawElements.getInt(3), rawElements.getInt(4),
							Movement.valueOf(rawElements.getString(5))));
				} else {
					System.err.println("Unsupported element " + rawElements.getString(2) + " at "
							+ rawElements.getInt(3) + ":" + rawElements.getInt(4));
				}
			}
		} catch (SQLException e) {
			System.err.println("SQL error : " + e.getMessage());
			e.printStackTrace();
			this.loadTuto1();
			return false;
		}
		this.lorann.setAlive(true);
		this.lorann.setSpell(true);
		return true;
	}

}
