package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministrarConexion {
	
	protected Connection conn = null ;
	protected PreparedStatement pstm = null;
	protected ResultSet rs = null;
	
	protected Statement stm = null;
	
	protected Connection generaConexion() throws SQLException {
		
		String user = "SYSTEM" ;
		String pass = "123456" ;
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ; 
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	

}
