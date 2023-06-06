package paquete1;

public class Clase1 {

	public int atributo1;  
	
	// Al estar en el modo por defecto (int atributo1), nuestro atributo puede ser modificado libremente desde cualquier clase del paquete.
	// Sin embargo, fuera del paquete (por ejemplo, en el paquete2) este NO puede ser modificado, a menos que...
	// (public int atributo1)
	// El temido modificador (private int atribute1) impide la alteración de los atributos en todas las partes que no sean la Clase1
	
}
