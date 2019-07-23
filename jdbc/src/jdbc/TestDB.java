package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class TestDB {

	public static void main(String[] args) throws SQLException, ParseException {
		//OracleDriver driver = new OracleDriver();
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Success");
		/*String query ="insert into student values(106,'Shashi',300)";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		int rows =2;*/
		int id;
		String name;
		int marks;
		String dob;
		String query;
		PreparedStatement pst;
		Scanner scan =new Scanner(System.in);
		System.out.println(" 1.New Student \n 2.Update marks \n 3.Delete Student record \n 4.Display all records \n 5.Exit");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		int breakFlag=0;
		while(choice!=0 && breakFlag==0){
			
		switch(choice)
		{
		case 1:
	    	System.out.println("Enter id:");		
	    	id = scan.nextInt();
	    	System.out.println("Enter name:");		
	    	name = scan.next();
	    	System.out.println("Enter marks:");		
	    	marks= scan.nextInt();
	    	System.out.println("Enter D.O.B in format dd-mm-yyyy:");
	    	dob = scan.next();	    	
	    	query = "insert into student values(?,?,?,?)";
	    	pst = con.prepareStatement(query);
	    	pst.setInt(1, id);
	    	pst.setString(2, name);
	    	pst.setInt(3, marks);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(dob);
			pst.setString(4, date);
	    	pst.executeUpdate();
	    	System.out.println("*********Inserted row*********");
	    	break;
		case 2:
			System.out.println("Enter id:");		
	    	id = scan.nextInt();
	    	System.out.println("Enter name:");		
	    	name = scan.next();
	    	System.out.println("Enter marks:");		
	    	marks= scan.nextInt();
	    	query = "update student set stdname=?,marks=? where regno=?";
	    	pst = con.prepareStatement(query);
	    	pst.setString(1, name);
	    	pst.setInt(2, marks);
	    	pst.setInt(3, id);
	    	pst.executeUpdate();
	    	System.out.println("*********Update successful*********");
	    	break;
			
		case 3:
			System.out.println("Enter id:");		
	    	id = scan.nextInt();
	    	query = "delete from student where regno=?";
	    	pst = con.prepareStatement(query);
	    	pst.setInt(1, id);
	    	pst.executeUpdate();
	    	System.out.println("*********Record deleted*********");
	    	break;
		case 4:
			query = "select * from student order by regno";
			pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println("\n-----------------------------------------------");
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+" "+rs.getInt(3));			
			break;
		case 5:
			System.out.println("*****Exited Application*****");
			choice=0;
			breakFlag=1;
			break;
			
		default:
			System.out.println("Invalid choice.Enter only above options");
		}
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" 1.New Student \n 2.Update marks \n 3.Delete Student record \n 4.Display all records \n 5.Exit");
			System.out.println("Enter your choice:");
			choice = scan.nextInt();
	    
			
			
		}
		
		
		con.close();
		scan.close();

	}

}
