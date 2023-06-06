package guardadoTxt;
import java.io.*;

public class Principal {
	
	public static void main (String []args) throws IOException {
	
	/*
	 * Crear un fichero que contenga "Hola mundo" y luego leerlo. 
	 */
	
	// *********************** Creación de fichero ***********************
	
	File ficheroTexto = new File ("fichero.txt"); 
	
	// *********************** Escritura de fichero ***********************
	
	// Creación de objeto que permita guardado de texto (printwriter) 
	
	PrintWriter salida = new PrintWriter (new FileWriter (ficheroTexto, true));	
	
	// Escritura de "Hola mundo"
	
	salida.println("Hola mundo");
	
	salida.close();
	
	// *********************** Lectura de fichero ***********************
	
	// Creación de objeto que permita visualización de texto guardado (BufferedReader) 
	
	BufferedReader entrada = new BufferedReader (new FileReader (ficheroTexto));
	
	// Impresión del contenido del fichero		
	
	String lectura = "";
	lectura = 	entrada.readLine();
	System.out.println (lectura);
	

	}
}
