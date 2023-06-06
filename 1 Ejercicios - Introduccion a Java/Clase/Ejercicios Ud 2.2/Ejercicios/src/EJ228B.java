import java.util.Scanner;

public class EJ228B {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Introduzca un número decimal: "); 
		
		int decimal1 = entrada.nextInt(); // Pedimos introducir al usuario un número decimal.
		int binario1 [] = new int [40]; // El binario puede tener una amplitud de hasta 40 datos.
		
		int iterador1 =0; // Iterador. 
		
		while (decimal1>0) { // Mientras el decimal no sea 0... 
	        
			binario1[iterador1++] = decimal1%2; // Binario [0] = resto del decimal. Los restos van acumulándose, constituyendo así el binario. 
			decimal1 = decimal1/2; // decimal se divide entre dos, se retorna el while. Así se va sucediendo. 
			
		}
		
		for (int i = iterador1-1; 	i>=0; i--) {
			
				System.out.print (binario1 [i]); // Finalmente, se proyecta el resultado en pantalla. 
				
		}
		
			

	}

}
