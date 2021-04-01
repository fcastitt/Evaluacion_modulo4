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
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;

/**
 * Servlet implementation class FromActualizarUsuario
 */
@WebServlet("/FromActualizarUsuario")
public class FromActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FromActualizarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Generar o validar sesion
		HttpSession sesion = request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");

		if (sesionUsuario == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {

			Integer runusuario = Integer.parseInt(request.getParameter("runusuario"));
			String usnombre = request.getParameter("usnombre");
			String usapellido = request.getParameter("usapellido");
			String usnacimiento = request.getParameter("usnacimiento");
			Integer perfil = Integer.parseInt(request.getParameter("perfil"));

			// Crear nuevo usuario
			Usuario crearUsuario = new Usuario(runusuario, usnombre, usapellido, usnacimiento);

			// Implementar usuario para una actualizacion
			IConsultas<Usuario> implementacion = new ImpIUsuario();
			boolean mostrar = implementacion.actualizar(crearUsuario);

			request.setAttribute("mostrarActualizarUsuario", mostrar);

			if (perfil == 1) {

				Integer rutcliente = Integer.parseInt(request.getParameter("rutcliente"));
				String clitelefono = request.getParameter("clitelefono");
				String cliafp = request.getParameter("cliafp");
				Integer clisistemasalud = Integer.parseInt(request.getParameter("clisistemasalud"));
				String clidireccion = request.getParameter("clidireccion");
				String clicomuna = request.getParameter("clicomuna");
				Integer cliedad = Integer.parseInt(request.getParameter("cliedad"));

				Cliente crearCliente = new Cliente(runusuario, usnombre, usapellido, usnacimiento, rutcliente,
						clitelefono, cliafp, clisistemasalud, clidireccion, clicomuna, cliedad, runusuario);

				IConsultas<Cliente> implementacion1 = new ImpICliente();
				boolean mostrarCliente = implementacion1.actualizar(crearCliente);

				request.setAttribute("mostrarActualizarCliente", mostrarCliente);
				request.setAttribute("mostrarActualizarProfesional", false);
				request.setAttribute("mostrarActualizarAdministrativo", false);

			} else if (perfil == 2) {

				String protelefono = request.getParameter("protelefono");
				String protitulo = request.getParameter("protitulo");
				String proproyecto = request.getParameter("proproyecto");

				Profesional crearProfesional = new Profesional(runusuario, usnombre, usapellido, usnacimiento,
						runusuario, protelefono, protitulo, proproyecto);

				IConsultas<Profesional> implementacion2 = new ImpIProfesional();
				boolean mostrarProfesional = implementacion2.actualizar(crearProfesional);

				request.setAttribute("mostrarActualizarCliente", false);
				request.setAttribute("mostrarActualizarProfesional", mostrarProfesional);
				request.setAttribute("mostrarActualizarAdministrativo", false);

			} else if (perfil == 3) {

				String adcorreo = request.getParameter("adcorreo");
				String adarea = request.getParameter("adarea");

				Administrativo crearAdministrativo = new Administrativo(runusuario, usnombre, usapellido, usnacimiento,
						runusuario, adcorreo, adarea);

				IConsultas<Administrativo> implementacion3 = new ImpIAdministrativo();
				boolean mostrarAdministrativo = implementacion3.actualizar(crearAdministrativo);

				request.setAttribute("mostrarActualizarCliente", false);
				request.setAttribute("mostrarActualizarProfesional", false);
				request.setAttribute("mostrarActualizarAdministrativo", mostrarAdministrativo);

			}

			request.getRequestDispatcher("vistaActualizarUsuario.jsp").forward(request, response);
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
