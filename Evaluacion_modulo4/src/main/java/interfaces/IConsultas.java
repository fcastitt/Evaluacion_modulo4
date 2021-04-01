package interfaces;

import java.util.List;

public interface IConsultas<T> {
	
	public List<T> listado();

	public boolean registrar (T dato);
	
	public boolean eliminar (Integer dato);
	
	public boolean actualizar (T dato);

}
