import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
			int [] numeros = new int [10];
			
			for (int iterador =0; iterador<10; iterador++) {
				
				numeros [iterador] = entrada.nextInt();
			}
			
			for (int iterador =0; iterador<5; iterador++) { // Cinco ciclor, porque hay dos sentencias en el bucle
				System.out.print (numeros[iterador]+" "); // Esta va en orden normal
				System.out.print (numeros[8-iterador]+" "); // Esta va en orden inverso.
			}
			

	}

}
