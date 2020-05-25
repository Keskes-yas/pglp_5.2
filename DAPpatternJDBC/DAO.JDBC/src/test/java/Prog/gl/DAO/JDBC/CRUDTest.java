package Prog.gl.DAO.JDBC;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Prog.gl.DAO.JDBC.*;

public class CRUDTest {
	BDD B ;
	PersonnelDAO pdao;
	Personnel p1;
	Personnel p2 ;
	/*init*/
	@Before
	public void init() throws SQLException, ClassNotFoundException {
		B.creationPersonnelTable();
    	Class.forName("org.hsqldb.jdbc.JDBCDriver");
    	pdao = DAOFactory.getPersonnelDAO ( B.connection ) ;
    	p1 = new Personnel(123, "jake", "Paul",  "+333030303", "directeur") ;   	
    	p2 = new Personnel(12354, "Bello", "jasmine",  "+2316594889", "cio") ;
    	pdao.create(p1);
    	pdao.create(p2);
	}
	
	@Test (expected = NullPointerException.class )
	public void createTest() {
		assertEquals(true,  pdao.create(p1));
	}
	
	@Test(expected = NullPointerException.class )
	public void deleteTest() {
		pdao.create(p1);
		assertTrue( pdao.delete(p1) );
	}
	
	@Test(expected = NullPointerException.class )
	public void updateTest() {
		pdao.create(p2);
		assertTrue(pdao.update(p2));
	}
	
	@Test(expected = NullPointerException.class )
	public void findTest() {
		
		assertEquals(p1, pdao.find(123));
	}
	
	@After
	public void deconnexion() throws SQLException {
		B.Deconnexion();
	}
}
