
public class Producto {

//	ATRIBUTOS
	
	private String nombre; 
	private int cantidad; 
	
//	CONSTRUCTOR
	
	public Producto (String nombre, int cantidad) {
		
		this.nombre = nombre; 
		this.cantidad = cantidad;
		
	}
	
//	MÉTODOS
	
	public String toString () {
		
		return "Nombre: "+nombre+" Cantidad: "+cantidad; 
		
	}

	
//	MÉTODOS GET Y SET
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
