import java.util.Scanner; // Utilizado por la línea 8, "Scanner"

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in); 
	    // Con Scanner estamos creando un objeto para leer lo que el usuario digita en pantalla. 
		// = new Scanner (System.in) refiere a la creación de un objeto Scanner con la función de ENTRADA de datos.
		// ATENCIÓN: Saldrá un error en el programa, porque para usar este elemento debemos importar java.util.scanner
		// "import java.util.Scanner;"

	int numero; // Creamos variable número. 
	
	System.out.println ("Escribe la variable ´numero´, y hazlo rápido.\n");
	
	numero = entrada.nextInt (); // Guardar en el scanner "entrada". next(tipo-de-variable), puede ser entrada.nextFloat o entrada.nextDouble.
	
	System.out.println ("\nEl número es " +numero);
	
	float numero_decimal;  // Puede hacerse el mismo proceso con un número decimal. 
	
	System.out.println ("\nEscribe la variable ´numero_decimal´, y hazlo rápido.\n");
	
	numero_decimal = entrada.nextFloat(); // Ídem
	
	System.out.println ("\nEl número es " +numero_decimal);
			
	String cadena ; // para escribir un texto, leer ejercicio 3: datos no primitivos.
	
	System.out.println ("\nEscribe la variable ´cadena´, y hazlo rápido.\n");
	
	cadena = entrada.next(); // entrada.next () solo guardará una palabra, pero entrada.nextLine() guardará todo. 
	
	System.out.println ("\nLa cadena es " +cadena);
	
	char caracter;
	
	System.out.println ("\nEscribe la variable ´caracter´, y hazlo rápido.\n");
	
	caracter = entrada.next().charAt(0); // Para guardar variables de caracteres. El CharAt lee los caracteres
	// que le indicas, si señalas "0", leerá "1", si señalas "1", leerá "2". 
	
	System.out.println ("\nEl carácter es " +caracter);
	
	
	// Minuto 57 https://www.youtube.com/watch?v=rSXSqlzwyp4&t=1563s
	
	
	
	
	
		
	}

}
