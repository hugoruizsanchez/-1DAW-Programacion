import java.util.Scanner;

/*
Confecciona una función que solicite ancho y alto de un rectángulo y lo dibuje en pantalla.
El ancho se cuenta como el número de espacios entre lados verticales + 2. Se le debe añadir los
delimitadores del rectángulo. Siempre ancho > 0 y < 77
El alto se cuenta como las líneas útiles entre lados horizontales. Alto >=0 y <=2	
 */
public class EJ232 {

	public static void main(String[] args) {
		rectangulo (2,5); // Esta es la función resultante. 
		
		
	}

	public static void rectangulo (int alto, int ancho) {
		
		// COMPROBACIÓN DE ALTO Y ANCHO EN LOS PARÁMETROS CORRECTOS   - ancho entre 0 y 77   - alto entre 0 y 22
		
		
		
		if (alto>=0 && alto<=22) { 
		
			if (ancho>0 && ancho<77) {
				
				ancho = ancho+2; // Esto ajustará el ancho de los asteriscos al ancho que suponen los caracteres en pantalla.  Así, si el ancho es 7, cabrán 7 caracteres.
				
				// IMPRESIÓN DEL ANCHO 1 
				
				for (int i=0; i<ancho; i++) {
					
					System.out.print("*"); // Se imprime la primera línea de ancho, compuesta por n asteriscos.
				}
			
				// IMPRESIÓN DEL ALTO 1
				
				for (int i=0; i<alto; i++) { // Se repite tantas líneas como tenga el alto. 
					System.out.println (); // En la siguiente línea. 
					
					System.out.print("*"); // Imprimimos *
					
					for (int j=0; j<ancho-2; j++) {
						System.out.print("‎ ");     // Y repetimos el espacio cuantas veces dure el ancho-2, para ajustarlo
					}
					
					System.out.print("*"); // Y al finalizar el for, se escribe un asterisco.
					
				}
				
				// IMPRESIÓN DEL ANCHO 2
				
				if (alto ==0) { // Si el alto es 0, entonces no será necesario introducir una línea final. 
					
				} else {
				
				System.out.println (); // Una vez acabado el alto, espaciamos una línea y escribimos nuevamente el ancho para terminar la tabla. 
				
		        for (int i=0; i<ancho; i++) {
					
					System.out.print("*");
				}
				
				}
				
			}
			else {
				System.out.println("ERROR: El ancho no se encuentra dentro de los parámetros correctos. (ancho entre 0 y 77) ");
			}
		
		} 
		else {
			System.out.println ("ERROR: El alto no se encuentra dentro de los parámetros correctos. (alto entre 0 y 22) ");
			
		}
		
		
		
		
		
		
		

		
	}// Rectangulo
	
	
}
