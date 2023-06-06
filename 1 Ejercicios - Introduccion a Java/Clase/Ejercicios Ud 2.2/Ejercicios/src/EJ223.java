
public class EJ223 {

	public static void main(String[] args) {
		
		// Dado un array de enteros, mostrar por pantalla sólo los valores pares
		
		int [] valor = {2,7,9,12,3,6}; // Array de prueba. 

		arrayPares (valor);
	}
	
	public static void arrayPares (int [] y) {
		
		
		for (int i = 0; i<y.length; i++) {
			
				if (y[i]%2==0 ) {
					
					System.out.print (y[i]+"; ");
					
				}
			
			
		}
		
		
		
		
	}
	

}
