package Prog.gl.DAO.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BDD {
	
	 Connection connection ;

	public BDD() throws SQLException {
		this.connection = getConnection();
	}
	
	 /*	se connecter a hsql DB
	  * */
	private static Connection getConnection() throws SQLException {
	    	return DriverManager.getConnection("jdbc:hsqldb:file:Data/db", "ufr", "ufr");   
	 }
	
	/*	fermer la connexion avec la base de donne
	 */
	public void	Deconnexion() throws SQLException
	{
		 DriverManager.getConnection("jdbc:hsqldb:file:Data/db;shutdown=true", "ufr", "ufr");

	}
	    
	 
	public void creationPersonnelTable() throws SQLException
	{
		Statement statement = connection.createStatement();
		statement.execute("CREATE TABLE IF NOT EXISTS  personnel (ID INT, nom VARCHAR(50),prenom VARCHAR(50),  numeroTel VARCHAR(10), fonction VARCHAR(100))");


	        
	}
	public void dropPersonnelTable() throws SQLException
	{
		Statement statement = connection.createStatement();
		statement.execute("DROP TABLE personnel");

	   
	        
	}
	

	
	

}
