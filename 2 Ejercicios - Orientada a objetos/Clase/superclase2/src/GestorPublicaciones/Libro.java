package GestorPublicaciones;

class Libro extends Publicacion {
	
	
//  ATRIBUTOS
	 
	public String TipoPortada; 
	public String ISBN; 
	public String NombreAutor; 
	public String Editorial;
	
//	MÉTODO CONSTRUCTOR 
	
	public Libro (String TipoPortada, String ISBN, String NombreAutor, String Editorial) {
	super ();
	this.TipoPortada = TipoPortada; 
	this.ISBN = ISBN;
	this.NombreAutor = NombreAutor;
	this.Editorial = Editorial;
	}
	
//	MÉTODOS: GET Y SET 


	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getTipoPortada() {
		return TipoPortada;
	}

	public void setTipoPortada(String tipoPortada) {
		TipoPortada = tipoPortada;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNombreAutor() {
		return NombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		NombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	

	
	

}
