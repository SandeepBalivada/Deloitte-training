package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class TestResultSet {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		String query = "select regno,stdname,marks from student";
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery(query);
		/*rs.absolute(1);
		rs.updateString(2,"Darshi");
		rs.updateRow();*/
		rs.absolute(3);
		rs.updateString(2, "Rajesh");
		rs.updateRow();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		
		
	}

}
