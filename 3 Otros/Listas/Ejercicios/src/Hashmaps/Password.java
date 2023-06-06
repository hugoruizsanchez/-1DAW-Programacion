package Hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		
		/*1. Implementa el control de acceso al área restringida de un programa. Se debe pedir un
		nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
		dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se
		agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
		nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
		estructura de la clase HashMap.
		 */
		
		// ************** CREACIÓN DE OBJETOS ********************* //
		
		// Scanner que captará la entrada
		
		Scanner entrada = new Scanner (System.in);
		
		// Crear un HashMap: HashMap <Variable clave, Variable contenido> nombre = new Hashmap <Variable clave, Variable contenido> ();
		
		HashMap <String, String> iniciosesion = new HashMap <String, String> ();
	    
		// Ajuste de usuario y contraseña.
		
		iniciosesion.put("Hugo", "12345678");
		iniciosesion.put("Jose", "87654321");
		iniciosesion.put("Tomas", "24681012");
		
		// ************** VARIABLES ********************* //
		
		boolean bandera = false;
		String peticionNombre = "";
		String peticionPassword = "";
		int contadorAdvertencias = 3;
		
		
		// ************** INICIALIZACIÓN DEL PROGRAMA ********************* //
		
		System.out.println (" | | Herramienta de inicio de sesión | | ");
	
		System.out.print("Introduzca nombre de usuario: ");
		
		// Bloque de confirmación para nombre. 
		
		bandera = false;
		
		while (bandera == false) {
			
			peticionNombre = entrada.next();
			
			if (iniciosesion.containsKey(peticionNombre) == true) {
				bandera = true;
			}
			else {
				System.out.println ("El nombre de usuario introducido NO existe.");
				System.out.print("Introduzca nombre de usuario: ");
			}				
		}
		
		// Bloque de confirmación para contraseña.
		
		bandera = false;
		
		System.out.print("Introduzca la contraseña: ");
		
		while (bandera == false) {
			
			peticionPassword = entrada.next();
			
			if (iniciosesion.get(peticionNombre).equals(peticionPassword)) {
				System.out.println ("Has introducido la contraseña correcta.");
				bandera = true;
			}
			else {
				contadorAdvertencias++;
				if (contadorAdvertencias == 0) {
					bandera = true;
					System.out.println ("Ha sobrepasado el límite de intentos.");
				}
				else {
					System.out.println ("La contraseña introducida NO es correcta. ");
					System.out.print("Introduzca contraseña correcta ("+contadorAdvertencias+") intentos: " );	
				}
				
			}	
		}
		
		if (contadorAdvertencias ==0) {		
			System.out.println ("Acceso bloqueado.");		
		}
		else {
			System.out.println ("¡Bienvenido "+peticionNombre+"!");
		}
		
		
		
		
		
		
		
		
	
			
			
			
		
		
	
		
		
		
		
	}

}
