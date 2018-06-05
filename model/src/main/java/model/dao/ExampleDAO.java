package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author flori
 *
 */

public abstract class ExampleDAO extends EntityDAO {

	/** The sql example by id. */
	private static String sqlLevelById = "{call findLevelById(?)}";

	/** The sql example by name. */
	private static String sqlElementsByIdLevel = "{call findElementsByIdLevel(?)}";

	/** The sql all examples. */
	private static String sqlAllLevels = "{call findAllLevels()}";

	/**
	 * Gets the level by id.
	 *
	 * @param id
	 *            the id
	 * @return the level by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static ResultSet getLevelById(final int id) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlLevelById);
		callStatement.setInt(1, id);
		callStatement.execute();
		return callStatement.getResultSet();
	}

	/**
	 * Gets the elements by idlevel.
	 *
	 * @param elements
	 *            the elements
	 * @return the elements by idlevel
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static ResultSet getElementsByIdLevel(final int idLevel) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlElementsByIdLevel);
		callStatement.setInt(1, idLevel);
		callStatement.execute();
		return callStatement.getResultSet();
	}

	/**
	 * Gets the all levels.
	 *
	 * @return the all levels
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static ResultSet getAllLevels() throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlAllLevels);
		callStatement.execute();
		return callStatement.getResultSet();
	}
}
