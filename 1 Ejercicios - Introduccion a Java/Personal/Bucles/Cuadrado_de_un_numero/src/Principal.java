import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int entero; 
		int resultado = 0;
		System.out.println ("Introduce un número, el programa calculará su cuadrado. Si el número almacenado en la variable es negativo, el programa se cerrará.");
		entero = entrada.nextInt();
		
		while (entero>0) {
			
			resultado =  (int) (Math.pow(entero, 2));
			System.out.println ("El cuadrado es "+resultado);
			entero = entrada.nextInt();
		}
		
		System.out.println ("Has introducido un número negativo, lo lamento.");
	
		/* AL PRINCIPIO PENSÉ EN HACER ESTO, PERO NO SE COMPARA PRIMERO EL CONDICIONAL. 
		
		do {
			entero = entrada.nextInt();
			resultado =  (int) (Math.pow(entero, 2));
			System.out.println ("El cuadrado es "+resultado);
		} while (entero>0);
		
         */

	}

}

	

	