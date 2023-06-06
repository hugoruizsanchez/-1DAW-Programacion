package cositas;

import java.util.*;


public class Principal {

	public static void main(String[] args) {
		
		// CREACIÓN DEL OBJETO HASHMAP
		
		HashMap <String, Coche> miGaraje = new HashMap<String, Coche>();

		// -> Primer elemento: clave (identificador) del objeto (String).
		// -> Segundo elemento: objeto asociado (Coche).
		
		// CREACIÓN DE VALORES PARA EL OBJETO COCHE
		
		Coche c1 = new Coche ("CAD-911", "FORD FIESTA", "Rojo", 2020);
		Coche c2 = new Coche ("MAD-881", "BLISTA COMPACT", "Amarillo", 2012);
		Coche c3 = new Coche ("JER-662", "ROSENDO HIPPIE", "Gris", 2003);
		Coche c4 = new Coche ("MAL-221", "MAZDA LOREAN", "Verde", 3050);
		Coche c5 = new Coche ("JAE-232", "BMW JEMPLAR", "Azul", 1989);
		Coche c6 = new Coche ("COR-811", "AUDI RENOMBRE", "Amarillo", 2000);
		Coche c7 = new Coche ("SEV-551", "FOROFO FIESTA", "Verde", 2008);
		
		// ASIGNACIÓN DE VALORES 
		
		miGaraje.put(c1.getMatricula(), c1);
		miGaraje.put(c2.getMatricula(), c2);
		miGaraje.put(c3.getMatricula(), c3);
		miGaraje.put(c4.getMatricula(), c4);
		miGaraje.put(c5.getMatricula(), c5);
		miGaraje.put(c6.getMatricula(), c6);
		miGaraje.put(c7.getMatricula(), c7);
		
			
	listaGaraje (miGaraje);
	
	listaMatriculas (miGaraje);
	
	listaModelo (miGaraje);
		
	}
	
	/**
	 * Con el método listaGaraje se proyectan en pantalla todos los elementos del GARAJE. 
	 * Para lo cual, el método captura el HashMap con su clave y elemento. 
	 *  
	 * @param garaje
	 */
	
	/*
	 * RECUERDO: CÓMO SE COMPONE UN BUCLE FOR EACH:
	 int[] numeros = {1, 2, 3, 4, 5};

	// bucle for-each
	for (int numero : numeros) {
    System.out.println(numero);
	}

	// bucle for simple
	for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
	}
	 */
	
	
	public static void listaGaraje(HashMap<String, Coche> garaje) {
		
		// Map.Entry es una interfaz en Java que representa un solo registro en el HashMap (Map)
		// garaje.entrySet captura la colección entera, que debe introducirse en el bucle for each
		// La clave es un elemento diferenciador, por lo que tiene que identificarse en entry.getKey
		// El resto de atributos del coche, se capturan con entry.getValue
		
		for (Map.Entry<String, Coche> entry : garaje.entrySet()) { 
	        
	    	String clave = entry.getKey();
	        Coche coche = entry.getValue();
	        System.out.println("Matrícula: " + clave);
	        System.out.println("Modelo: " + coche.getModelo());
	        System.out.println("Color: " + coche.getColor());
	        System.out.println("Año: " + coche.getYear());
	        System.out.println("-----------------------");
	        
	    }
	    
	}
	
	public static void listaMatriculas (HashMap<String, Coche> garaje) {
		
		for (Map.Entry<String, Coche> entry : garaje.entrySet()) {
			
			System.out.println (entry.getKey());
			System.out.println ("------");
			
		}
		
	}
	
	public static void listaModelo (HashMap<String, Coche> garaje) {
		
		for (Map.Entry<String, Coche> entry : garaje.entrySet()) {
			
			Coche coche = entry.getValue();
			System.out.println (coche.getModelo());
			System.out.println ("------");
			
		}
		
	}
	
	
    /*

"public static void listaGaraje(HashMap<String, Coche> garaje) {"

Esta es la declaración del método listaGaraje. Toma como parámetro un objeto HashMap que asigna una String (en este caso, la matrícula del coche) a un objeto Coche.


"for (Map.Entry<String, Coche> entry : garaje.entrySet()) {"

Este es un bucle for-each que itera a través de todos los elementos de la colección HashMap garaje. Para cada elemento, se obtiene la clave (la matrícula del coche) y el valor (el objeto Coche) usando el método entrySet() del objeto garaje.


String matricula = entry.getKey();
Coche coche = entry.getValue();

Aquí se extraen la clave y el valor de la iteración actual y se almacenan en las variables matricula y coche, respectivamente. getKey() devuelve la clave y getValue() devuelve el valor.

System.out.println("Matrícula: " + matricula);
System.out.println("Modelo: " + coche.getModelo());
System.out.println("Color: " + coche.getColor());
System.out.println("Año: " + coche.getAnio());
System.out.println("-----------------------");

Estas líneas muestran la información del coche en la consola. System.out.println() es una función que imprime una cadena de texto en la consola, y se utiliza aquí para imprimir la matrícula, modelo, color y año del coche, separados por líneas. Los métodos getModelo(), getColor() y getAnio() son métodos de acceso en el objeto Coche que devuelven la información de modelo, color y año, respectivamente.

Espero que esto te ayude a entender cómo funciona el método listaGaraje y qué hace cada línea de código. Si tienes alguna otra pregunta, no dudes en preguntar.
     */


}



