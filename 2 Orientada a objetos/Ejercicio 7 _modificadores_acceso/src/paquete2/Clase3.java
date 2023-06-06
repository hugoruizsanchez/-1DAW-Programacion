package paquete2;


import paquete1.Clase1; // Esto, para importar las clases de otros paquetes.


public class Clase3 {
	
	public static void main(String [] args) {
		
		Clase1 objeto1 = new Clase1 ();
		
		objeto1.atributo1 = 15; // Podemos crear dos objetos con el mismo nombre porque siempre estarán separados, debido a que es un main distinto.
		// Si no podemos acceder a los datos, es porque POR DEFECTO el atributo no está asignado en public. 
		
	}
}
