package project_pkg;
import java.sql.*;

public class DatabaseConnector {
	
	private Connection dbConnection;
	private Statement dbStatement;
	
	//constructor
	public DatabaseConnector(String url, String username, String password) throws Exception{
		try{
			dbConnection = DriverManager.getConnection(url, username, password);
			dbStatement =  dbConnection.createStatement();
		}
		catch(SQLException e) {
			throw new IllegalArgumentException("Error: Failed to establish connection to with database, invalid parameters.\n" + e.toString());
		}
	}
	
	private ResultSet runQuery(String query) throws Exception{
		try {
			return(dbStatement.executeQuery(query));
		}
		catch(SQLException e){
			throw new IllegalArgumentException("Error: database query failed" + e.toString());
		}
	}
}
