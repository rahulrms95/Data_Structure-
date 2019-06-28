package db.sql.jdbc;

import java.sql.Connection;
import java.util.List;

public class DBOperation implements Operations<String,String>{

	private Connection con ;
	
	public DBOperation()
	{
		con = DBConnection.getConnection();
	}

	/**
	 * @param String containing information which needs be updated in Database
	 * {@value} is JSONObject String 
	 * To update database table of users
	 * @return String 
	 * **/
	@Override
	public String update(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insert(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAll(String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String find(String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
