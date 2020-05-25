package Prog.gl.DAO.JDBC;
import java.sql.Connection;


public abstract class DAO<T> {
	
	protected Connection connect = null;
	   
	/**
	 * connect to the database
	 * @param conn
	 */
	  public DAO(Connection conn){
	    this.connect = conn;
	  }
	  
	  	/**
	  	 * insert the object into the database
	  	 * abstract method
	  	 * @param obj
	  	 * @return
	  	 */
	  	public abstract boolean create(T obj);
	  	
	  	/**
	  	 * abstract method
	  	 * delete the object from the database
	  	 * @param obj
	  	 * @return
	  	 */
	  	public abstract boolean delete(T obj);
	  	
	  	/**
	  	 * abstract method
	  	 * it update the object obj 
	  	 * @param obj
	  	 * @return
	  	 */
	  	public abstract boolean update(T obj);
	  	
	  	/**
	  	 * it search the object id and return it
	  	 * @param id
	  	 * @return
	  	 */
	  	public abstract T find(int id);


}
