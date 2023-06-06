import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/*
		Se quiere realizar un programa que aplique un descuento a un precio dependiendo de su valor.
		Si el precio supera un importe mínimo se aplica el descuento, sino no se aplica. El descuento
		será del 8% y la compra mínima 100€.
*/
		final float PMAX=3000;
		float precio;
		float resultado; 
		// Definimos la variable precio, como una float, puesto que los precios se pueden ser enteros o decimales. 
		Scanner entrada = new Scanner (System.in); // Definimos el scanner como ENTRADA. 
		
		
		System.out.println ("Calculador de descuento, solo con compras superiores a 100€"); // Introducimos el título del programa. 
		System.out.println ("Introduzca el valor de su producto (¡recuerde, solo compras superiores a 100€!)"); // Solicitamos al usuario la variable del precio
		
		precio = entrada.nextFloat(); // Asociamos el precio al scanner. Como tenemos que ir cribando los valores, empezamos por el limitador de 3000
		
		if (precio>=PMAX) {
			
			System.out.println ("No podemos aplicar el descuento ¿es que quieres arruinarnos? No aceptamos valores superiores a 3000");
		}
		else {

		if (precio>=100) { // Si el precio es MAYOR o IGUAL a 100... 
			// Realizamos la operación, 1-0.08 es para aplicar un porcentaje de resta. 
			resultado = (float) (precio*(1-0.08)); // Este proceso debe adecuarse a la variable floart, por lo que usamos (float) seguido de la operación deseada.
			System.out.println ("Enhorabuena, se ha aplicado un descuento del 8%, tu precio ahora cuesta: " +resultado);
		}
		else { 
			
			if (precio<0)
			
			System.out.println ("¡El producto introducido es inferior a 0 o 0!"); 
			else {
				if (precio<100)
					System.out.println ("¡El producto introducido es de un costo inferior a 100€!"); 
						
			}	
		}
		}

	
		
		
	
		
		
	
	}

}
