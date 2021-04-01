package modelo;


//Clase hija de Usuario
public class Administrativo extends Usuario{
	
	private Integer usuarioRunUsuario ; 
	private String adCorreo ;
	private String adArea ;
 
	//Constructores
	public Administrativo() {

	}

	public Administrativo(Integer runUsuario, String usNombre, String usApellido, String usNacimiento,
			Integer usuario_runusuario, String adcorreo, String adarea) {
		super(runUsuario, usNombre, usApellido, usNacimiento);
		this.usuarioRunUsuario = usuario_runusuario;
		this.adCorreo = adcorreo;
		this.adArea = adarea;
	}

	//Métodos accesores
	public Integer getUsuarioRunUsuario() {
		return usuarioRunUsuario;
	}

	public String getAdCorreo() {
		return adCorreo;
	}

	public String getAdArea() {
		return adArea;
	}

	//Métodos mutadores
	public void setUsuarioRunUsuario(Integer usuarioRunUsuario) {
		this.usuarioRunUsuario = usuarioRunUsuario;
	}

	public void setAdCorreo(String adCorreo) {
		this.adCorreo = adCorreo;
	}

	public void setAdArea(String adArea) {
		this.adArea = adArea;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Administrativo [usuarioRunUsuario=" + usuarioRunUsuario + ", adCorreo=" + adCorreo + ", adArea="
				+ adArea + "]";
	}
 
}
