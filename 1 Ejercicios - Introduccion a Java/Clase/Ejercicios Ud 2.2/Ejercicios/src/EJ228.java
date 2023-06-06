		/*
		Escribir un programa , que permita introducir un número binario de cualquier longitud y calcule
el número decimal asociado y vicersa.
Pasos a seguir
Paso 1: Se definirá un array en el código y se invocará a una función, presentando su valor.
Paso 2: La introducción será desde teclado, leyendo un String, aprovechando la función
codificada en la primera versión.
Paso 3: Añadir una función adicional para que realice la conversión inversa: dado un número
decimal, calcular su correspondiente en binario.
Paso 4: Hacer un pequeño menú con dos opciones:
1.- Convertir binario a decimal
2.- Convertir decimal a binario
		 */

import java.util.Scanner;
import java.lang.Math;
public class EJ228 {

	public static void main(String[] args) {
		
		  Scanner entrada = new Scanner (System.in);
		
		  // VARIABLES DEL MENÚ. 
		  
		  int eleccion; // Para preguntarle al usuario qué proceso quiere. 
		  
		  // VARIABLES DE OPCIÓN 1: DE BINARIO A DECIMAL. 
		  
		  int binario_int; // En esta variable se guardará el número binario que el usuario introduzca en pantalla. 
          int binario_decimal =0; // En esta variable se guardará el resultado de binario a decimal. 
          
          // VARIABLES DE OPCIÓN 2: DE DECIMAL A BINARIO. 
          
		  int decimal_int; // En esta variable se guardará el número decimal que el usuario introduce en pantalla. 
		  int decimal_digito=0; // Cada uno de los valores que va procesando el programa y que convierte en binario. 
  		  int [] decimal_binario = new int [1000]; // El binario que se proyectará, que guardará cada uno de los decimal_digito. 
  		  
  		  // MENÚ DEL PROGRAMA: 
  		  
		  System.out.println (" |/ CONVERSOR BINARIO /|  "); // Título del programa. 
		  
		  System.out.print ("1. Convertir de binario a decimal.\n2. Convertir de decimal a binario.\n\nIntroduzca su elección:"); // Instrucciones del programa.

		  eleccion = entrada.nextInt(); // Se pide al usuario que comunique su elección (1 ó 2) en la variable "eleccion"
		  
		  switch (eleccion) { // En base a la elección, se apela a uno o a otro proceso
		  
		  case 1: // DE BINARIO A DECIMAL. 
			  
		       System.out.print ("Introduzca el valor binario que desea convertir a decimal: ");   // Solicitud por salida de que el usuario introduzca el binario a convertir. 
				  
		       binario_int = entrada.nextInt(); // Se guarda el número binario en una variable entera. 
				 
		       int[] binario_array = Integer.toString(binario_int).chars().map(c -> c-'0').toArray();// Esta expresión sirve para convertir el número entero en un array con números separados.
		                             // Numero entero a STRING(valor) caracteres desde el primero -> convertirlos a array. 
		  	   
		       
		       for (int i = (binario_array.length)-1; i>=0; i--) { //  Se repetirán en un bucle hasta terminar con todos los valores del array. 
		  		   
		    	   System.out.println(i +"  " +binario_array [binario_array.length-(i+1)]); // Por defecto el binario_array se imprimía SEGÚN el orden inverso de I, así que con la operción [binario_array.length-(i+1)] LO REVERTIMOS
		  		   
		  		   binario_decimal= (int) (binario_decimal + ((Math.pow(2, i))*binario_array [binario_array.length-(i+1)])); // Aplicación de la fórmula (ver anotaciones) 
			
		}
			
				    System.out.println ("El número decimal de "+binario_int+ " es "+binario_decimal+"."); // Impresión del número generado. 
		
				    break; // Realizadas las operaciones programadas, el break cierra el programa. 
		  
		  case 2: // DE DECIMAL A BINARIO. 
			  
			  System.out.print ("Introduzca el valor decimal que desea convertir a binario: ");  // Solicitud por salida de que el usuario introduzca el decimal a convertir.
			  
			  decimal_int = entrada.nextInt(); // El decimal se guarda en la variable "decimal_int"
			  
			  int j=0; // Damos comienzo a un iterador j
			
		while (decimal_int != decimal_digito) { // Mientras el decimal_int (dividendo) NO sea igual a decimal_digito (resto)

			 // Sumamos valor al iterador j cada vez que se repite el while, esto nos ayudará más adelante para saber cuántos numeros de decimal binario [] imprimir
			
					 decimal_digito = (int) (decimal_int%2); // Decimal digito = resto del decimal_int/2
					 
					 if (decimal_digito%2 ==0) { // Si el resto es par...
						 decimal_digito =0; // El digito será cero. 
					 }
					 else if (decimal_digito%2 !=0) { // Si es impar...
						 decimal_digito =1; // El dígito será 1
					 }
					
					 decimal_binario [j] = decimal_digito; // El dígito (0 o 1) se guardarán en la  posición j del array 
					 
					 decimal_int= decimal_int/2; // Dividimos entre 2 como indica la fórmula (ver anotaciones)
					 
					 j++;
		 	 
			} // 11 - 16
		
		decimal_digito = (int) (decimal_int%2);
			
			for (int i=j-2; i>=0; i--) { // Repetimos tantas veces como valores "j" haya, esto es, cuantos valores existan escritos. 
				
				System.out.print(decimal_binario [i]); // imprimimos cada uno de los 0 y 1 que hemos guardado en la variable gracias a decimal_digito. 
				
			}
			
			  break;
			  
		  default: System.out.println ("\nNo has introducido ninguna de las dos elecciones, reinicia el programa para continuar.");
		}
			

	}

}
