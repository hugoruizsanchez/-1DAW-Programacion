
public class metodo_seleccion {
	public static void main(String[] args) {
		
		int array [] = {7,1,2,4,5,3,6};
		int minimo,aux;
		
		/* ORDENAMIENTO POR SELECCIÓN
			   - Busca el mínimo elemento de la lista.
			   - Lo cambia por el primer elemento.
			   - Busca el mínimo elemento de la lista.
			   - Lo cambia por el segundo elemento. 
		*/
		
		 
		
		for (int i=0; i<array.length; i++) {
			
			minimo = i;
			
			for (int j=i+1; j<array.length; j++) { // Comparativa con el siguiente caracter
				
				if (array [j] < array [minimo]) { // Si el array minimo es menor que j, el valor de minimo equiale a j. 
					minimo =j;
				}
			}
			
			aux = array [i]; 
			array [i] = array [minimo]; // Se intercambian los numeros
			array [minimo] = aux; 
			
			
		} // Y se repite el bucle hasta que se ha terminado el array
	
		// IMPRESIÓN DEL ARRAY:
		
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array [i]+"; ");
		}
		
	}
}
