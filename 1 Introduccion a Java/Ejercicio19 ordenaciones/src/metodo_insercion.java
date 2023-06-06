
public class metodo_insercion {
	public static void main(String[] args) {
		
		int array [] = {7,1,2,4,5,3,6};
		int pos, aux; 
		
		// MÉTODO POR INSERCIÓN: los elementos del array van comparándose con su izquierda, desplazándose de derecha a izquierda si son menores hasta que finaliza. 
		
		
		for (int i=0; i<array.length; i++) {
		
			pos = i;
			aux = array [i];
			
			while (pos>0 && array [pos-1] > aux) { // Pos > 0, dado que la posición tiene que ser mayor que 0 para ser comparada, Y el array [i-1] -> pos sea mayor que array [i] se repetirá
			
				array [pos]  = array [pos-1]; // El valor pasa a la izquierda
				
				pos--; // Se resta la posición
			
		    }
			
			array [pos] = aux; // Se actualiza el valor
		
	    }
		
	// IMPRESIÓN DEL ARRAY:
		
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array [i]+"; ");
		}
		
		
	}
}
