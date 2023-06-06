
public class EJ222 {

	public static void main(String[] args) {

		int [] valor = {2,7,9,12,3,6};  // Valores de prueba. 
		
		muestreoArray (valor);
		
		System.out.println();
		
		sumar1Array (valor);
		
		muestreoArray (valor);
		
	}
	public static void muestreoArray (int [] valor) { // Es void, porque no devolverá nada, solo proyectará en pantalla. 
	 	
		for (int i=0; i<(valor.length-1); i++) { // Bucle que contemplará todos los elementos del array hasta terminar (-1) para no mostrar ; en el ultimo digito. 
	
			System.out.print(valor[i]+"; "); // Los elementos del array serán presentados entre ";"
			
		}
		
		System.out.print(valor[valor.length-1]+". "); // Para mostrar un "." en vez de un ";" .
		
	}
	
	public static void sumar1Array (int [] valor) {
		
		
		for (int i=0; i<valor.length; i++) {
			
			valor [i] = valor [i]+1; // Definimos el valor del elemento. 
		
		}
		
	}
	
}
