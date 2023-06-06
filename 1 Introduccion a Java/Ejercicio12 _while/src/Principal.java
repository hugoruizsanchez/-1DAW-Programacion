import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		
		// La función "while" sirve para, mientras una condición exista, se repita constantemente un ciclo
		
		
		// Copiar en consola los números del 1 hasta el 10 
		Scanner entrada = new Scanner (System.in);
		int entero=0; 
		int segundos; 
		int numeros;
		System.out.print("Contador de números \nIndique los números que desea contar del 1 al n:");
		numeros = entrada.nextInt();
		System.out.print("Indique el intervalo en segundos:");
		segundos = entrada.nextInt();
		
		while (entero<numeros) { // mientras que 0 sea MENOR que el número especificado... irá sumando un número hasta que se cumpla la condición. 
			entero++;
			System.out.println ("Entero : "+entero);
			Thread.sleep(1000*segundos); // Esta función sirve para esperar la cantidad deseada de milisegundos (1000 ms = 1 seg.) -> MODIFICA LA LINEA 4. 
		}

		
	System.out.println ("\nFin del bucle.");
	}

}
