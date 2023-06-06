/*
 * En la mesa del juego de la Ruleta, nos encontramos con una ruleta con 37 casillas
numeradas del 0 al 36 y el tapete (mesa) para realizar apuesta. 

Se trata de modelar el juego diseñando un conjunto de clases java y realizar un programa
que implemente una serie de funciones.

Cada casilla en la que puede caer la bola tendrá pues una serie de características:
- Será Cero
- Será roja o negra ->  NÚMEROS ROJOS ASIGNADOS EN "rojos" -> clase tablero. 
- Será par o impar
- Será falta (casilla del 1 al 18) o pasa (casilla del 19 al 36)
 *
 */

package laruleta;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// CREACIÓN DE OBJETOS
		
		Scanner entrada = new Scanner (System.in);
		Random a1 = new Random();
		
		Tablero t1 = new Tablero ();
		
		
		String [] seleccion = {
				 "Comprobar valor", 
				 "Comprobar todos los valores",
				 "Generar 10 apuestas"
				
				 };
		
		Menu m1 = new Menu (seleccion); m1.setTitulo("CASINO VIRTUAL - LA RULETA");
		
		m1.mostrarMenu();
		
		int eleccion = 1;
		 
		while (eleccion !=0) {
			
		eleccion =	m1.eligeOpcion() ;
		
		switch (eleccion) {
		
		case 1: System.out.println ("Elección -> "+seleccion [0]);
		
		System.out.print ("Introduzca casilla: "); 
		
		System.out.println (t1.casillaValor(entrada.nextInt())) ;
		
		break;
		
		case 2: System.out.println ("Elección -> "+seleccion [1]);
		
		for (int i=1; i<37; i++) {
			
		System.out.println (t1.casillaValor(i));
			
		}
		
		break;
		
		case 3: System.out.println ("Elección -> "+seleccion [2]);
	
		int [] apuestas = {a1.nextInt(36) + 1 ,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1,a1.nextInt(36) + 1};
		
		System.out.println ("En base a las apuestas: ");
		
		for (int i=0; i<apuestas.length; i++) {
			
			System.out.print (apuestas [i]+", ");
			
		}
		
		System.out.println ();
		
		t1.comprobacion(apuestas);
		
		}
			
			
		}
		

		
		

	}

}
