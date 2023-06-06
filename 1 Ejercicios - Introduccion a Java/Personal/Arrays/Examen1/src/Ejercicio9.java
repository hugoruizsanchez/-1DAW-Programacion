public class Ejercicio9 {

	public static void main(String[] args) {
	
		boolean cambiador; cambiador = true;
		
		// TABLERO DE AJEDREZ. 
		
		System.out.println ("TABLERO DE AJEDREZ:\n");
		
		System.out.println ("- - - - - - - - - - - -");
		
		for (int i=0; i<4; i++) { // FOR de 4 repeticiones (esto es, porque se están ejecutando DOS sentencias en cada for)
			
			if (cambiador==true) { // Si cambiador es verdadero...
			
				for (int j=0; j<4;j++) { // Repetimos 4 veces "XO"
								
				System.out.print(" X "); 	System.out.print(" O ");
				
			} // FOR
			
			System.out.println(); // Salto de línea.
			cambiador=false;   // El cambiador pasa a falso. 
			
			} // IF
			
			if (cambiador==false) { // Si cambiador es falso...-> Lo mismo de antes. 
				
				for (int j=0; j<4; j++) {
					
					System.out.print(" O "); 	System.out.print(" X "); 
					
				}// FOR
				
				System.out.println();
				cambiador = true; 
				
			}// IF
			
		}
		
		System.out.println ("- - - - - - - - - - - -");		
	}
}