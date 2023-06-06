package GestorPublicaciones;


// SUPERCLASE -> LIBRO, PERIÓDICO. 

public class Publicacion {
	
//	ATRIBUTOS
	
	public int numeroDePaginas;
	public float precio; 

//	MÉTODO CONSTRUCTOR. 
	
	public Publicacion (String titulo, String tipoPortada, String iSBN, String nombreAutor, String Editorial, int numeroDePaginas, int precio) {
		this.numeroDePaginas = numeroDePaginas; 
		this.precio = precio;
		
	}

//	MÉTODOS: GET Y SET

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
