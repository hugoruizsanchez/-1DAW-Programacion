package Sobrecarga;

public class Persona {
	

	// ATRIBUTOS
	
	String nombre;
	int edad; 
	String dni;
	
	
	// MÉTODOS
	 
	// Para diferenciar un constructor de otro basta con especificar un número distinto de parámetros. 
	
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	
    public Persona(String dni) {           
		
		this.dni = dni;
		
	}
    
    public void correr () {
    	
    	System.out.print("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maratón.");
    	
    }
    
   public void correr (int _km, int _edad, String _nombre) {
    	
    	System.out.print("Soy "+_nombre+" tengo "+_edad+" años y soy el ganador de la carrera, pues he recorrido "+_km +"km.");
    	
    }
		

}

