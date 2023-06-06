
public class Principal {

	public static void main(String[] args) {
		
		
		// -----------------------------VARIABLES CON NÚMEROS ENTEROS
		System.out.println("-------Variables de números enteros-------. \n");
		
		byte entero_byte; // Es una variable "byte" de tipo entero, tiene un taaño de 8 bit, con rango -128 a 127
			entero_byte = 12; // estamos definiendo el valor de la variable, con un 12. 
			
			System.out.println ("Proyecto en pantalla el número entero en forma de byte " +entero_byte);
			
			short entero_short; // Rango de -32768 hasta 32767
			
			entero_short = 12000; // estamos definiendo el valor de la variable, con un 12000. 
			
					System.out.println ("Proyecto en pantalla el número entero en forma de short " +entero_short);
		  
			int entero_int; // Rango de millones de números, es el más común.
			entero_int= 1200000; 
				
			System.out.println ("Proyecto en pantalla el número entero en forma de int " +entero_int);	
					
			long entero_long; // Para números gigantescos 
			entero_long = 999999999;
			System.out.println ("Proyecto en pantalla el número entero en forma de long " +entero_long);	
			
			
			System.out.println("\n-------Variables de números decimales-------. \n");
			
			float decimal;
			decimal = 3.45f; //Cosa extraña, pues hay que escribir los decimales con un "." y con una "f" después. Ocupa poco.
		
					System.out.println ("Proyecto en pantalla el número decimal en forma de float " +decimal);	
			double decimal_double; // ¡Cuidado! Pesa mucho, solo recomendable en proyectos donde se requiera. 
			decimal_double = 3.784743447; // Recuerda el "."
			System.out.println ("Proyecto en pantalla el número decimal en forma de double " +decimal_double);	
			
			System.out.println("\n-------Variables de caracteres-------. \n");
			
			char caracter_char; // Para guardar un caracter. 
			caracter_char = 'a';
			System.out.println ("Proyecto en pantalla el carácter único en forma de char " +caracter_char);
			
			boolean decision;
			decision = true; // Útil en los condicionales.
			
			System.out.println ("Proyecto en pantalla la variable boolean " +decision);
		
		
					
			
			
	}

}
