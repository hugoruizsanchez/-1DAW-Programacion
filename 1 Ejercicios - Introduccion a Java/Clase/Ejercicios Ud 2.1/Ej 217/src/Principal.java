import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// DEFINICIÓN DE LAS VARIABLES A UTILIZAR:
		
		int aleatorio;
	    Random rd = new Random();
	    aleatorio = rd.nextInt(100)+1; // Paquete importado para generar enteros aleatorios, similar al Scanner. 
		int adivinacion; 
		Scanner entrada = new Scanner (System.in);
		boolean adivinado = false;
		// INTRODUCCIÓN AL PROGRAMA E INSTRUCCIONES DE USO: 
	System.out.println ("| Adivina el número ||\\n\\nVideojuego en el que la máquina propone al usuario un número que puede adivinar, "
			+ "indicándole en cada ronda si este es mayor o menor.\n\nInstrucciones de uso: utilice el teclado para escribir el número e"
			+ "introduzca '999' si quiere abandonar el programa; escriba únicamente números.");
	   // CUERPO DEL PROGRAMA
	
System.out.println ("Trampa " +aleatorio);

while (adivinado==false) {

	adivinacion = entrada.nextInt();
	
	if (adivinacion<aleatorio) {
		
		System.out.println ("El número que tienes que adivinar es MAYOR");
//		adivinacion = entrada.nextInt();
	}
	else {
		
		if (adivinacion>aleatorio) {
			
			System.out.println ("El número que tienes que adivinar es MENOR");
	//		adivinacion = entrada.nextInt();
		}
		else {
			adivinado= true;
			System.out.println ("¡Efectivamente! El número que tenías que adivinar era el "+aleatorio);
		}
		
	}
}


	
		

	}

}
