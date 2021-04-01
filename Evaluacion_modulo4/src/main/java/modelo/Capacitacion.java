package modelo;


public class Capacitacion {
	
	//Atributos
	private Integer idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private Integer clienteRutCliente;

	//Constructores
	public Capacitacion() {     
		
	}

	public Capacitacion(Integer idCapacitacion, String capFecha, String capHora, String capLugar, Integer capDuracion,
			Integer clienteRutCliente) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.capFecha = capFecha;
		this.capHora = capHora;
		this.capLugar = capLugar;
		this.capDuracion = capDuracion;
		this.clienteRutCliente = clienteRutCliente;
	}

	// Métodos accesores
	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public String getCapFecha() {
		return capFecha;
	}

	public String getCapHora() {
		return capHora;
	}

	public String getCapLugar() {
		return capLugar;
	}

	public Integer getCapDuracion() {
		return capDuracion;
	}

	public Integer getClienteRutCliente() {
		return clienteRutCliente;
	}
	
	//Métodos mutadores
	
	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public void setCapFecha(String capFecha) {
		this.capFecha = capFecha;
	}

	public void setCapHora(String capHora) {
		this.capHora = capHora;
	}

	public void setCapLugar(String capLugar) {
		this.capLugar = capLugar;
	}

	public void setCapDuracion(Integer capDuracion) {
		this.capDuracion = capDuracion;
	}

	public void setClienteRutCliente(Integer clienteRutCliente) {
		this.clienteRutCliente = clienteRutCliente;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", capFecha=" + capFecha + ", capHora=" + capHora
				+ ", capLugar=" + capLugar + ", capDuracion=" + capDuracion + ", clienteRutCliente=" + clienteRutCliente
				+ "]";
	}

	//Metodos adicionales
	public String mostrarDetalle(){	
		return "La capacitación será en " + capLugar + " a las " + capHora + " del día " + capFecha + ", y durará " + capDuracion + " minutos";
	}

}
