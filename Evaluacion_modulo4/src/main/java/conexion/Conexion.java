package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection conn = null;
	private static Conexion ec ;

	private Conexion() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "SYSTEM";
		String password = "123456";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
			System.out.println("conn: " + conn.toString());

		} catch (ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Metodos
	public static Connection conectar() {

		try {
			if (conn != null) {
				if (conn.isClosed()) {
					conn = null;
					ec = null;
				}
			}

			if (conn == null) {
				ec = new Conexion();
			}

			System.out.println("conn(2): " + conn.toString());

			System.out.println("conn(2): " + conn.getSchema());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
	// Fin conectar

}
