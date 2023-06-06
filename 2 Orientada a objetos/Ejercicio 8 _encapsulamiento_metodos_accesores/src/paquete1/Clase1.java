package paquete1;

public class Clase1 {

	// ATRIBUTOS
	
private int edad; // Si declaramos pública la edad, nos exponemos a que un tercero modifique información. Por eso, debemos declararla PRIVADA.
private String nombre; 


// Entonces, para modificar esta clase, es necesario utilizar los denominados "MÉTODOS ACCESORES" o "SETTERS y GETTERS" D: 

/*

Cada atributo tiene dos partes: 

-> el dato que guarda, p.ej edad = 15 
-> el muestreo de los datos p.ej "La edad es de 15 años" 

 */

  // MÉTODOS

// (Set -> ESTABLECER) 
   
public void setEdad (int edad) {
	
	this.edad = edad;  // Esto permitirá la modificación de un atributo private, sin que pueda ser corrompido directamente
	
}

public int getEdad () {
	
	return edad; 
	
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
} 


}
