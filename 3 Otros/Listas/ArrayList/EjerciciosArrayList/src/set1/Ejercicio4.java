package set1;
import java.util.*;
public class Ejercicio4 {
	
	/*
	 * Ejercicio 4. Crea un programa que permita al usuario almacenar una secuencia aritmética en un
arrayList y luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1,
3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa solicitará al usuario V, I
además de N (número de valores a crear).
	 */

	public static void main(String[] args) {
		
		// OBJETOS
		
		Scanner entrada = new Scanner (System.in);
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		// VARIABLES 
		
		int valores =0;  // -> Cantidad de valores. 
		int salto =0; // -> Salto por ciclo. 
		int inicio =0; // -> Valor inicial. 
		
		// PETICIÓN DE VALORES: 
		
		System.out.println ("CREADOR DE SECUENCIA ARITMÉTICA");
		System.out.print("Introduzca la cantidad de valores: ");
		valores = entrada.nextInt();
		System.out.print("Introduzca el salto por ciclo: ");
		salto = entrada.nextInt();
		System.out.print("Introduzca el valor inicial:" );
		inicio = entrada.nextInt();

		// PROCESAMIENTO DE LA INFORMACIÓN 
		
		for (int i=0; i<valores; i++) {
			
			listaEnteros.add(inicio+salto*(i));
			
		}
		
		// MUESTREO DE LA INFORMACIÓN
		
		System.out.print("La serie resultante es la siguiente: ");
		
		for (int i=0; i<listaEnteros.size(); i++) {
			System.out.print (listaEnteros.get(i)+"; ");
		}
		
		
		
	}

}
