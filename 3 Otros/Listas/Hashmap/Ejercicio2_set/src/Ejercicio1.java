import java.security.KeyStore.Entry;
import java.util.*;
public class Ejercicio1 {


	/*1. Implementa el control de acceso al área restringida de un programa. Se debe pedir un
	nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
	dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se
	agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
	nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
	estructura de la clase HashMap.
	 */
	
	
	public static void main(String[] args) {

		// CREACIÓN DE OBJETOS
		
		Scanner entrada = new Scanner (System.in);
		
		HashMap <String, String> iniciosesion = new HashMap <String, String> ();
		
		// El HashMap estará compuesto por dos 
		// K ->  (Nombre de usuario)
		// V -> usuario (password)
		
		iniciosesion.put("Hugo", "12345678");
		iniciosesion.put("Jose", "87654321");
		iniciosesion.put("Tomas", "24681012");
		
		// INTRODUCCIÓN 
		
		System.out.println ("INICIO DE SESIÓN");
		
		// PROGRAMA: INICIAR USUARIO
		/*
		 * Esta parte del código impedirá al usuario continuar hasta que introduzca un nombre de usuario válido.
		 * Para este fin, recorrerá todos los elementos del HashMap hasta encontrarlo. 
		 * Si el usuario es incorrecto, devuelve un error, 
		 */
	 			
		String usuario_propuesto =""; // Crear variable que almacena el usuario
			
		boolean terminado = false; // Variable según la que se comprueba el final del buckle
		 
		do {
			System.out.print ("  *Usuario: "); // Pregunta usuario
			usuario_propuesto = entrada.next();	
			
			for (Map.Entry<String, String> entry: iniciosesion.entrySet()) { // Bucle: comprueba todos los usuarios
				
				if (usuario_propuesto.equals(entry.getKey() )== true) {		
				System.out.println ("   ->Usuario encontrado.");
				terminado = true; // Si la coincidencia se encuentra, el bucle while se cierra, se deja de preguntar
				}	
			}
					
			if (terminado == false) { // Si NO se encuentra la coincidencia, se advierte al usuarii. 
				System.out.println ("   ->Usuario no encontrado.");
			}		
			
		}
			while (terminado == false);

			
		// PROGRAMA: INICIAR COTRASEÑA
		/*
		 * Esta parte del código compara el nombre de usuario con su contraseña, de modo que si ambos corresponden a los valores
		 * del Hashmap definido anteriormente, arroje un mensaje de éxito. 
		 */
		
		String contrasena =""; // Crear variable que almacena la contraseña
		int contador = 2; 
		terminado = false; // Reiniciar la variable
		boolean correcto = false;
		 
		do {
			System.out.print ("  *Contraseña: "); // Pregunta usuario
			contrasena = entrada.next();	
			
			for (Map.Entry<String, String> entry: iniciosesion.entrySet()) { // Bucle: comprueba la contraseña
				
				if (iniciosesion.get(usuario_propuesto).equals(contrasena)) { // Si el usuario_propuesto tiene igual el valor de la contraseña....
					terminado = true;
					correcto = true;
				}
			}
			
			if (contador <=0) {				
				terminado = true;			
			}
			
					
			if (terminado == false) { // Si NO se encuentra la coincidencia, se advierte al usuarii. 
				contador--;
				System.out.println ("   ->Contraseña incorrecta.");
				System.out.println ("   ->¡Advertencia! "+(contador+1)+" intento/s restante/s.");
				
			}		
			
		}
			while (terminado == false);
		
		
		if (correcto == true) {
			System.out.println ("Bienvenido al sistema.");
		}
		else {
			System.out.println ("Acceso denegado.");
		}
				
				
		
		

	}

}
