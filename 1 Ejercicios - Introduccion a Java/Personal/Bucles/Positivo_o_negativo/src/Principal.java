import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		int entero;
		int contador = 0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Introduce un número, el programa indicará si este es positivo o negativo: ");
		
		entero = entrada.nextInt();
		

		while (entero != 0) {
			
			if (entero>0) {
				System.out.println ("Positivo.");
				entero = entrada.nextInt();
				contador++;
			}
			
			else {
				System.out.println ("Negativo.");
				entero = entrada.nextInt();
				contador++;
			}
			
		}
		
		System.out.println ("¡El número introducido es 0! Inicie nuevamente el programa.\n El programa se ha repetido "+contador+" veces.");
		
	}

}
