package paquete1;

public class Persona {

	// ATRIBUTOS
	
	private final String nombre; // Arrojará un error hasta que el constructor no se agregue. 
	// > El "final" no permitirá que se modifique la variable en ningún momento. 
	private int edad;
	
	// CONSTRUCTOR
		
	public Persona (String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad; 
		
	}
	

	
	// MÉTODOS
	
	//metodo para mostrardatos. 
	
	public void mostrarDatos () {
		
		System.out.println ("El nombre es "+nombre+".");
		System.out.println ("La edad es "+edad+".");
		
	}
	
	// set y get
	
	public void setEdad (int edad) {
		
		this.edad = edad;
		
	}
	
	public int getEdad () {
		
		return edad;
		
	}
	

	
}
