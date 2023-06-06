import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
//		Introducción de valore en pantalla. 
		
		
		
		
		
		
		System.out.print ("Introduza el número entero: "); String aString = entrada.next();
		System.out.print ("Introduzca el número decimal: "); String bString = entrada.next();
		
		
		
//		El numerador y el denominador se unen en un solo número. 
		
		String numString = aString+""+bString;
		
//		El número resultante pasará a ser el numerador, pues se trata del número sin comas
		
		int numerador = Integer.parseInt(numString);
		
//		El denominador pasa a ser la potencia de 10 elevado al mismo número de caracteres
		
		int denominador = (int) Math.pow(10, bString.length());
		
//		Proyección de los valores convertidos en forma de fracción. 
		
		System.out.println ();

		System.out.println ("La fraccion reducible es la siguiente:");
		System.out.println ();

		System.out.println (numerador);
		System.out.println ("-".repeat(aString.length()+bString.length()));
		System.out.println (denominador);
		
//		Conversión de la fracción a irreducible
		
		int [] primos = {2,3,5,7,11,13,17,19,23,29,31,37,41};
		
		for (int i=0; i<primos.length; i++) {
		
		if (numerador % primos [i] == 0 & denominador % primos [i] == 0) {
			
			denominador = denominador / primos[i];
			numerador = numerador / primos [i];
			
		}
		
		}
		
//		Proyección de la fracción irreducible: 
		
		System.out.println ();

		System.out.println ("La fraccion irreducible es la siguiente:");
		System.out.println ();

		System.out.println (numerador);
		System.out.println ("-".repeat(aString.length()+bString.length()));
		System.out.println (denominador);
		
		
			
	}
	
}
