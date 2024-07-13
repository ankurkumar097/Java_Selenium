package MySQL_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Commands {

	public static void main(String[] args) throws SQLException {
		
		// 1. Creating a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
		// 2. Creating statement/query
		Statement stmt = con.createStatement();
		
		//DML Commands
		//String S = "INSERT INTO STUDENT VALUES (105,'SMITH')";
		//String S = "UPDATE STUDENT SET SNAME = 'ROBIN' WHERE SID =102;";
		//String S = "DELETE FROM STUDENT WHERE SID = 101";
		
		
		//DQL Command - SELECt
		String s = "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES";
		
		
		// 3. Executing statement/query
		//DML Commands
		//stmt.execute(s);
		
		//DQL Commands
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next()) {
			int eID = rs.getInt("EMPLOYEE_ID");
			String sName = rs.getString("FIRST_NAME");
			System.out.println(eID+"      "+sName);
		}
		
			
		// 4. Close connection
		con.close();
		
		System.out.println("Query executed ..");
	}

}
