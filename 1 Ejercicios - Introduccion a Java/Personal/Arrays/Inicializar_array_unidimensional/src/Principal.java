import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// En este ejercicio inicializaremos un array al que podremos modificar sus dimensiones y almacenar datos en él, sirviéndonos de los bucles "for"
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print ("Introduzca los datos que guardará en el arreglo 'numeros': ");
		
		int nElementos = entrada.nextInt(); // Enunciamos la variable que guardará el número de elementos, y le pedimos al usuario que la introduzca.
		
		int [] numeros = new int [nElementos]; 
		
		for (int iterador =0; iterador<nElementos; iterador++) { // Esta sentencia repetirá la petición inferior cuantas veces sea necesario para abarcar la totalidad de los elementos que conforman el array.
			
		System.out.print (iterador+". "); 
		
		numeros [iterador] = entrada.nextInt(); // La posición asociada a cada parte de la array será modificada por el usuario en la entrada.
		
		}
		
		for (int iterador=0; iterador<nElementos; iterador++) { // Sentencia  de la misma naturaleza que en la línea 17. 
			
			System.out.println (iterador+". "+numeros [iterador]);	
		}
 
	}

}
