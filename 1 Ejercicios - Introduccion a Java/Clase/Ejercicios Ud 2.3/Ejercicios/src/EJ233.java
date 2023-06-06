import java.util.Scanner;

public class EJ233 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		Scanner entrada2 = new Scanner (System.in);
		String nombreDeVentana; 
		int alto;
		int ancho;
		// * El número de líneas útiles es la altura. 
		// INTRODUCCIÓN DEL PROGRAMA: PETICIÓN DE LAS VARIABLES.
		
		System.out.print ("| Creador de ventanas de texto|\nSeleccione el número de líneas útiles, que debe estar entre 1 y 23: ");

		alto = entrada.nextInt (); 
		
		System.out.print("Introduzca el nombre de la ventana: ");
	
		nombreDeVentana = entrada2.nextLine(); // Debemos guardar el nombre en un nuevo scanner, para garantizar que se guarden todos los valores. 
		
		// IMPRESIÓN DE LA VENTANA CON TEXTO.
		
		// > ANCHO 
		
		ancho = (nombreDeVentana.length())+4;
		
		for (int i=0; i<ancho; i++) {
			System.out.print("*");
		}
		
		// > TEXTO 
		
		System.out.println ();
		
		System.out.print("* "+nombreDeVentana+" *");
		
		// > ANCHO
				
System.out.println ();

		for (int i=0; i<ancho; i++) {
			System.out.print("*");
		}
	    // IMPRESIÓN DE LAS LÍNEAS UTILES O ALTO
			
		// > ALTO
		
			for (int i=0; i<alto; i++) { // Se repite tantas líneas como tenga el alto. 
				System.out.println (); // En la siguiente línea. 
				
				System.out.print("*"); // Imprimimos *
				
				for (int j=0; j<ancho-2; j++) {
					System.out.print("‎ ");     // Y repetimos el espacio cuantas veces dure el ancho-2, para ajustarlo
				}
				
				System.out.print("*"); // Y al finalizar el for, se escribe un asterisco.
		}
			
		// > ANCHO FINAL 
			
			System.out.println ();
			
					for (int i=0; i<ancho; i++) {
						System.out.print("*");
					}
	}

}
