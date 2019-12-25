package com.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class TestDBOperations{
	private static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	private static final String JDBC_URL="jdbc:mysql://localhost:3306/test";
	private static final String USER_NAME="root";
	private static final String PASSWORD="umang";
	
	private Connection conn=null;
	private Statement stmt=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
//	static{
//		try{
//			//Register jdbc driver
//			Class.forName(JDBC_DRIVER);
//		}
//		catch(Exception e){
//			System.out.println("Unable to register driver");
//		}
//	}
	
	public Connection openConnection(){
		try{
			//Open database connection
			conn=DriverManager.getConnection(JDBC_URL,USER_NAME,PASSWORD);
			//DriverManager.getConnection("server=jdbc:mysql://localhost:3306;database=test;user=root;password=umang");
		}
		catch(Exception e){
			System.out.println("connection not established");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public void fetchRecords(){
		try{
			conn=openConnection();
			String query="select * from emp";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("salary");
				System.out.println("id="+id+",name="+name+",salary="+salary);
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void insertRecord(){
		try{
			conn=openConnection();
			String query="insert into emp(name,salary)values(?,?)";
			ps=conn.prepareStatement(query);
			ps.setString(1, "automation tester");
			ps.setInt(2, 10000);
			Boolean status=ps.execute();
			System.out.println(status);
			if(status){
				System.out.println("Data inserted");
			}
			else{
				System.out.println("Data not inserted");
			}
			ps.close();
			conn.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDBOperations ob=new TestDBOperations();
		//ob.insertRecord();
		ob.fetchRecords();
	}

}
