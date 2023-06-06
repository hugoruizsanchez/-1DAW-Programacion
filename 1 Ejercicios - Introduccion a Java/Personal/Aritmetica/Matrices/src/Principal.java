
public class Principal {

	public static void main(String[] args) {
// ARREGLOS CON VARIAS DIMENSIONES. 
	
		int [][] matriz;
		matriz = new int [4][4];
		matriz [0][0]= 4;
		matriz [0][1]= 6;
		
	   //int matriz[][] = { {1,2,3,4}, {5,6,7,8}};
       // Puede expresarse así, pero también directamente: int [][] matriz = new int [3][4]. Es lo mismo. 
		
		for (int repetidor1 = 0; repetidor1<matriz.length; repetidor1++) { 
			
			/*Como estamos tratando conn arrays BIDIMENSIONALES necesitamos DOS REPETIDORES.
		    El primer repetidor para el primer campo, que matriz.length asocia automáticamente y repite.cuantas veces sea necesario*/
			
			for (int repetidor2 = 0; repetidor2<matriz.length; repetidor2++) {
				// El segundo repetidor para el segundo campo
				System.out.println (matriz [repetidor1][repetidor2]); // Se sustituyen ambos repetidores en la sentencia de asignación, y se van 
				// mostrando en pantalla. 
				
				/*
				 * FUNCIONAMIENTO DE matriz [repetidor1] [repetidor2]
				 * Según la longitud establecida en la linea 8, matriz.length asociará los números y la sentencia for los repetirá e irá sumando ++
				 * Así, con los dos repetidores, la matriz se mostrará siguiendo este rango: 
				 * matriz [0] [0], matriz [0] [1], matriz [0] [2] ..........
				 */
				
				
			}
		}
		
		
	}

}
