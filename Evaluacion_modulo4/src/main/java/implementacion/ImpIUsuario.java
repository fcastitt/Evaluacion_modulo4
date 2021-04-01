package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import conexion.Conexion;
import interfaces.IConsultas;
import modelo.Usuario;

public class ImpIUsuario implements IConsultas<Usuario> {

	@Override
	public List<Usuario> listado() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		String consultaSql = "Select * From USUARIO";
		
		List<Usuario> listado = new ArrayList<Usuario>();

	
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(consultaSql); //la tabla de oracle
			  
			System.out.println("rs: " + rs.toString());
			
			while (rs.next()) { // mientras tenga algo , sigue
				Usuario usuario = new Usuario();

				usuario.setRunUsuario(rs.getInt("RUNUSUARIO"));
				usuario.setUsNombre(rs.getString("USNOMBRE"));
				usuario.setUsApellido(rs.getString("USAPELLIDO"));
				usuario.setUsNacimiento(rs.getString("USNACIMIENTO"));

				listado.add(usuario);

			}

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIUsuario, "
					+ "metodo listado");
			
			e.printStackTrace();
		}

		return listado;
	}

	@Override
	public boolean registrar (Usuario dato) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String consultaSql = "INSERT INTO USUARIO (RUNUSUARIO, USNOMBRE, USAPELLIDO, USNACIMIENTO) VALUES ('"
				+ dato.getRunUsuario() + "', '" + dato.getUsNombre() + "', '" + dato.getUsApellido() + "', '"
				+ dato.getUsNacimiento() + "')";

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			
			registrar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIUsuario, "
					+ "metodo registrar");
			 
			e.printStackTrace();
		}

		return registrar;  
	}

	@Override
	public boolean eliminar(Integer dato) {

		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String consultaSql = "DELETE FROM USUARIO WHERE USUARIO_RUNUSUARIO = "+ dato+ " " ;
		
		 

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			eliminar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIUsuario, "
					+ "metodo eliminar");
			
			e.printStackTrace();
		}
 
		return eliminar ;
		 
	}
 
	@Override
	public boolean actualizar(Usuario dato) {
		
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
 
		String consultaSql = "UPDATE USUARIO " 
							+ "SET USNOMBRE = '"+dato.getUsNombre()+"', USAPELLIDO = '"+dato.getUsApellido()+"', USNACIMIENTO = '"+dato.getUsNacimiento()+"' " 
							+ "WHERE RUNUSUARIO = " + dato.getRunUsuario() + "  ";

		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			actualizar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIUsuario, "
					+ "metodo actualizar");
			
			e.printStackTrace();
		} 

		return actualizar; 
		
	}

}
