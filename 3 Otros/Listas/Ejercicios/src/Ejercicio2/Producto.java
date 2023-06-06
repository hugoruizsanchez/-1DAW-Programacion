package Ejercicio2;

public class Producto {
	
	// ATRIBUTOS
	
	protected String nombre; 
	protected double precio;
	protected int cantidad = 0;
	
	// CONSTRUCTOR 
	
	public Producto (String nombre, double precio) {
		this.nombre = nombre; 
		this.precio = precio;
	}
	
	// GET Y SET 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	
	
	

}
