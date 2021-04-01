package controlador;

import java.io.IOException;

 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ingreso
 */
@WebServlet("/FormLogin")
public class FormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
			
		if( usuario.equals("admin") & clave.equals("1234") ) { 

			HttpSession misesion=request.getSession();
			misesion.setAttribute("sesionUsuario", "admin");
			misesion.setAttribute("sesionClave", "1234");
			
			request.getRequestDispatcher("Contacto").forward(request, response) ;
		 
		}else {
			
			request.getRequestDispatcher("Login").forward(request, response) ;
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
