
public class EJ224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] palabras = {"María", "Alberto", "Guillermo", "Juan","Ignacio" }; // Array de prueba.  ***
		
		arrayStringInvertida (palabras);
		
	}
	
	public static void arrayStringInvertida (String [] palabras) {
		
		for (int i = palabras.length-1; i>=0; i--) { // Hay que restar 1, porque NO considera que el array empieza en CERO. 	
			
			System.out.print(palabras[i]+"; ");
			
		}
		
	}

}
