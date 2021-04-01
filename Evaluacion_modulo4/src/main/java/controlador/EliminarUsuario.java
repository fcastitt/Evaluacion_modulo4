package controlador;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.ImpIAdministrativo;
import implementacion.ImpICliente;
import implementacion.ImpIProfesional;
import implementacion.ImpIUsuario;
import interfaces.IConsultas;
 
/**
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer rutUsuario =  Integer.parseInt( request.getParameter("RutUsuario")) ;
		
		HttpSession sesion=request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");
		
		
		if(sesionUsuario== null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);	
		}else {
 
				IConsultas<?> implementacion1 = new ImpICliente();
				boolean mostrarEliminar1 = implementacion1.eliminar(rutUsuario);
				
				IConsultas<?> implementacion2 = new ImpIProfesional();
				boolean mostrarEliminar2 = implementacion2.eliminar(rutUsuario);
				
				IConsultas<?> implementacion3 = new ImpIAdministrativo();
				boolean mostrarEliminar3 = implementacion3.eliminar(rutUsuario);
				
				IConsultas<?> implementacion = new ImpIUsuario();
				boolean mostrarEliminar = implementacion.eliminar(rutUsuario);
 
				
				request.setAttribute("mostrarEliminarUsuarioEnJsp", mostrarEliminar );
				request.setAttribute("mostrarEliminarUsuario1EnJsp", mostrarEliminar1 );
				request.setAttribute("mostrarEliminarUsuario2EnJsp", mostrarEliminar2 );
				request.setAttribute("mostrarEliminarUsuario3EnJsp", mostrarEliminar3 );
  
				 
				request.getRequestDispatcher("vistaEliminarUsuario.jsp").forward(request, response);
		  
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
