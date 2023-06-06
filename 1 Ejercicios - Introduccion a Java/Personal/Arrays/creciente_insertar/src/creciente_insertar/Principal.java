package creciente_insertar;

import java.util.Scanner;

public class Principal {
	 public static void main (String [] args) {
		 
		 
		 
		 // Variables
		 
		 int array [] = new int [10];
		 Scanner entrada = new Scanner (System.in);
		 boolean creciente = false;
		 boolean decreciente = false;
		 boolean ordenado =false;
		 int numero, sitio_num=0, j=0;
		 
		 // Introducción del array:
		 
		 System.out.println ("Introduzca el array del 1 al 5:");
		 
		 
		 for (int i=0; i<5; i++) {
			 
			 System.out.print(i+". "); array [i] = entrada.nextInt();
			 
		 }
		 
		 
		 // ANÁLISIS
		 
			for (int i=0; i<4; i++) { // Para no evaluar más posiciones de las necesarias, porque con el [i+1] eventualmente llegará al 5 solo. 
				
				if (array [i] < array [i+1] ) { // Si la posición "0" es menor que la posición "1", entonces es creciente. 
					
					creciente = true;
					
				}
				
				if (array [i] > array [i+1])  { // Si la posición "0" es mayor que la posición "1", entonces es decreciente.
				
				   decreciente = true; 
				
			    }
				
			}
			
		 // PROGRAMA
			
		 if  (creciente==true&&decreciente==false) {
			 
			 System.out.print ("Introduzca el número que falta:"); numero = entrada.nextInt();
			 
			 while (array [j]<numero && j<5) { // El while nos indica en qué posición el número es MENOR, y esta posicion se asigna en sitio_num. Depende de j, que empezando en cero, termina en el array..
				 
				 sitio_num++;
				 j++;
				 
			 }
			 
			 for (int i =4; i>=sitio_num; i--) { // Siendo i=4, mientras i>=sitio_num, se resta i
				 
				 array [i+1] = array [i]; // Y se desplaza 
				 
			 }
			 
			 array [sitio_num] = numero;
			 
			 for (int i=0; i<5; i++) {
				 
				 System.out.print(array[i]+";");
				 
			 }
			 
			 
		 }
		 
		 else {
			 
			 System.out.println ("No has insertado los números en orden creciente.");
		 }
			
			
		 
			
			
		
		 
		 
		 
	 }
}
