package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import conexion.Conexion;
import interfaces.IConsultas;
import modelo.Capacitacion;

public class ImpICapacitacion implements IConsultas<Capacitacion> {

	@Override
	public List<Capacitacion> listado() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
 
		String consultaSql = "Select * From CAPACITACION";
		
		List<Capacitacion> listado = new ArrayList<Capacitacion>();

		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(consultaSql); //la tabla de oracle
			  
			System.out.println("rs: " + rs.toString());

			while (rs.next()) { // mientras tenga algo , sigue
				Capacitacion capacitacion = new Capacitacion();

				capacitacion.setIdCapacitacion(rs.getInt("IDCAPACITACION"));
				capacitacion.setCapFecha(rs.getString("CAPFECHA"));
				capacitacion.setCapHora(rs.getString("CAPHORA"));
				capacitacion.setCapLugar(rs.getString("CAPLUGAR"));
				capacitacion.setCapDuracion(rs.getInt("CAPDURACION"));
				capacitacion.setClienteRutCliente(rs.getInt("CLIENTE_RUTCLIENTE"));

				listado.add(capacitacion);

			}

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: "
					+ "Clase ImpICapacitacion, "
					+ "metodo listado");
			
			e.printStackTrace();
		}

		return listado;

	}

	@Override
	public boolean registrar (Capacitacion dato) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String consultaSql = "INSERT INTO CAPACITACION (CAPFECHA, CAPHORA, CAPLUGAR, CAPDURACION, CLIENTE_RUTCLIENTE) VALUES ('"
				+ dato.getCapFecha() + "', '" + dato.getCapHora() + "', '" + dato.getCapLugar() + "', '"
				+ dato.getCapDuracion() + "', '" + dato.getClienteRutCliente() + "')";

		try {

			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			
			registrar = true;
			stm.close();
			con.close();
			 

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpICapacitacion, "
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
 
		String consultaSql = "DELETE FROM CAPACITACION WHERE USUARIO_RUNUSUARIO = "+ dato+ " " ;
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeUpdate(consultaSql);
			eliminar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			
			System.out.println("Error: "
					+ "Clase ImpICapacitacion, "
					+ "metodo eliminar");
			
			e.printStackTrace();
		}
 
		return eliminar ; 
 
	}

	@Override
	public boolean actualizar(Capacitacion dato) {
		// TODO Auto-generated method stub
		return true;
	}

}
