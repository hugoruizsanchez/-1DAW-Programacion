
public class metodo_burbuja {
	public static void main(String[] args) {
		
		int array [] = {7,1,2,4,5,3,6};
		int aux =0;
		
		/* MÉTODO BURBUJA: toma números de dos en dos, el menor lo intercambia moviendolo hacia la izquierda
		repite el proceso sucesivamente hasta que todos los elementos han sido correctamente ordenados. */
		
		for (int i=0; i<array.length-1; i++) { // BUCLE FOR, para imprimir concatenando un bucle con otro (esto, para asegurarnos de que las vueltas que da son las suficientes
			
			for (int j=0; j<array.length-1; j++) { 
				
				if (array[j]>array[j+1]) {
					
					aux = array [j]; // Numero 1 se guarda en auxiliar
					array [j] = array [j+1]; // Numero 1 se intercambia por numero 2
					array [j+1] = aux; // Numero 2 toma el auxiliar (Numero 1) 	
					
				}
				
				
			}
	
		}
	
		
		// IMPRESIÓN DEL ARRAY:
		
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array [i]+"; ");
		}
		
	}
}
