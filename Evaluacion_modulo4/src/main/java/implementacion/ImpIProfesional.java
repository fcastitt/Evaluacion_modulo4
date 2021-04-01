package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaces.IConsultas;
import modelo.Profesional;

public class ImpIProfesional implements IConsultas<Profesional> {

	@Override
	public List<Profesional> listado() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
 
		String consultaSql = "select * from USUARIO , PROFESIONAL where usuario.runusuario = profesional.usuario_runusuario";

		List<Profesional> listado = new ArrayList<Profesional>();
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(consultaSql); //la tabla de oracle
			  
			System.out.println("rs: " + rs.toString());

			while (rs.next()) { // mientras tenga algo , sigue
				Profesional profesional = new Profesional();
				
				profesional.setRunUsuario(rs.getInt("RUNUSUARIO"));
				profesional.setUsNombre(rs.getString("USNOMBRE"));
				profesional.setUsApellido(rs.getString("USAPELLIDO"));
				profesional.setUsNacimiento(rs.getString("USNACIMIENTO"));

				profesional.setUsuarioRunUsuario(rs.getInt("USUARIO_RUNUSUARIO"));
				profesional.setProTelefono(rs.getString("PROTELEFONO"));
				profesional.setProTitulo(rs.getString("PROTITULO"));
				profesional.setProProyecto(rs.getString("PROPROYECTO"));

				listado.add(profesional);

			}

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIProfesional, "
					+ "metodo listado");
			
			e.printStackTrace();
		}

		return listado;

	}

	@Override
	public boolean registrar (Profesional dato) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String consultaSql = "INSERT INTO PROFESIONAL (USUARIO_RUNUSUARIO, PROTELEFONO, PROTITULO, PROPROYECTO) VALUES ('"
		+ dato.getUsuarioRunUsuario() + "', '" + dato.getProTelefono() + "', '" + dato.getProTitulo() + "', '" 
		+ dato.getProProyecto()+"')";

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			
			registrar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIProfesional, "
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

		String consultaSql1 = "DELETE FROM PROFESIONAL WHERE USUARIO_RUNUSUARIO = "+ dato+ " " ;
		String consultaSql2 = "DELETE FROM USUARIO WHERE RUNUSUARIO = "+ dato+" " ;

		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql1);
			eliminar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIProfesional, "
					+ "metodo eliminar");
			
			e.printStackTrace();
		}
		
		con = null;
		stm = null;
		
		eliminar = false;
		
		try {
			
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql2);
			eliminar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpICliente, "
					+ "metodo eliminar 2");
			
			e.printStackTrace();
		}
		
		return eliminar ; 
		
	}
	
	@Override
	public boolean actualizar(Profesional dato) {
		
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;

		String consultaSql = "UPDATE PROFESIONAL " 
							+ "SET PROTELEFONO = '" + dato.getProTelefono() + "', PROTITULO = '" + dato.getProTitulo()  + "', PROPROYECTO = '" + dato.getProProyecto() + "' "
							+ "WHERE USUARIO_RUNUSUARIO = " + dato.getUsuarioRunUsuario() + "  ";
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			actualizar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpIProfesional, "
					+ "metodo actualizar");
			
			e.printStackTrace();
		}
		
		return actualizar; 
		
	}

}
