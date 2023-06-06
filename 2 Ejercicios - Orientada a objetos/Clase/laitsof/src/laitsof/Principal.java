package laitsof;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		
		/*
		Tablero t1 = new Tablero (9);
		t1.iniciarNivel();
		
		boolean bandera = false;
		
		while (bandera == false) {
			t1.mostrarTablero();
			t1.modificarCasilla();
		}
		*/
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("------------------------------");
		System.out.println ("LIGHTS OUT");
		System.out.println ("-> El frenético videojuego de encender luces ¡por fin en la consola de comandos!");
		System.out.println ("------------------------------");
		System.out.print("Introduzca las dimensiones del tablero: "); 
			
		Tablero t1 = new Tablero (entrada.nextInt());
		
		int eleccion = 1;
		
		while (eleccion != 0) {
			
			eleccion = t1.mostrarAjustes();
			
			switch (eleccion) {
			case 0: 
				System.out.println ();
				System.out.println ("Final del programa.");
				System.exit(0);
			break;
			case 1: 
				System.out.println ();
				System.out.print ("Introduzca el grado de dificultad: "); t1.setDificultad(entrada.nextInt());;
			break;
			case 2: 
				
				t1.iniciarNivel();
				
				boolean comprobar = false;
				boolean comprobar2 = false;
				
				while (comprobar == false | comprobar2 == false) {
					
					comprobar =t1.comprobador();
					t1.mostrarTablero();
					comprobar2 = t1.modificarCasilla();
					
				}
				
			break;
			
			default: System.out.println ("Valor fuera  de rango. Vuelva a intentarlo.");
			
			}
			
		}
		
	}
	
}
			
			
			
	
		
		
		
		
		
		
		

		


