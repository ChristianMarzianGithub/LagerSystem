package lagersystemTestPackage;

import java.sql.Connection;

import junit.framework.Assert;
import lagersystemPackage.DatabaseHelper;

public class DatabaseHelperTest {
	@org.junit.Test
	public void testCreateConnection() {
		String server,port,database,usr,pw;
		server = "localhost";
		port = "3306";
		database="test";
		usr="root";
		pw="";
		Assert.assertTrue(DatabaseHelper.createConnection(server,port,database,usr,pw)!=null);
	}
	
	@org.junit.Test
	public void testSQLStatement() {
		String server,port,database,usr,pw;
		server = "localhost";
		port = "3306";
		database="test";
		usr="root";
		pw="";
		Connection con = DatabaseHelper.createConnection(server,port,database,usr,pw);
		String sqlStatement = "Select * from Customers";
		Assert.assertTrue(DatabaseHelper.sqlQuery(con, sqlStatement) != null);
	}
}
