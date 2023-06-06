
public class Principal {

	public static void main(String[] args) {
	
		int valor1=4, valor2=3;
		char letra= 'A';
		
		holaMundo ();
		  // No es necesario escribir exactamente los valores usados en la función, se sustituyen automáticamente. 
		
		System.out.println ("El resultado es "+suma (valor1, valor2)+".");
		
		if (mayorQue0 (valor1)) { // No es necesario condicionarlo a == true porque esto ya lo hace la función
			System.out.println ("El número "+valor1+" es mayor que cero.");
		}
		else {
			System.out.println ("El número "+valor1+" es menor o igual que cero.");
		}
		
		
	System.out.println ("La letra '"+letra+"' se traduce a código ASCII como "+devuelveCodigoASCII (letra)+ ".");
	
	System.out.println ("El número aleatorio es "+generaNumeroAleatorio (1,10)+ ".");
		
	
		
		
	}
	
	
	
	// Los métodos sirven para abreviar partes de un código ya escrito. 
	
	// *******  MÉTODO: ESCRIBIR HOLA MUNDO:
	// *******¡Ojo! Los "métodos" no devuelven nada, no hacen un "return", así que solo reproducen  el código mostrado.  
	
	public static void holaMundo () { // Fuera del corchete de main (string[] args) definimos holaMundo, el nombre de nuestro método. void significa "vacío". 
		
		System.out.println ("Hola mundo."); // Imprimimos "Hola mundo" en pantalla. 
			
	}
	
	// *******  FUNCIÓN: REALIZAR UNA SUMA.
	// *******  Las funciones devuelven datos según del tipo que sean, esto se define en su tipo de variable

	public static int suma (int a, int b) { // Public static tipo-de-variable-que-devolverá nombre (variable nombre, variable nombre, ... )
		
		// Lo que está entre paréntesis son los números que en el código operaremos; la variable resultado no necesita estar entre paréntesis, porque no la modificaremos. 
		
		return a+b; // return es para devolver lo que queremos, en este caso, el resultado de la operación. 
		
	}
	
	// *******  FUNCIÓN: QUE DIGA SI EL NÚMERO ES MAYOR QUE 0
	
	public static boolean mayorQue0 (int a) {
		
		return a>0; // Así lo abreviamos, en vez de hacer el if entero....que sería igual de efectivo.
		
		/*
		if (a>0) {
			
			return true;
			
		}
		else {                 // A partir del else no es necesario, porque el valor siempre empezará como falso. Sin embargo, lo dejo para aclararlo. 
			return false;
		}
		*/
		
	}
	
	// *******  FUNCIÓN: QUE arroje LA TRADUCCIÓN ASCII DE UN CARACTER. 
	
	public static int devuelveCodigoASCII (char caracter) {
		
		return (int) caracter;  // Esto se llama "castear", convertimos el caracter introducido a codigo ASCII pasandolo a entero. 
		
	}
	
	// *******  FUNCIÓN: QUE ARROJE UN NÚMERO ALEATORIO
	
	
	public static int generaNumeroAleatorio (int minimo, int maximo) {
		
		return (int) (Math.random() *(minimo-(maximo+1))+((maximo+1)));
		
	}

}
