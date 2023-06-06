import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		
		System.out.println ("Escribe dos números, ´A´ y ´B´ yo determinaré cuál es el mayor.");
		Scanner entrada = new Scanner (System.in);
		int numeroa;
		int numerob;
		System.out.println ("Introduzca el número ´A´: ");
	numeroa = entrada.nextInt();
	System.out.println ("Introduzca el número ´B´: ");
	numerob = entrada.nextInt();
	
	if (numeroa<numerob) {
		
		System.out.println ("El número "+numeroa+" es menor que "+numerob+".");
	}
	else {
		
		if (numeroa>numerob)
		
		System.out.println ("El número "+numeroa+" es mayor que "+numerob+".");
		
		else {
			System.out.println ("Los dos números que has introducido son iguales.");
		}
	
	}
	
	
		
	
	

	}

}
