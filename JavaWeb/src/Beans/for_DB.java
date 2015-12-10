package Beans;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/**
 * 
 * USAGE: 
 *  1.new for_DB 2.open_Mysql 3.execute Mysql procedures 4.close_mysql
 *  ResultSet res = stmt.executeQuery("select xxx_PROCEDURE");
 *  ResultSet 's column & row  data output
 *
 */
public class for_DB {
//JDBC connection for MySQl
	Connection con;
	Statement statement;
	public  Statement open_Mysql(){
      try {
		Class.forName("org.gjt.mm.mysql.Driver");
		this.con = DriverManager.getConnection("jdbc:mysql://192.168.1.91:3306/yx", "root", "root");
		this.statement=con.createStatement();
		//  ResultSet res = stmt.executeQuery("select xxx_PROCEDURE");
		//  ResultSet 's column & row  data output
		return this.statement;
   } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public  void close_Mysql(){
		try {
			this.con.close();
			this.statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
