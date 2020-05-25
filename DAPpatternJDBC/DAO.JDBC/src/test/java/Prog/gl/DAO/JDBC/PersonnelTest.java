package Prog.gl.DAO.JDBC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Prog.gl.DAO.JDBC.Personnel;



public class PersonnelTest {
	Personnel p;
@Before
public void init() {
	p = new Personnel(1234,"keskes", "yasmine", "+3312345678","");
}

@Test
public void setidTest() {
	p.setId(5678);
	assertEquals(5678,p.getId());
}

@Test
public void setNomTest() {
	p.setNom("maeva");
	assertEquals("maeva",p.getNom());
}

@Test
public void setPrenomTest() {
	p.setPrenom("maeva");
	assertEquals("maeva",p.getPrenom());
}

@Test
public void setTelTest() {
	p.setNumeroTel("+33987654321");
	assertEquals("+33987654321",p.getNumeroTel());
}

@Test
public void setFonctionTest() {
	p.setFonction("function");
	assertEquals("function",p.getFonction());
}

}
