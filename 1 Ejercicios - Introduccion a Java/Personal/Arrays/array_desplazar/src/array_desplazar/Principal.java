package array_desplazar;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int [] tabla = new int [11];
		int ultimo;
		System.out.println ("Proceso de asignación de valores, introduzca los valores correspondientes:");
		
		// ASIGNACIÓN DE VALORES. 
		
		for (int i=0; i<10; i++) {
			System.out.print("Posicion "+i+": ");
			tabla [i] = entrada.nextInt();
			
			
		}
		
		ultimo = tabla [9];
		
		
		// REASIGNACIÓN DE VALORES. 
		

		for (int i=8; i>=0; i--) {
		
			tabla [i+1] = tabla [i];
			
		
			
		}
		
		
	// COMPROBACIÓN DE VALORES ASIGNADOS. 
		tabla [0] =ultimo;
		
		System.out.println ("Los valores reasignados son  los siguientes:");
		
		for (int i=0; i<10; i++) {
			System.out.println ("Posicion "+i+": "+ tabla[i]);
		
		}
		

		
	}

}
