package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.ImpICapacitacion;
import interfaces.IConsultas;
import modelo.Capacitacion;

/**
 * Servlet implementation class FormCrearCapacitacion
 */
@WebServlet("/FormCrearCapacitacion")
public class FormCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormCrearCapacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Clase_7_Grupal_6 punto 7
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		Integer duracion = Integer.parseInt(request.getParameter("duracion"));
		Integer rutCliente = Integer.parseInt(request.getParameter("rutCliente"));

		Capacitacion crearCapacitacion = new Capacitacion(null, fecha, hora, lugar, duracion, rutCliente);

		IConsultas<Capacitacion> implementacion = new ImpICapacitacion(); 
		 
		boolean mostrar = implementacion.registrar(crearCapacitacion);

		request.setAttribute("mostrarRegistrarCapacitacion", mostrar);

		HttpSession sesion = request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");

		if (sesionUsuario == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {

			request.getRequestDispatcher("vistaCrearCapacitacion.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
