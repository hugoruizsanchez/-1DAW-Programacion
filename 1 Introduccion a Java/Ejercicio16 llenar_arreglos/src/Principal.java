import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// - Cómo pedir al usuario cuántos elementos tendrá nuestro arreglo:
		
		Scanner entrada = new Scanner (System.in);
	
		System.out.println ("¿Cuántos elementos quieres que tenga el arreglo 'letras'?");
		
		int nElementos = entrada.nextInt(); // Número de elementos que tendrá el arreglo, se lo pedimos al usuario.  
		
		char [] letras = new char [nElementos]; // El valor que el usuario ha dado se plasmará en la [dimensión], que es la cantidad de datos que tendrá el arreglo. 
		
		System.out.println("Escribe los elementos que guardarán el arrelo 'letras': ");
		
		for (int repetidor = 0; repetidor<nElementos; repetidor++) {  // Apelamos a la sentencia detallada en el Ejercicio 15, que repetirá en función de cuantos elementos existan (nElementos)
			System.out.print ("Escriba el valor "+(repetidor+1)+": "); 
			
			letras [repetidor] = entrada.next().charAt(0); // Para asignar valores manualmente, usabamos: letras [posicion] = dato; aqui usamos la misma sentencia, pero adaptada a lo escrito por el usuario con el valor del repetidor.
			
		}
		

		for (int repetidor = 0; repetidor<nElementos; repetidor ++) {
			System.out.println ("Valor "+(repetidor+1)+": " +letras[repetidor]); 
		}

		
		
	}

}
