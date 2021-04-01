package controlador;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarCapacitaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");

		if (sesionUsuario == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {

			// Clase_7_Grupal 6 - punto 6

			IConsultas<Capacitacion> implementacion = new ImpICapacitacion();

			List<Capacitacion> listaDeCapacitaciones = implementacion.listado();

			request.setAttribute("listaDeCapacitacionesJsp", listaDeCapacitaciones);
			// Fin
			request.getRequestDispatcher("listarCapacitaciones.jsp").forward(request, response);

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
