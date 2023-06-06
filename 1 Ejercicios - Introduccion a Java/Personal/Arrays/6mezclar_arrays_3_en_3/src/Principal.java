import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int [] numeros1 = new int [12];
		int [] numeros2 = new int [12];
		int [] mezcla = new int [24];
		Scanner entrada = new Scanner (System.in);
		/*Leer todos los datos correspondientes a dos tablas de 12 números, y juntarlos de 3 en tres en una tabla conjunta
		 * numeros1 = 1, 2, 3 , 4 . 5 . 6 . 7 , 8 , 9, 1, 2 , 3 
		 * numeros2= = 11, 12, 13 , 14 , 15, 16, 17, 18, 19, 20 , 21 , 22
		 * mezcla= 1,2 ,3 , 11, 12, 13, 4, 5 6, 14, 15, 16, 7, 8, 9, 17, 18, 19, 1 ,2 ,3, 20, 21, 22
		 */

		System.out.println ("Introduzca la secuencia de 12 números para 'numeros1': ");
		
		for (int iterador =0; iterador<numeros1.length; iterador++) {	 // Solicitar datos al usuario
			System.out.print ((iterador+1)+". ");
			numeros1 [iterador] = entrada.nextInt();
		}
		
System.out.println ("Introduzca la secuencia de 12 números para 'numeros2': ");
		
		for (int iterador =0; iterador<numeros2.length; iterador++) {	  // Solicitar datos al usuario
			System.out.print ((iterador+1)+". ");
			numeros2 [iterador] = entrada.nextInt();
		}
		
		int iterador1=0, iterador2=0; 
		
		while (iterador1<12) { // Cuando iterador 1 sea menor que 12... 
			
			for (int iterador3=0; iterador3<3; iterador3++) { // Bucle de tres ciclos
				
				mezcla [iterador2] = numeros1 [iterador1+iterador3]; // mezcla [0] = numeros1 [0+0] ----> mezcla [1] = numeros1 [0+1] ..... numeros1 [0+2] | mezcla [7] = numeros [3+0] ... [3+2]
                iterador2++;	// Para calibrar la posición del array mezcla. 
				
			}
			
		for (int iterador3=0; iterador3<3; iterador3++) {
				
				mezcla [iterador2] = numeros2 [iterador1+iterador3];
                iterador2++;	
				
			}
		
		iterador1 = iterador1+3; // Cuando el bucle while está a punto de dar una vuelta, suma 3 al iterador, dando a entender a los bucles for que ya hay 3 numeros escritos
			
		}
	
		
		for (int iterador =0 ; iterador<mezcla.length; iterador++) {
			
			System.out.println ((iterador+1)+". "+mezcla[iterador]);
		}
		
		
		
	}

}
