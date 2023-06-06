import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.print ("Introduzca los elementos para el array 'numeros': ");
		
		Scanner entrada = new Scanner (System.in);
		
		int nElementos = entrada.nextInt();
		
		int [] numeros = new int [nElementos];
		
		for (int iterador = 0; iterador<nElementos; iterador++) {
			
			System.out.print (iterador+". "); 
			
			numeros [iterador] = entrada.nextInt();
			
		}
		
		System.out.println ("Los valores son:");
		
		for (int iterador = nElementos-1; iterador>=0; iterador--)  { // En la variable iterador (nElementos-1, por el cero), mientras sea igual o mayor que cero, eliminar 1.
			System.out.println (iterador+". "+numeros [iterador]);
		}
		
	}

}
