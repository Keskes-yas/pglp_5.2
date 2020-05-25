package Prog.gl.DAO.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {	BDD B = new BDD();
    	B.creationPersonnelTable();
    	Class.forName("org.hsqldb.jdbc.JDBCDriver");
    	DAO<Personnel> p = DAOFactory.getPersonnelDAO ( B.connection ) ;
    	@SuppressWarnings("deprecation")
		Date d = new Date(2000, 3, 12) ;
    	 Personnel p1 = new Personnel(123, "jake", "Paul" , "+333030303", "directeur") ;   	
    	p.create(p1);
    	p.find(123);
    	B.Deconnexion();
    	
    }
}
