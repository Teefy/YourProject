

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectMySQL {

	public static void connection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String ConnectionToMySql(String SqlInput) {
		connection();
		String resultaat = null;

		String host = "jdbc:mysql://192.168.50.163:3306/yourdb";
		String username = "Your";
		String password = "Your";

		try {
			Connection connect = DriverManager.getConnection(host, username, password);
			PreparedStatement statement = (PreparedStatement) connect .prepareStatement(SqlInput);
			ResultSet data = statement.executeQuery();
			data.next();

			Object obj = data.getObject("medewerker_adres");
			resultaat = obj.toString();
			statement.close();
			connect.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultaat;
	}
}
