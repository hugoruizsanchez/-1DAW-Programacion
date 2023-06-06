package Constructores;

public class Persona {

	// ATRIBUTOS
	
	String nombre; 
	int edad; 
	
	// MÉTODOS
	
	// CONSTRUCTORES
	
	
	// Esto es el método constructor, que sirve para "montar", "construir" los datos antes de que vayan a ser creados y  corresponderlos a los atributos:
	
	public Persona (String nombre, int edad) { // Los constructores deben tener el mismo nombre que la clase. 	 // La clase Persona debe estar caracterizada por tener un nombre y una edad, lo cual se parametriza.
		
		this.nombre = nombre; // La compiladora de java se CONFUNDE cuando igualas dos valores aparentemente iguales, para lo cual debemos
		this.edad = edad; // indicarle "this." al principio de la primera variable, para resolucionar este conflicto. Eso, o cambiar el nombre de las variables en el metodo-
		
		// En conclusión, diferenciamos LOS ATRIBUTOS de los PARÁMETROS. this. -> para los atributos. 

	}
	
	public void mostrarDatos () {
		
		System.out.println ("El nombre es "+nombre);
		System.out.println ("La edad es "+edad);
		
	}
	
	
	
	
	
}
