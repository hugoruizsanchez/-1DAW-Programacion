package set1;
import java.util.*;

public class Ejercicio2 {
	
	/*
	 * Ejercicio 2. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
personas. Se pedirá la altura de personas hasta que se introduzca un 0, y se almacenarán en un
arrayList las alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima así
como cuántas personas miden por encima y por debajo de la media.
	 */
	
	
	public static void main(String[] args) {
		
		// PRESENTACIÓN DEL PROGRAMA 
		
		System.out.println ("REGISTRO DE ALTURAS\n");
		
		// DECLARACIÓN DE OBJETOS 
		
		Scanner entrada = new Scanner (System.in);
		claseArrayList configuradorA = new claseArrayList ();
		
		// CREACIÓN DE VARIABLES

		ArrayList<Integer> listaAlturas = new ArrayList<Integer>();
		
		int altura =1; 
		int contador =0;
		
		// ASIGNACIÓN DE LAS ALTURAS POR LA ENTRADA DEL TECLADO
		
		while (altura != 0) {
			
			System.out.print ("("+contador+"). "+"Introduzca altura: ");
			altura = entrada.nextInt();
			
			if (altura != 0) {
				listaAlturas.add(altura);
			}
			
			contador++;
			
		}
		
		System.out.println ("\nFin del bucle\n\nResultados:");
		
		// MUESTREO DE DATOS ALMACENADOS
		
		for (int i=0; i<listaAlturas.size(); i++) {
			System.out.println ("Persona "+i+": "+listaAlturas.get(i));
		}
		
		
		// SABER MINIMO: 
		
		System.out.println ("\nEl número más pequeño de la lista es: "+configuradorA.minimoArrayListInt(listaAlturas));
		
		// SABER MÁXIMO:
		
		System.out.println ("\nEl número más grande de la lista es: "+configuradorA.maximoArrayListInt(listaAlturas));
		
		// SABER LA MEDIA: 
		
		System.out.println ("\nLa media de la lista es: "+configuradorA.mediaArrayListInt(listaAlturas));
		
		// DATOS SUPERIORES A LA MEDIA:
		
		System.out.println ("\nLos datos superiores a la media son:");
		
		for (int i=0; i<listaAlturas.size(); i++) {
			
			if (listaAlturas.get(i)>configuradorA.mediaArrayListInt(listaAlturas)) {			
				System.out.println ("Persona "+i+": "+listaAlturas.get(i));		
			}
			
		}
		
		System.out.println ("\nLos datos inferiores a la media son:");
		
		for (int i=0; i<listaAlturas.size(); i++) {
			
			if (listaAlturas.get(i)<configuradorA.mediaArrayListInt(listaAlturas)) {			
				System.out.println ("Persona "+i+": "+listaAlturas.get(i));		
			}
			
		}
		
		
		
		
		
	}
}
