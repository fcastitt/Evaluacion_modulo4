package modelo;

//Clase hija de Usuario
public class Cliente  extends Usuario {
	
	//Atributos
	private Integer rutCliente;
	private String cliTelefono;
	private String cliAfp;
	private Integer cliSistemasalud;
	private String cliDireccion;
	private String cliComuna;
	private Integer cliEdad;
	private Integer usuarioRunUsuario;
 
	//Constructores
	public Cliente() {

	}
	
	public Cliente(Integer runUsuario, String usNombre, String usApellido, String usNacimiento, Integer rutCliente,
			String cliTelefono, String cliAfp, Integer cliSistemasalud, String cliDireccion, String cliComuna,
			Integer cliEdad, Integer usuarioRunUsuario) {
		super(runUsuario, usNombre, usApellido, usNacimiento);
		this.rutCliente = rutCliente;
		this.cliTelefono = cliTelefono;
		this.cliAfp = cliAfp;
		this.cliSistemasalud = cliSistemasalud;
		this.cliDireccion = cliDireccion;
		this.cliComuna = cliComuna;
		this.cliEdad = cliEdad;
		this.usuarioRunUsuario = usuarioRunUsuario;
	}

	// Métodos accesores
	public Integer getRutCliente() {
		return rutCliente;
	}

	public String getCliTelefono() {
		return cliTelefono;
	}

	public String getCliAfp() {
		return cliAfp;
	}

	public Integer getCliSistemasalud() {
		return cliSistemasalud;
	}

	public String getCliDireccion() {
		return cliDireccion;
	}

	public String getCliComuna() {
		return cliComuna;
	}

	public Integer getCliEdad() {
		return cliEdad;
	}

	public Integer getUsuarioRunUsuario() {
		return usuarioRunUsuario;
	}

	//Métodos mutadores
	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setCliTelefono(String cliTelefono) {
		this.cliTelefono = cliTelefono;
	}

	public void setCliAfp(String cliAfp) {
		this.cliAfp = cliAfp;
	}

	public void setCliSistemasalud(Integer cliSistemasalud) {
		this.cliSistemasalud = cliSistemasalud;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

	public void setCliComuna(String cliComuna) {
		this.cliComuna = cliComuna;
	}

	public void setCliEdad(Integer cliEdad) {
		this.cliEdad = cliEdad;
	}

	public void setUsuarioRunUsuario(Integer usuarioRunUsuario) {
		this.usuarioRunUsuario = usuarioRunUsuario;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Cliente [rutCliente=" + rutCliente + ", cliTelefono=" + cliTelefono + ", cliAfp=" + cliAfp
				+ ", cliSistemasalud=" + cliSistemasalud + ", cliDireccion=" + cliDireccion + ", cliComuna=" + cliComuna
				+ ", cliEdad=" + cliEdad + ", usuarioRunUsuario=" + usuarioRunUsuario + "]";
	}

}
