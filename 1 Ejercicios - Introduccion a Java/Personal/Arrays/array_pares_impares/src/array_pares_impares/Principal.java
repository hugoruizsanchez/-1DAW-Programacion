package array_pares_impares;

import java.util.Scanner;

public class Principal {
	 public static void main (String [] args) {
		 
		 // SCANNER
		 
		 Scanner entrada = new Scanner (System.in);
		 
		 
		 // INICIALIZACIÓN DE LAS VARIABLES
		 
		 int array [] = new int [10];
		 int array_resultante [] = new int [10];
		 
		 // LECTURA DEL ARRAY PRINCIPAL
		 
		 for (int i=0; i<10; i++) {
			 
			  System.out.print((i+1)+". "); array [i] = entrada.nextInt();
			 
		 }
		 
		 // ANÁLISIS y CLASIFICACIÓN DEL ARRAY
		 
		 int j=0;
		 
		 for (int i=0; i<10; i++) {
			 
			 if (array [i]%2==0) {
				 
		       array_resultante [j] = array [i];
		       j++;
			}
		    }
		 
		 for (int i=0; i<10; i++) {
			 
			 if (array[i]%2!=0) {
			
				 array_resultante [j] = array [i];
				 j++;
				 
			 }
			 
		 }
		 
		 
		 
		 // PRUEBA 
		 
		 System.out.println ("ARRAY RESULTANTE");
		 for (int i=0; i<10; i++) {
			 
			  System.out.print(array_resultante[i]+";");
			 
		 }
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	   } 

   }
