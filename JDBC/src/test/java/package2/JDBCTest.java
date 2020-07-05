package package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class JDBCTest {
   
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {	
		
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/First_DB";					

		//Database Username		
		String username = "nikhil";	
        
		//Database Password		
		String password = "shrihanuman_89";				


        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.cj.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();	
	   Statement stmt1 = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery("select *  from employees;");		

 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String ID = rs.getString(1);			// IMP: index of first column is 1					        
                    String name = rs.getString(2);	
                    String age = rs.getString(3);	
                    String sex = rs.getString(4);
                    System. out.println(ID+"  "+name +" " + age+"  "+sex);		
            }		
		
		ResultSet rs1= stmt.executeQuery("select sex  from employees where age=25 or age=67;");
		
		while (rs1.next()){
            System. out.println(rs1.getString(1));		
    }
		
			 // closing DB Connection		
			con.close();			
}
	
	
}
