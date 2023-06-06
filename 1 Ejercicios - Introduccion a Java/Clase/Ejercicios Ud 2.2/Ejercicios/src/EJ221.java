
public class EJ221 {

	public static void main(String[] args) {

		/* 
		Diseñar una función que , genere un número aleatorio y en función de su valor, retorne un
		carácter de acuerdo a la siguiente regla:
		 Si el número está entre 0 y 0,5 , devuelve un ‘1’
		 Si el número está entre 0,51 y 0,7, devuelve una ‘X’
		 Si el número es > 0,71, devuelve un ‘2’ 
		 */

		System.out.println (rangoAleatorioEnCaracter());
		
		
	}
	
	public static char rangoAleatorioEnCaracter () { // Asignamos la función, como el caracter a devolver es un "char", es una public static char. 
	
		char caracter = '0'; // Inicializamos la variable en un caracter cualquiera. 
		float aleatorio = (float) (Math.random() *(0-(1+1))+((1+1))); // Genera un número aleatorio entre 0 y 1 
		
		// System.out.println (aleatorio); // Impresión de prueba. El programa funciona, por lo que es prescindible. 
		
		if (aleatorio<=0.5) { // Si el número aleatorio generado es <= 5...
			caracter = '1';
		}
		
		else if (0.5<aleatorio&&aleatorio<=0.7) {
			caracter = 'X';
		}
		
		else if (aleatorio>0.71) {
			caracter= '2';
		}
			
		return caracter;

	}
		
}
