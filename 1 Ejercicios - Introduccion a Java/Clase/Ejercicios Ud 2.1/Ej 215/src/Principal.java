import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println ("Termostato: indica la temperatura: ");

		float temperatura; 
		Scanner entrada = new Scanner (System.in);	
	
		temperatura = entrada.nextFloat();
		if (temperatura<21) {
			
			System.out.println ("La temperatura es inferior a 21 grados, el aire acondicionado permanecerá apagado.");
			
		}
		else {
			
			if (temperatura>=21)
				
				System.out.println ("La temperatura es superior a 21 grados, el aire acondicionado se encenderá.");	
		}
		
		
		
		
	}

}
