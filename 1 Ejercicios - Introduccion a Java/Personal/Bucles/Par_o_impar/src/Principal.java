import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		int entero;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Introduce un número, el programa indicará si este es par o impar: ");
		
		entero = entrada.nextInt();
		

		while (entero != 0) {
			
			if (entero%2 == 0) {
				System.out.println ("Par.");
				entero = entrada.nextInt();
			}
			
			else {
				System.out.println ("Impar.");
				entero = entrada.nextInt();
			}
			
		}
		
		System.out.println ("¡El número introducido es 0! Inicie nuevamente el programa.");
		
	}

}
