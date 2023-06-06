package Metodos;

public class Principal { // En la clase "main" o principal es donde colgaremos el public static void main string

	public static void main (String [] args) { // Cuerpo del código, que lo desarrollará a partir de las clases 
		
		Operacion op = new Operacion (); // Creación de un nuevo objeto, que adquiere todas las características de la clase	
		
		op.leerNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.mostrarResultados();
		
	}
	
	
}
