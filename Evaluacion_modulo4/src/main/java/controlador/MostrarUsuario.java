package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.ImpIAdministrativo;
import implementacion.ImpICliente;
import implementacion.ImpIProfesional;
import interfaces.IConsultas;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;

/**
 * Servlet implementation class MostrarAdministrativo
 */
@WebServlet("/MostrarUsuario")
public class MostrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MostrarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer perfil = 0;

		Integer rutUsuario = Integer.parseInt(request.getParameter("RutUsuario"));

		HttpSession sesion = request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");

		if (sesionUsuario == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {

			Cliente cliente = new Cliente();
			Profesional profesional = new Profesional();
			Administrativo administrativo = new Administrativo();

			IConsultas<Cliente> implementacion1 = new ImpICliente();

			List<Cliente> mostrarCliente = implementacion1.listado();

			for (Cliente dato1 : mostrarCliente) {

				if (dato1.getRunUsuario().equals(rutUsuario)) {

					cliente.setRunUsuario(dato1.getRunUsuario());
					cliente.setUsNombre(dato1.getUsNombre());
					cliente.setUsApellido(dato1.getUsApellido());
					cliente.setUsNacimiento(dato1.getUsNacimiento());

					cliente.setRutCliente(dato1.getRutCliente());
					cliente.setCliTelefono(dato1.getCliTelefono());
					cliente.setCliAfp(dato1.getCliAfp());
					cliente.setCliSistemasalud(dato1.getCliSistemasalud());
					cliente.setCliDireccion(dato1.getCliDireccion());
					cliente.setCliComuna(dato1.getCliComuna());
					cliente.setCliEdad(dato1.getCliEdad());
					cliente.setUsuarioRunUsuario(dato1.getUsuarioRunUsuario());

					perfil = 1;

				}

			}

			if (perfil == 0) {

				ImpIProfesional implementacion2 = new ImpIProfesional();

				List<Profesional> mostrarProfesional = implementacion2.listado();

				for (Profesional dato : mostrarProfesional) {

					if (dato.getRunUsuario().equals(rutUsuario)) {

						profesional.setRunUsuario(dato.getRunUsuario());
						profesional.setUsNombre(dato.getUsNombre());
						profesional.setUsApellido(dato.getUsApellido());
						profesional.setUsNacimiento(dato.getUsNacimiento());

						profesional.setUsuarioRunUsuario(dato.getUsuarioRunUsuario());
						profesional.setProTelefono(dato.getProTelefono());
						profesional.setProTitulo(dato.getProTitulo());
						profesional.setProProyecto(dato.getProProyecto());

						perfil = 2;
						break;

					}

				}

				if (perfil == 0) {

					ImpIAdministrativo implementacion3 = new ImpIAdministrativo();

					List<Administrativo> mostrarAdministrativo = implementacion3.listado();

					for (Administrativo dato3 : mostrarAdministrativo) {

						if (dato3.getRunUsuario().equals(rutUsuario)) {

							administrativo.setRunUsuario(dato3.getRunUsuario());
							administrativo.setUsNombre(dato3.getUsNombre());
							administrativo.setUsApellido(dato3.getUsApellido());
							administrativo.setUsNacimiento(dato3.getUsNacimiento());

							administrativo.setUsuarioRunUsuario(dato3.getUsuarioRunUsuario());
							administrativo.setAdCorreo(dato3.getAdCorreo());
							administrativo.setAdArea(dato3.getAdArea());

							perfil = 3;

						}

					}

				}

			} // Fin if

			request.setAttribute("mostrarClienteJsp", cliente);

			request.setAttribute("mostrarProfesionalJsp", profesional);

			request.setAttribute("mostrarAdministrativoJsp", administrativo);

			request.setAttribute("mostrarPerfil", perfil);

			// se deben mandar los tres o se cae el sistema

			// Fin
			request.getRequestDispatcher("editarUsuario.jsp").forward(request, response);

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
