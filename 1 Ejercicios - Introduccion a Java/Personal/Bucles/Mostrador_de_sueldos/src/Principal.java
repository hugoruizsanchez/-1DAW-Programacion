import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

		int sueldo, suma = 0, mayores = 0;
		
		for (int repetidor = 1; repetidor<=10; repetidor++) { // Repetir 10 veces. Esta función repetirá 10 veces lo inferior.  
			
			sueldo = entrada.nextInt();
			
			suma = suma + sueldo;
			
			if (sueldo>1000) {
				mayores++;
			}
		}
		
		
		System.out.println ("La suma de todos los salarios es "+suma+" y los salarios superiores a 1000 son "+mayores+ ".");

	}

}
