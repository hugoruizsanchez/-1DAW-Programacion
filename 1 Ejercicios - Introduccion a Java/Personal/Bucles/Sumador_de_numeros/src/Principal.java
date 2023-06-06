import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	
		Scanner entrada = new Scanner (System.in);
		int entero;
		int resultado = 0;

		System.out.println ("Escribe el número que quieres sumar: ");
		entero = entrada.nextInt();
		resultado = resultado + entero;
		
		while (entero != 0) {
		
			System.out.println ("Añade más números a la suma o escribe '0': ");
			entero = entrada.nextInt();
			resultado = resultado + entero;
			
		}
		
		System.out.println ("Has introducido un '0', el resultado de las operaciones encadenadas es: " +resultado +".");
		
	}

}
