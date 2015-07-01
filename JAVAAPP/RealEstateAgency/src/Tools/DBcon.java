/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author halloul
 */
public class DBcon {

	/**
	 * 
	 */
	static String		url     = "jdbc:mysql://localhost:3306/realestatedb";
	static String		user	= "root";
	static String		pass	= "";
	static Connection	con;
	static Statement	ste;

	private DBcon() {

		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection ok ! ");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static Connection getInstance() {

		if (con == null)
			new DBcon();

		return con;
	}

	/*
	 * 
	 * try {
	 * 
	 * 
	 * 
	 * 
	 * String queryInsert = " insert into personne (nom, prenom, age)" +
	 * " values (?, ?, ?)";
	 * 
	 * con.prepareStatement(""); // create the mysql insert preparedstatement
	 * PreparedStatement preparedStmt = con.prepareStatement(queryInsert);
	 * preparedStmt.setString (1, "hamdi"); preparedStmt.setString (2, "saoud");
	 * preparedStmt.setInt (3, 1);
	 * 
	 * execute the preparedstatement preparedStmt.execute();
	 * 
	 * ste = con.createStatement(); String queryInsert =
	 * " insert into personne (nom, prenom, age)" +
	 * " values ('lol', 'mkdir', 5)";
	 * 
	 * int nb = ste.executeUpdate(queryInsert); // System.out.println(nb);
	 * String querySelect = "select * from personne";
	 * 
	 * ResultSet res; res = ste.executeQuery(querySelect);
	 * 
	 * while (res.next()) { System.out.println(res.getInt("id") + "   " +
	 * res.getString("nom") + "  " + res.getString("prenom") + "   " +
	 * res.getInt("age")
	 * 
	 * );
	 * 
	 * }
	 * 
	 * } catch (SQLException ex) {
	 * 
	 * System.out.println(ex);
	 * 
	 * }
	 */
}
