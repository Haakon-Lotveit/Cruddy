package cruddy;

import java.sql.SQLException;

/**
 * ConnectionProvider is a small functional interface, whose job is simple:
 * Represent some sort of way, to get hold of a connection. This can be by hook or by crook.
 * While the suggested method is to use HikarCP to pool connections to a database, 
 * this can be overkill early on, when you just want to connect.
 * This is one of the few classes that you have to implement yourself, and you have to feed it
 * to the DAOs for them to have any hope of talking to a database.
 */
@FunctionalInterface
public interface ConnectionProvider {
	
	/**
	 * This method must provide a valid SQL connection, or if that fails, throw an SQLException.
	 * A valid connection may not be closed, and you must be allowed to do the needed operations
	 * on the data in the database. (What exactly those are vary by the queries being run.)
	 * In general you need to Create, Read, Update and Delete data.
	 * @return a valid SQL connection that can be used to run queries from.
	 * @throws SQLException if something goes wrong getting hold of said connection.
	 */
	public java.sql.Connection provideConnection() throws SQLException;

}
