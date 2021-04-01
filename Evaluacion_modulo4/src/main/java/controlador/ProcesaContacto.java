package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.ContactoClase;

/**
 * Servlet implementation class ProcesaContacto
 */
@WebServlet("/ProcesaContacto")
public class ProcesaContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesaContacto() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		String sesionUsuario = (String) sesion.getAttribute("sesionUsuario");

		if (sesionUsuario == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
				 
			String nombre = request.getParameter("nombre");
			String mail = request.getParameter("mail");
			String telefono = request.getParameter("telefono");
			String mensaje = request.getParameter("mensaje");
			String genero =  request.getParameter("genero");
			
			ContactoClase contacto = new ContactoClase(nombre, mail, telefono, mensaje, genero);
			
			contacto.MostrarEnConsola(contacto);
			 	 
		}
		
		request.getRequestDispatcher("contacto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
