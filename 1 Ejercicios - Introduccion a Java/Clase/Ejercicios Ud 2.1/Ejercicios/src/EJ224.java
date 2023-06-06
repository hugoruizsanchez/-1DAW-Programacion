
public class EJ224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] valor = {2,7,9,12,3,6}; // Array de prueba. 
		
		arrayInvertida (valor);
		
	}
	
	public static void arrayInvertida (int [] y) {
		
		for (int i = y.length-1; i>=0; i--) { // Hay que restar 1, porque NO considera que el array empieza en CERO. 	
			
			System.out.print(y[i]+"; ");
			
		}
		
	}

}
