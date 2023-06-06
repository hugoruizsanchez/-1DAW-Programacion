import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		// HACER UN PROGRAMA QUE CALCULE EL PRODUCTO DE LOS PRIMEROS 10 NÚMEROS IMPARES INTRODUCIDOS. 
int entero; 
int resultado = 1; // Al tratarse de un programa que operará con productos, iniciaré la variable con el número neutral para los mismos. 
int contador = 0;
Scanner entrada = new Scanner (System.in);


System.out.println ("Introduzca los números que considere conveniente. Escriba '0' para cesar la ejecución del programa"); 
// Esta sentencia solo se ejecutará una vez, así que queda fuera del "do".



do { // Hacemos un "do" para que NO analice las condiciones antes de ejecutarlas, y así NO cometer el mismo error que con el Sumador de Numeros. 
	
	System.out.println ("Escriba un número: "); entero = entrada.nextInt();

	
	if (entero%2==0) {
		
		System.out.println ("Has introducido un número par.");
		
	}
	
	else {
		
		if (contador<10) {
			
			resultado = entero*resultado;
			System.out.println ("Has introducido un número impar.");
			contador++;
			
		}
	}
	
	
	
	
} while (entero != 0);
		
		
System.out.println ("Has introducido un número '0', el programa ha finalizado. El resultado del producto es "+resultado+ " y ello ha necesitado de "+contador+" intentos.");	
		
		
	}

}
