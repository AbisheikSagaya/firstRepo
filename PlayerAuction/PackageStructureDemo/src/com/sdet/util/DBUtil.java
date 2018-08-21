package com.sdet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * This class provides utility methods for establishing and releasing database
 * connection. It provides methods to release various resources used in database
 * connection.
 */
public class DBUtil {

	/**
	 * 
	 * @return database connection
	 * @throws DBUtilityException
	 *             This method is meant to establish database connection, and
	 *             returns the Connection object after successfully establishing
	 *             the connection.
	 */
	public  DBUtil()
	{
		
	}
	public  Connection getConnection() throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/playerauctiondb","root","Welcome123");

		
		

		return connection;
	}

	/**
	 * 
	 * @param con
	 * @throws DBUtilityException
	 *             This method is meant to release the instance of Connection
	 *             class.
	 */
	public static void releaseResource(Object object) {
		
	}

}
