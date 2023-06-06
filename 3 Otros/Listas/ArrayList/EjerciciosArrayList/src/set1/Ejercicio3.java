package set1;

import java.util.*;

public class Ejercicio3 {
	
	/*
	 * Ejercicio 3. Crea un programa que cree un arrayList de enteros y luego muestre el siguiente menú
con distintas opciones:
a) Mostrar valores. ( inicialmente no tendrá ningún valor)
b) Introducir valor al final.
c) Introducir valor en una posición.
d) Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V, y luego
escribirá V en el arrayList .La opción ‘c’ pedirá un valor V y una posición P, luego escribirá V en la
posición P del arrayList. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘d’
que terminará el programa
	 */

	
	public static void main(String[] args) {

		// CREACIÓN DE OBJETOS Y VARIABLES
		
		claseArrayList configuradorA = new claseArrayList ();
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros = configuradorA.generaArrayListInt(0, 100, 15);
		Scanner entrada = new Scanner (System.in);
		
	String [] seleccion = {
			 "Mostrar valores", 
			 "Introducir valor al final",
			 "Introducir valor en una posición",
			 }; 
	
	Menu m1 = new Menu (seleccion, "Modificador de ArrayList");
	
	int eleccion = 1;
	
	while (eleccion !=0) {
		System.out.println ();
		m1.mostrarMenu();
		eleccion = m1.eligeOpcion();	
		switch (eleccion) {
		
		case 1: System.out.println ("Elección -> "+seleccion [0]);
		
		for (int i=0; i<listaEnteros.size(); i++) {
			System.out.println ("Dato número "+i+": "+listaEnteros.get(i));
		}
		
		break; 
		case 2: System.out.println ("Elección -> "+seleccion [1]);
		System.out.print("Introduzca valor:");
		listaEnteros.add(entrada.nextInt());
				
		break; 
		case 3: System.out.println ("Elección -> "+seleccion [2]);
		int valor =0; 
		int indice =-1;
		System.out.print ("Introduzca valor:");
		valor = entrada.nextInt();
		
		while (indice<0 | indice>listaEnteros.size() ) {
			System.out.print("Introduzca un índice dentro de rango: ");
			indice = entrada.nextInt();
			
		}
		
		listaEnteros.add(indice, valor);
		
		
		}
		
	}
		
	
	}

}
