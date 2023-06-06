/*
		  Triángulo rectángulo.
Confecciona un programa que dibuje la siguiente figura en pantalla, de la forma más compacta
posible. Se pedirá el ancho de la base antes de pintar la figura. Controlar que la anchura de la base
sea mayor o igual que 3 y menor que 50.
*
**
***
...
************* <- Longitud de la base
*/

import java.util.Scanner;

public class EJ230 {

	public static void main(String[] args) {

		
		 
	Scanner entrada = new Scanner (System.in);
	
	int anchobase;
	int linea;	
	int contador=1;
	System.out.print ("| Creador de triángulos rectángulos |\nSeleccione el ancho de su triángulo, que debe estar entre 3 y 50: ");
		
	anchobase = entrada.nextInt();
	
	if (anchobase > 50 || anchobase < 3) {
		
		System.out.println ("Has introducido un ancho improcedente: debe estar entre 3 y 10. Reinicia el programa para continuar.");
		
	} else {
		
		for (int i=0; i<anchobase; i++) { // Este for repetirá cuantas veces tenga el ancho. 
			
			linea = anchobase-(anchobase-contador);  // Se precisa el ancho de cada línea según esta expresión. 
			
			for (int j =0; j<linea; j++) {
				System.out.print("*"); // El bucle repetirá los asteriscos horizontalmente, cuantas veces se indique.
		
			}
			System.out.println ();
			
		contador++;
		} // For
	}
	
	

	}

}
