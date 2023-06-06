import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* OBJETIVO DEL EJERCICIO: con dos arrays de números, alternarlos en un array "mezcla"
		 *  EJEMPLO
		 * numeros1 = 2 , 4 , 6 , 8 , 9 , 10 , 12 , 14, 16, 18
		 * numeros2 = 1, 3 , 5 , 9 , 11, 13 , 15 , 18, 20, 22
		 * mezcla = 2 , 1 , 4, 3 , 6, 5, 8, 9 , 11, 13........
		 */
		
		// Definimos las variables requeridas para la ejecución del programa:
		
		Scanner entrada = new Scanner (System.in);
		int [] numeros1 = new int [10];
		int [] numeros2 = new int [10]; 
		int [] mezcla = new int [20]; 
		
		
		// Nombre del programa. 
		
		System.out.println ("Array 'numeros1' y 'numeros2' que se intercalan en el array 'mezcla'. \n\n")
		
		
		// Petición de valores para el array "numeros1" utilizando un bucle for : 
	
		System.out.println("Introduzca la secuencia de 10 números para 'numeros1':"); // Solicitamos al usuario el número.
		
		for (int iterador = 0; iterador<10; iterador++) { // Se inicia un bucle que abarcará 10 ciclos, los que componen el array.
			
			System.out.print((iterador+1)+". ");  // Aderezo para acompañar la introducción.
			
			numeros1 [iterador] = entrada.nextInt(); // Se apela al scanner. 
			
		}
		
		// Petición de valores para el array "numeros2" utilizando un bucle for : 
		
		System.out.println("Introduzca la secuencia de 10 números para 'numeros2':");  // Solicitamos al usuario el número.
		
		for (int iterador = 0; iterador<10; iterador++) { // Se inicia un bucle que abarcará 10 ciclos, los que componen el array.
			
			System.out.print((iterador+1)+". "); // Aderezo para acompañar la introducción.
			
			numeros2 [iterador] = entrada.nextInt();  // Se apela al scanner. 
			
		}
		
		int iterador2=0; // Empezamos la variable entera "iterador2" que se servirá para ajustar la posición del array "mezcla". 
		for (int iterador1 = 0; iterador1<10; iterador1++) { // La variable iterador1 servirá para ajustar la posición de los arrays "numeros1" y "numeros2". 

			mezcla [iterador2] = numeros1 [iterador1]; // El iterador2, que empieza en 0, asigna la posición "mezcla [0]" a "numeros1 [0]" ( por los iteradores)
			iterador2++; // Entonces, el iterador2 suma 1 (iterador2 = iterador2+ 1)
			mezcla [iterador2] = numeros2 [iterador1]; // El iterador2, que es 1, asigna la posición "mezcla [1]" a "numeros2 [0]
            iterador2++; // El iterado2 suma 1, y el proceso se repite rellenando todo. 
            
		}
		System.out.println ("Los arrays 'numeros1' y 'numeros2' mezclados intercalándose resultarían así: ");	
		
		for (int iterador = 0; iterador<20; iterador++) {
	
System.out.println ((iterador+1)+". "+mezcla [iterador]);
 
		}
		

		
	}

}
