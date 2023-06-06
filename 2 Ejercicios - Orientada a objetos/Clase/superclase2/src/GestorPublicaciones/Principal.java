package GestorPublicaciones;

public class Principal {

	public static void main(String[] args) {

		
		Libro l1 = new Libro ();
	
	l1.setNombreAutor("Frederick Forsyth");
	l1.setTitulo("El manifiesto negro");
	l1.setEditorial("Círculo de lectores");
	l1.setTipoPortada("Duro");
	l1.setNumeroDePaginas(15);

	// De entre las funciones que facilita la herencia, el EXTEND permite heredar los
	// atributos de PUBLICACION para LIBRO; aunque los atributos de libro no especifiquen
	// el "NumeroDePaginas", es un atributo heredado de PUBLICACION

	System.out.println ("NombreAutor: "+l1.getNombreAutor());
	System.out.println ("Título: "+l1.getTitulo());
	System.out.println ("Editorial: "+l1.getEditorial());
	System.out.println ("TipoPortada: "+l1.getTipoPortada());
	System.out.println ("Páginas: "+l1.getNumeroDePaginas());
	
	
	
	
	}

}
