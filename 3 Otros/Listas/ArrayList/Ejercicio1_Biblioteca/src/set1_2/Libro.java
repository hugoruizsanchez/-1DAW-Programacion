package set1_2;


public class Libro extends Publicacion {
	
	// DESCRIPCIÓN DE LA CLASE 
		
		/*
		 * SUBCLASE DE -> PUBLICACION
		 */
		
//		ATRIBUTOS
		
		public String tipoPortada; 
		public String isbn; 
		public String nombreAutor; 
		public String editorial;
			
//		MÉTODO CONSTRUCTOR
		
		public Libro (int numeroDePaginas, float precio, String tipoPortada, String isbn, String nombreAutor, String editorial) {
			
			super (numeroDePaginas, precio);
			
			this.tipoPortada = tipoPortada; 
			this.isbn = isbn; 
			this.nombreAutor = nombreAutor; 
			this.editorial = editorial; 

		}
		
//		MÉTODOS: GET Y SET.
		
		public String getTipoPortada() {
			return tipoPortada;
		}


		public void setTipoPortada(String tipoPortada) {
			this.tipoPortada = tipoPortada;
		}


		public String getIsbn() {
			return isbn;
		}


		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}


		public String getNombreAutor() {
			return nombreAutor;
		}


		public void setNombreAutor(String nombreAutor) {
			this.nombreAutor = nombreAutor;
		}


		public String getEditorial() {
			return editorial;
		}


		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}
		
}

		