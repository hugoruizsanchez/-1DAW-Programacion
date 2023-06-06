
public class Ejercicio10 {	
	
 /* Enunciado ejercicio 10: 

	 Dado el siguiente array, obtén la suma de cada una de las columnas, la suma de cada una de las filas y
el producto de la diagonal que comienza en la celda de la esquina superior izquierda y termina en la celda
de la esquina inferior derecha. Los valores se deberán mostrar en pantalla, identificando fila, columna y
valor para las sumas y un texto para identificar el valor de la diagonal. (3ptos). No se admiten soluciones
programáticas que utilicen constantes o patrones numéricos para calcular los valor es.
int [][] tablero = {{ 1, 2, 3, 4, 5},
{ 2, 2, 0, 0, 0},
{ 3, 0, 3, 0, 0},
{ 4, 0, 0, 4, 0},
{ 5, 0, 0, 0, 5}};
	 
	 */
	
	public static void main(String[] args) {
	
	int [][] tablero =            // Tablero propuesto por el ejercicio. 
		   {{ 1, 2, 3, 4, 5},
			{ 2, 2, 0, 0, 0},
			{ 3, 0, 3, 0, 0},
			{ 4, 0, 0, 4, 0},
			{ 5, 0, 0, 0, 5}};
	
	// SUMA DE CADA UNA DE LAS COLUMNAS. 
	
	System.out.println ("SUMA DE LAS COLUMNAS :");
	
    int j=0;  // Variable J.
	int suma =0; // Variable suma.
    
	
	for (int z=0; z<5; z++) { // Repetir 5 veces (cada una de datos verticales que hay)...
	
	for (int i=0; i<5; i++) { // Repetir 5 veces (cantidad de datos horizontales que hay)...
	
	suma = tablero [i] [j] + suma;
				
	}
	
	System.out.println ("Columna "+(j+1)+": "+suma);
	suma =0;                                        // Después de finalizar el proceso, pasa a la siguiente columna. reinicia la variable de suma. 
	j++;
	
	}
	
	// SUMA DE CADA UNA DE LAS FILAS. 
	
	System.out.println ("SUMA DE LAS FILAS: ");
	
 j=0;
 suma =0; 
	
	for (int z=0; z<5; z++) {
		
		for (int i=0; i<5; i++) {
			
			suma = tablero [j] [i] + suma;
			
		}
		
		System.out.println ("Fila "+(j+1)+": "+suma);
		suma =0; 
		j++;
		
	}
	
	// MULTIPLICACIÓN DE LAS DIAGONALES. 
	
	System.out.println ("MULTIPLICACIIÓN DIAGONAL: ");
	
	suma =1; 
	
	for (int i=0; i<5; i++) {
		
		suma= tablero [i][i]*suma; 
		
	}
	
	System.out.println ("Diagonal 1: "+suma);
	
	
	
}
	
}



/*

SDG
     /
 _ _ _ _
 
  /
 /
/


*/