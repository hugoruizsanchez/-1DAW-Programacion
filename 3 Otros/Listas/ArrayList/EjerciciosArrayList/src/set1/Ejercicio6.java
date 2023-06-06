package set1;

import java.util.*;

public class Ejercicio6 {
	
	/*
	 * Ejercicio 7. Crea un programa que pida al usuario 10 cadenas de texto e introduzca las 5 primeros
en un arrayList y los 5 últimos en otro arrayList. Por último, comparará ambos arrayList y le dirá al
usuario si son iguales o no
	 */
	
	public static void main(String[] args) {
		
		// CREACIÓN DE OBJETOS 
		
		ArrayList<String> listaTexto1 = new ArrayList<String>();
		ArrayList<String> listaTexto2 = new ArrayList<String>();
		Scanner entrada = new Scanner (System.in);
		
		// PETICIÓN 
		
		String texto =""; 
		int contador =0;
		
		// ASIGNACIÓN DE LOS DATOS POR LA ENTRADA DEL TECLADO
		
		listaTexto1.ensureCapacity(5);
		listaTexto2.ensureCapacity(5);

		for (int i =0; i<5; i++) {
			System.out.print(i+") Introduzca texto para ArrayList 1: ");
			listaTexto1.add(entrada.next());
		}
		
		for (int i =0; i<5; i++) {
			System.out.print(i+") Introduzca texto para ArrayList 2: ");
			listaTexto2.add(entrada.next());
		}
		
		// COMPARACIÓN DE VALORES
		
	 if (listaTexto2.equals(listaTexto1)==false) {
		 
		 System.out.println ("Ambas cadenas NO son iguales.");
		 
	 }
	 else {
		 
		 System.out.println ("Ambas cadenas SÍ son iguales.");
		 
	 }
		
		
		
	}

}
