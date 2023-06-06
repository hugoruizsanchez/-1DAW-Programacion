import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		
		System.out.println ("Comparador de entero y múltiplo.  ");  // Título de la herrramienta: nos dirá si determinado número es múltiplo de otro. 
		Scanner entrada = new Scanner (System.in); // Definimos el scanner como entrada. 
		int entero; 
		int multiplo; // las dos variables que utilizará la herramienta
		System.out.println ("Introduce un número entero: "); 
	
	entero = entrada.nextInt();
	
	System.out.println ("Introduce el múltiplo por el que lo quieres comparar: "); 

multiplo = entrada.nextInt(); // Las dos variables se registran en el scanner y son introducidas por el usuario
	
	
	if (entero%multiplo ==0) { // Si el resto de una división entre 10 es cero, es porque se trata de un múltiplo. 

		System.out.println ("Se trata de un número que es múltiplo de " +multiplo+"."); 	
		
	}
	else { 
		
		System.out.println ("Se trata de un número que no es múltiplo de "+multiplo+"."); 	
	}

		
	
	}

}
