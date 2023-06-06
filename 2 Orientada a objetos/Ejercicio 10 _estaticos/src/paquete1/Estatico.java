package paquete1;

public class Estatico {
	
	private static String frase = "Primera frase"; // Sirve para fijar un atributo, no perteneciendo al objeto sino a la clase. 
	// Puede ser modificado en el main, pero esto supondrá que sea estático. Cualquier cambio en el atributo de un objeto lo supondrá en todos. 
	
	
	public static int sumar (int a, int b) { // No dependerá de un objeto, sino de la clase -> MIRAR LÍNEA 27
		
		int suma = a+b;
		return suma; 
		
	}
	
	
	public static void main (String [] args) {
		
		Estatico ob1 = new Estatico ();
		Estatico ob2 = new Estatico ();
		
		ob2.frase ="Segunda frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		
		System.out.println ("La suma es"+Estatico.sumar(3, 4)); // Así, si queremos llamarla, no dependemos de un objeto sino de una clase
		
		
	}

}
