package modelo;

//Clase hija de Usuario
public class Profesional extends Usuario {
	
	private Integer usuarioRunUsuario;
	private String proTelefono;
	private String proTitulo;
	private String proProyecto;
 
	//Constructores
	public Profesional() {
	
	}
	
	public Profesional(Integer runUsuario, String usNombre, String usApellido, String usNacimiento,
			Integer usuarioRunUsuario, String proTelefono, String proTitulo, String proProyecto) {
		super(runUsuario, usNombre, usApellido, usNacimiento);
		this.usuarioRunUsuario = usuarioRunUsuario;
		this.proTelefono = proTelefono;
		this.proTitulo = proTitulo;
		this.proProyecto = proProyecto;
	}

	// Métodos accesores
	public Integer getUsuarioRunUsuario() {
		return usuarioRunUsuario;
	}

	public String getProTelefono() {
		return proTelefono;
	}

	public String getProTitulo() {
		return proTitulo;
	}

	public String getProProyecto() {
		return proProyecto;
	}

	//Métodos mutadores
	public void setUsuarioRunUsuario(Integer usuarioRunUsuario) {
		this.usuarioRunUsuario = usuarioRunUsuario;
	}

	public void setProTelefono(String proTelefono) {
		this.proTelefono = proTelefono;
	}

	public void setProTitulo(String proTitulo) {
		this.proTitulo = proTitulo;
	}

	public void setProProyecto(String proProyecto) {
		this.proProyecto = proProyecto;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Profesional [usuarioRunUsuario=" + usuarioRunUsuario + ", proTelefono=" + proTelefono + ", proTitulo="
				+ proTitulo + ", proProyecto=" + proProyecto + "]";
	}
 	 
}
