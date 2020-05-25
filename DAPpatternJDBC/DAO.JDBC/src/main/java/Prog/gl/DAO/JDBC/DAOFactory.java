package Prog.gl.DAO.JDBC;

import java.sql.Connection;

public class DAOFactory {
	
	/**
	 * 
	 * @param connect
	 * @return
	 */
	public static PersonnelDAO getPersonnelDAO(Connection connect){
		
		return new PersonnelDAO(connect);
	}
}
