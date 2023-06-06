package ejercicio20_buscadores;

import java.util.Scanner;

public class busqueda_secuencial {

	public static void main(String[] args) {
		
		// La búsqueda consiste en la comprobación de si un elemento está indexado dentro de un array. La búsqueda secuencial es sencilla
		
		
		Scanner entrada = new Scanner (System.in);
		int array [] = {7,1,2,4,5,3,6};
		int dato = entrada.nextInt();
		boolean estado = false;
		int i=0; 
		
		while (i<array.length && estado==false) {
			
			if (array [i]== dato) {
				
				estado=true;
				System.out.print("El dato introducido se encuentra indexado en el array.");
				
			} else {
			
			i++;
			}
			
			
		}

		if (estado==false) {
			System.out.print("El dato introducido NO se encuentra indexado en el array.");
		}
		
		
		
	}

}
