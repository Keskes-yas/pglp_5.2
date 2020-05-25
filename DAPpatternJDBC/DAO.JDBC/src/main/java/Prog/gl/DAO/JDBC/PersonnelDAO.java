package Prog.gl.DAO.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PersonnelDAO extends DAO<Personnel> {

	

	public PersonnelDAO(Connection conn) {
		super(conn);
		
	}


	/**
	 * implementing create method
	 */
	public boolean create(Personnel p) {
		boolean bool = false ;
		int res = 0 ;
		
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("INSERT INTO personnel VALUES (?, ?, ?, ?, ?)");
			ps.setLong(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());
			ps.setString(4, p.getNumeroTel());
			ps.setString(5, p.getFonction());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
			
		if(res == 1)
			bool = true ;
		
		return bool;
	}

	/**
	 * implement delete method for personnel 
	 */
	public boolean delete(Personnel p) {
		boolean bool = false ; 
		int res = 0 ;
		
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("DELETE FROM personnel WHERE ID = ? ");
			ps.setLong(1, p.getId());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
			
		if(res == 1)
			bool = true ;
		
		return bool;
		
	}

	/**
	 * implement update method for personnel
	 */
	public boolean update(Personnel p) {
		boolean bool = false ;
		int res = 0 ;
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("UPDATE personnel SET nom = ?, prenom = ?,  numeroTel = ?, fonction = ? WHERE ID = ? ");
			ps.setLong(1, p.getId());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
			
		if(res == 1)
			bool = true ;
		
		return bool;
	}

	/**
	 * implement find method
	 */
	public Personnel find(int id) {
		Personnel per = null ;
		
		
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("SELECT * FROM personnel  WHERE ID = ? ");
			ps.setLong(1, id);
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				String nom = res.getString("nom");
				String prenom = res.getString("prenom");
			
				String tel = res.getString("numeroTel");
				String fonction = res.getString("fonction");
				per = new Personnel(id,nom, prenom, tel, fonction);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return per;
	}

}
