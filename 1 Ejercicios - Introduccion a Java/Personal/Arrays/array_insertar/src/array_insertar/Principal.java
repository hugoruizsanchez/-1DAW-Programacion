package array_insertar;

import java.util.Scanner;

public class Principal {
	
		 public static void main (String [] args) {

	Scanner entrada = new Scanner (System.in);
	int tabla [] = new int [10];
	int numero;
	int posicion;
	
	for (int i=0; i<8; i++) {
		
		System.out.print(i+". "); tabla [i] = entrada.nextInt();
		
	}
			 
	System.out.print ("\nIntroduzca un número: "); 
	
	numero = entrada.nextInt();
	
	System.out.print ("\nIntroduzca una posición: "); 
			 
	posicion = entrada.nextInt();
	
for (int i=7; i>=posicion; i--) {
	
	tabla [i+1] = tabla [i]; 
	
}

tabla [posicion] = numero;

for (int i=0; i<9; i++) {
	System.out.print (tabla[i]+"-");
}
}

}