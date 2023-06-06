

	/*
		 Digito de control en DNI: El algoritmo de cálculo del dígito de control es el siguiente:Se divide el
número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante
la siguiente tabla:
RESTO 0 1 2 3 4 5 6 7 8 9 10 11
LETRA T R W A G M Y F P D X B
RESTO 12 13 14 15 16 17 18 19 20 21 22
LETRA N J Z S Q V H L C K E
Por ejemplo, si el número del DNI es 12345678, dividido entre 23 da de resto 14, luego la letra
sería la Z: 12345678Z.
		 */

import java.util.Scanner;

public class EJ225A {

	public static void main(String[] args) {

	
		
		
		char [] caracter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'E', 'D', 'X', 'D', 'N' , 'J', 'Z', 'S' , 'U', 'V', 'H', 'L', 'C', 'K', 'E'}; 
		int DNI_length;
		int DNI; 
		int resto; 
		Scanner entrada = new Scanner (System.in);
		
	System.out.print("| -> Introduzca su número de DNI: "); DNI = entrada.nextInt();
	
	int DNI_lenght = String.valueOf(DNI).length();
	
	if (DNI_lenght != 8) {
		System.out.println ("\nEl número introducido no corresponde al formato de un DNI. ");
	}
	else {
		
	resto = DNI%23; 
	
	System.out.println ("\nEl DNI con el dígito de control es: "+DNI+caracter[resto]);
		
		
	}
		

	}

}
