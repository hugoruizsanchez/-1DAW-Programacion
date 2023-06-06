import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Introduce un caracter, en minúscula o mayúscula, yo diré lo que es:");
		Scanner entrada = new Scanner (System.in);
		char letra = entrada.next().charAt(0);
		
		if (Character.isUpperCase(letra)) { // Character. -> Nos indica las opciones del character, en este caso, si es mayúscula (uppercase)
			
			System.out.println("Se trata de una mayúscula. ");
			
		}
		
		else { 
			
			System.out.println("Se trata de una minúscula.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
