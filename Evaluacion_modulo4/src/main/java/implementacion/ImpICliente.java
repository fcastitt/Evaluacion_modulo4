package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
import conexion.Conexion;
import interfaces.IConsultas;
import modelo.Cliente;

public class ImpICliente implements IConsultas<Cliente> {

	@Override
	public List<Cliente> listado() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
 
		String consultaSql = "select * from USUARIO , CLIENTE where usuario.runusuario = cliente.usuario_runusuario";

		List<Cliente> listado = new ArrayList<Cliente>();
		
		try {
			
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(consultaSql); //la tabla de oracle
			  
			System.out.println("rs: " + rs.toString());

			while (rs.next()) { // mientras tenga algo , sigue
				Cliente cliente = new Cliente();
				
				cliente.setRunUsuario(rs.getInt("RUNUSUARIO"));
				cliente.setUsNombre(rs.getString("USNOMBRE"));
				cliente.setUsApellido(rs.getString("USAPELLIDO"));
				cliente.setUsNacimiento(rs.getString("USNACIMIENTO"));

				cliente.setRutCliente(rs.getInt("RUTCLIENTE"));
				cliente.setCliTelefono(rs.getString("CLITELEFONO"));
				cliente.setCliAfp(rs.getString("CLIAFP"));
				cliente.setCliSistemasalud(rs.getInt("CLISISTEMASALUD"));
				cliente.setCliDireccion(rs.getString("CLIDIRECCION"));
				cliente.setCliComuna(rs.getString("CLICOMUNA"));
				cliente.setCliEdad(rs.getInt("CLIEDAD"));
				cliente.setUsuarioRunUsuario(rs.getInt("USUARIO_RUNUSUARIO"));

				listado.add(cliente);

			}

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpICliente, "
					+ "metodo listado");
			
			e.printStackTrace();
		}

		return listado;
	}

	@Override
	public boolean registrar (Cliente dato) {

		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String consultaSql = "INSERT INTO CLIENTE (RUTCLIENTE, CLITELEFONO, CLIAFP, CLISISTEMASALUD, CLIDIRECCION, CLICOMUNA, CLIEDAD, USUARIO_RUNUSUARIO) VALUES ('"
				+ dato.getRutCliente() + "', '" + dato.getCliTelefono() + "', '" + dato.getCliAfp() + "', '"
				+ dato.getCliSistemasalud() + "', '" + dato.getCliDireccion() + "', '" + dato.getCliComuna()
				+ "', '" + dato.getCliEdad() + "', '" + dato.getUsuarioRunUsuario() + "')";

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			
			registrar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpICliente, "
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
		 
		String consultaSql1 = "DELETE FROM CLIENTE WHERE USUARIO_RUNUSUARIO = "+ dato+ " " ;
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
					+ "metodo eliminar");
			
			e.printStackTrace();
		}
 
		return eliminar ; 
	}
	
	@Override
	public boolean actualizar(Cliente dato) {
		
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;

		String consultaSql = "UPDATE CLIENTE "
							+ "SET CLITELEFONO = '" + dato.getCliTelefono() + "', CLIAFP = '" + dato.getCliAfp() + "', "
							+ "CLIDIRECCION = '" + dato.getCliDireccion() + "', CLICOMUNA = '" + dato.getCliComuna() + "', CLIEDAD = '" + dato.getCliEdad() + "' " 
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
					+ "Clase ImpICliente, "
					+ "metodo actualizar");
			
			e.printStackTrace();
		}
		
		return actualizar; 
		
	}

}
