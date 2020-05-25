package Prog.gl.DAO.JDBC;

import java.sql.Date;

public class Personnel implements Serializable{
	//Attributs
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String numeroTel;
	private String fonction;
	
	
	
	/**
	 * create an instance of Personnel
	 * @param ID
	 * @param nom
	 * @param Prenom
	 * @param naissance
	 * @param tel
	 * @param fonction
	 */
	public Personnel(int ID, String nom,String Prenom,  String tel, String fonction)
	{
		this.id = ID ;
		this.nom = nom ;
		this.prenom = Prenom ;
		this.numeroTel = tel ;
		this.fonction = fonction ;
	}
	
	//Getters & setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	//methods
	
	public void create() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
