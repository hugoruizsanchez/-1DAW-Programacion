package adivinar_ascendente_descendente;
import java.util.Scanner; 

public class ejercicio6corregido {
	
	
 public static void main (String [] args) {

		
	Scanner entrada = new Scanner (System.in); 
	int [] arreglo = new int [10];
	boolean creciente = false;
	boolean decreciente = false; 
	
	// PEDIR AL USUARIO EL ARREGLO. 
	
	for (int i=0; i<10; i++) {
		
		System.out.print (i+". ");
		
		arreglo [i] = entrada.nextInt ();
	
	}
	
	// ANÁLISIS. 
	
	for (int i=0; i<9; i++) { // Para no evaluar más posiciones de las necesarias, porque con el [i+1] eventualmente llegará al 10 solo. 
		
		if (arreglo [i] < arreglo [i+1] ) { // Si la posición "0" es menor que la posición "1", entonces es creciente. 
			
			creciente = true;
			
		}
		
		if (arreglo [i] > arreglo [i+1])  { // Si la posición "0" es mayor que la posición "1", entonces es decreciente.
		
		   decreciente = true; 
		
	    }
		
	}
	
	// CONCLUSIÓN
	
	
	if (creciente == true& decreciente == false) { // Si solo se detecta un orden creciente, el arreglo será creciente.
		
		System.out.println ("El arreglo está ordenado de forma creciente. ");
		
		
	}
	
	else if (creciente == false& decreciente == true) {
		
		System.out.println ("El arreglo está ordenado de forma decreciente. "); // Si solo se detecta un orden decreciente, el arreglo será decreciente. 
		
		
	}
	
	
	else if (creciente == true & decreciente == true) { // Si se detectan ambos órdenes, es porque está subiendo y bajando, lo que significa que está desordenado. 
		
		System.out.println ("El arreglo está desordenado. ");
		
		
	}
	
	
	else if (creciente == false & decreciente == false) { // Si no se detecta ninguno de los dos, es porque todos los elementos son iguales. 
		
		System.out.println ("Todos los elementos del arreglo son iguales.");
		
		
	}
	

}

}


