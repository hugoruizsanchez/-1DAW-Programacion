package Hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	
	public static void main(String[] args) {
		
		/*
		 * Ejercicio 2. Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su
		correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar las parejas de
		palabras. El programa pedirá una palabra en español y dará la correspondiente traducción en inglés
		 */
		
		// ************** CREACIÓN DE OBJETOS ************** // 
		
		Scanner entrada = new Scanner (System.in);
		HashMap <String, String> diccionario = new HashMap <String, String> ();
		
		diccionario.put("hola", "hello");
		diccionario.put("adiós", "goodbye");
		diccionario.put("por favor", "please");
		diccionario.put("gracias", "thank you");
		diccionario.put("sí", "yes");
		diccionario.put("no", "no");
		diccionario.put("amigo", "friend");
		diccionario.put("familia", "family");
		diccionario.put("amor", "love");
		diccionario.put("feliz", "happy");
		diccionario.put("triste", "sad");
		diccionario.put("enfadado", "angry");
		diccionario.put("hambriento", "hungry");
		diccionario.put("sediento", "thirsty");
		diccionario.put("caliente", "hot");
		diccionario.put("frío", "cold");
		diccionario.put("bueno", "good");
		diccionario.put("malo", "bad");
		diccionario.put("grande", "big");
		diccionario.put("pequeño", "small");
		
		// ************** CREACIÓN DE VARIABLES ************** // 
		
		String palabraSpanish ="";
		boolean bandera = false; 

		// ************** CUERPO DEL PROGRAMA ************** // 
			
		while (bandera == false) {
			
			System.out.print ("Introduzca palabra en español: "); 
			palabraSpanish = entrada.next();
			
			if (!palabraSpanish.equals("Final")) {
				System.out.println ("La palabra traducida es: " +diccionario.get(palabraSpanish));
			}
			else {
				bandera = true;
			}
		}
		
		
		
		
		
	
		
		
	}
	
	
	

}
