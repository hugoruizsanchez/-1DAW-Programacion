package GestorPublicaciones;

//  SUBCLASE -> PUBLICACION


class Periodico extends Publicacion {
	
	
//	ATRIBUTOS 
	
	private String Nombre; 
	private String Fecha;
	
	
//	MÉTODO CONSTRUCTOR 
	
	public Periodico () {
		super (Fecha, Fecha, Fecha, Fecha, Fecha, numeroDePaginas, numeroDePaginas);
		
		// HEREDA los atributos de PUBLICACION
	}

	
//	MÉTODOS: GET Y SET
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getFecha() {
		return Fecha;
	}


	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
	
	
 
	

	


}
