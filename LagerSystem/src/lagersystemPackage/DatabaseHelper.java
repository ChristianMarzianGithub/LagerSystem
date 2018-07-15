package lagersystemPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {
	
	public static Connection createConnection(String server, String port, String database, String usr, String pw) {
		Connection retValCon = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		try {
			Connection con;				
			
			retValCon = DriverManager.getConnection(  
			"jdbc:mysql://" +server+ ":"+ port + "/" + database,usr,pw);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	
		
		return retValCon;
	}

	public static ResultSet sqlQuery(Connection con, String sqlStatement) {
		ResultSet rs = null;
		
		
		Statement st;
		try {
			st = con.createStatement();
			rs=st.executeQuery(sqlStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				/*				
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +"  "+rs.getString(4));
		}
		con.close();
		retVal = true;
		*/
		
		
		return rs;
	}
}
