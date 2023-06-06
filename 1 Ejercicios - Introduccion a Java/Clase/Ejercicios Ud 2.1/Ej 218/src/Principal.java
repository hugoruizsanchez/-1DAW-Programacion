import java.util.Random;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	// EL PROGRAMA DEBE DAR UN NÚMERO MAYOR O MENOR, TÚ DEBES DE INDICARLE SI ESTE ES MAYOR O MENOR

		// INSTRUCCIONES DEL PROGRAMA 
		
		System.out.println ("El programa adivinará el número que estás pensando, indícale si es 'MAYOR' o 'MENOR' en cada ronda. Escribe 'IGUAL' si he acertado.");
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		int adivinado = aleatorio.nextInt (100)+1;
		int acotador1 = 1;
		int acotador2 = 100; 
		String pista;
		boolean estado =false;
		
while (estado==false) {
	System.out.println ("El número en el que estás pensando es el: " +adivinado);
	
	pista = entrada.next();
	
	if (pista.equals("MAYOR")) {
		acotador1 = adivinado;
		adivinado = aleatorio.nextInt (acotador1,acotador2)+1;
	 	
		
	}
	else {
		if (pista.equals("MENOR")) {
			
			acotador2 = adivinado;
			adivinado = aleatorio.nextInt (acotador1,acotador2)-1;
	
		}
		else {
			if (pista.equals("IGUAL")) {
				System.out.println ("Lo he adivinado. Las máquinas pronto superarán a los humanos en la ");
				estado = true;
			}
		}
	}

	
}
		

		
	}

}
