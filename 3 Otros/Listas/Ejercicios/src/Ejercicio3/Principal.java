package Ejercicio3;
import java.util.*;

public class Principal {
	

	
/*
 * 

// ...

HashMap<String, Integer> mapa = new HashMap<String, Integer>();

En este ejemplo, se crea un HashMap que tiene claves de tipo String y valores de tipo Integer. Para agregar elementos al HashMap, puedes usar el método put():
java

mapa.put("clave1", 1);
mapa.put("clave2", 2);
mapa.put("clave3", 3);

También puedes especificar el tamaño inicial del HashMap al crearlo, como en el siguiente ejemplo:
java

HashMap<Integer, String> mapa2 = new HashMap<Integer, String>(10);

En este ejemplo, se crea un HashMap que tiene claves de tipo Integer y valores de tipo String con una capacidad inicial de 10 elementos. Sin embargo, ten en cuenta que el tamaño del HashMap puede aumentar automáticamente a medida que agregas más elementos.

Para obtener un valor del HashMap, puedes usar el método get() y pasarle la clave correspondiente:
java

Integer valor = mapa.get("clave2");

En este ejemplo, se obtiene el valor asociado a la clave "clave2" y se guarda en la variable "valor".
 */
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> tipoHabitat = new HashMap<String, String>();
		HashMap<String, String> tipoAlimentacion = new HashMap<String, String>();
		
		Scanner entrada = new Scanner (System.in);
		String peticion = "";
		
		
		tipoHabitat.put("Rana", "En los trópicos y cerca de las zonas húmedas y acuáticas.");
		tipoHabitat.put("Salamandra", "Ecosistemas húmedos");
		tipoHabitat.put("Sapo", "En cualquier sitio salvo el desierto y la Antártida");
		tipoHabitat.put("Tritón", "América y África");
		
		tipoAlimentacion.put("Rana", "Larvas e insectos");
		tipoAlimentacion.put("Salamandra", "Pequeños crustáceos e insectos");
		tipoAlimentacion.put("Sapo", "Insectos, lombrices, pequeños roedores");
		tipoAlimentacion.put("Tritón", "Insectos ");
		
		while (0<1) {
			System.out.print ("Introduzca tipo de anfibio: ");
			peticion = entrada.next();
			
			if (tipoHabitat.containsKey(peticion)) {
				System.out.println ("Hábitat: "+ tipoHabitat.get(peticion));
				System.out.println ("Alimentación: "+ tipoAlimentacion.get(peticion));
			}
			else {
				System.out.println ("ERROR: Nombre no reconocido.");
			}
			
		}
		
	}

	
	
}
