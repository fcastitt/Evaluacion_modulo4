package modelo;

import java.time.LocalDate;

//Clase padre
public class Usuario{
	
	//Atributos
	private Integer runUsuario;
	private String usNombre;
	private String usApellido;
	private String usNacimiento;
	
	//Constructores 
	public Usuario() {
		super();
	}

	public Usuario(Integer runUsuario, String usNombre, String usApellido, String usNacimiento) {
		super();
		this.runUsuario = runUsuario;
		this.usNombre = usNombre;
		this.usApellido = usApellido;
		this.usNacimiento = usNacimiento;
	}

	//Métodos accesores
	public Integer getRunUsuario() {
		return runUsuario;
	}

	public String getUsNombre() {
		return usNombre;
	}

	public String getUsApellido() {
		return usApellido;
	}

	public String getUsNacimiento() {
		return usNacimiento;
	}
	
	//Métodos mutadores
	public void setRunUsuario(Integer runUsuario) {
		this.runUsuario = runUsuario;
	}

	public void setUsNombre(String usNombre) {
		this.usNombre = usNombre;
	}

	public void setUsApellido(String usApellido) {
		this.usApellido = usApellido;
	}

	public void setUsNacimiento(String usNacimiento) {
		this.usNacimiento = usNacimiento;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Usuario [runUsuario=" + runUsuario + ", usNombre=" + usNombre + ", usApellido=" + usApellido
				+ ", usNacimiento=" + usNacimiento + "]";
	}

	//Metodos Adicionales
	public String mostrarEdad() {
		LocalDate anyoActual = LocalDate.now(); // Entrega la fecha actual

		Integer anyo = Integer.parseInt(usNacimiento.substring(usNacimiento.length() - 4));
		Integer edad = anyoActual.getYear() - anyo;
		return "El usuario tiene " + edad + " años";
	}
 
}
