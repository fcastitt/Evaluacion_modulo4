package modelo;

public class ContactoClase {
	
	private String nombre  ;
	private String mail ;
	private String telefono ;
	private String mensaje ;
	private String genero ;
	
 
	public ContactoClase(String nombre, String mail, String telefono, String mensaje, String genero) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.telefono = telefono;
		this.mensaje = mensaje;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getGenero() {
		return genero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	} 
	
 
	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", mail=" + mail + ", telefono=" + telefono + ", mensaje=" + mensaje
				+ ", genero=" + genero + "]";
	}

	//Metodo
	
	public void MostrarEnConsola(ContactoClase dato) {
		
		System.out.println(dato.getNombre());
		System.out.println(dato.getMail());
		System.out.println(dato.getTelefono());
		System.out.println(dato.getMensaje());
		System.out.println(dato.getGenero());	
		
	}
 

}
