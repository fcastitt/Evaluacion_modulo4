package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaces.IConsultas;
import modelo.Administrativo;

public class ImpIAdministrativo implements IConsultas<Administrativo> {

	@Override
	public List<Administrativo> listado() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		String consultaSql = "select * from USUARIO , ADMINISTRATIVO where usuario.runusuario = administrativo.usuario_runusuario";

		List<Administrativo> listado = new ArrayList<Administrativo>();
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(consultaSql); //la tabla de oracle
			  
			System.out.println("rs: " + rs.toString());

			while (rs.next()) { // mientras tenga algo , sigue

				Administrativo administrativo = new Administrativo();
				
				administrativo.setRunUsuario(rs.getInt("RUNUSUARIO"));
				administrativo.setUsNombre(rs.getString("USNOMBRE"));
				administrativo.setUsApellido(rs.getString("USAPELLIDO"));
				administrativo.setUsNacimiento(rs.getString("USNACIMIENTO"));
 
				administrativo.setUsuarioRunUsuario(rs.getInt("USUARIO_RUNUSUARIO"));
				administrativo.setAdCorreo(rs.getString("ADCORREO"));
				administrativo.setAdArea(rs.getString("ADAREA"));

				listado.add(administrativo);

			}

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpIAdministrativo, "
					+ "metodo listado");
			
			e.printStackTrace();
		}

		return listado;

	}

	@Override
	public boolean registrar (Administrativo dato) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String consultaSql = "INSERT INTO ADMINISTRATIVO (USUARIO_RUNUSUARIO, ADCORREO, ADAREA) VALUES ('"
				+ dato.getUsuarioRunUsuario() + "', '" + dato.getAdCorreo() + "', '" + dato.getAdArea() + "')";

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			
			registrar = true;
			stm.close();
			con.close();
			 

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpIAdministrativo, "
					+ "metodo registrar");
			 
			e.printStackTrace();
		}

		 return registrar ; 

	}

	@Override
	public boolean eliminar(Integer dato) {
		
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;

		String consultaSql1 = "DELETE FROM ADMINISTRATIVO WHERE USUARIO_RUNUSUARIO = "+ dato+ " " ;
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
					+ "Clase ImpICliente, "
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
	public boolean actualizar(Administrativo dato) {
		
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;

		String consultaSql = "UPDATE ADMINISTRATIVO "
							+ "SET  ADCORREO = '" + dato.getAdCorreo() + "', ADAREA = '" + dato.getAdCorreo() + "'"
							+ "WHERE USUARIO_RUNUSUARIO = " + dato.getUsuarioRunUsuario() +""  ;
 
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
		 
			stm.executeUpdate(consultaSql);
			actualizar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpIAdministrativo, "
					+ "metodo actualizar");
			
			e.printStackTrace();
		}
		
		return actualizar; 
		
	}

}
