package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * Ejercicio 5. Crea un programa que pida al usuario valores hasta que se introduzca -1 y los guarde
en un arrayList. Luego muestra el arrayList por pantalla.
	 */
	
	public static void main(String[] args) {
		
		// CREACION DE OBJETOS
		
		Scanner entrada = new Scanner (System.in);
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		// CREACIÓN DE VARIABLES
		
		int entero =0; 
		int contador =0;
		
		// ASIGNACIÓN DE LAS enteroS POR LA ENTRADA DEL TECLADO
		
		while (entero != -1) {
			
			System.out.print ("("+contador+"). "+"Introduzca entero: ");
			entero = entrada.nextInt();
			
			if (entero != -1) {
				listaEnteros.add(entero);
			}
			
			contador++;
			
		}
		
		// MOSTRAR ARRAY
		
		for (int i=0; i<listaEnteros.size(); i++) {
			System.out.println (+i+") "+listaEnteros.get(i));
		}
		
	}
	

}
