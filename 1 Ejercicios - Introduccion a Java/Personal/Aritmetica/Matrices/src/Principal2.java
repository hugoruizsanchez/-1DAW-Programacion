
public class Principal2 {

	public static void main(String[] args) {
		
		int matriz[][] = { {1,2,3,4}, {5,6,7,8}}; // Tabla 4 x 4 con todos los valores introducidos sin el tecleo manual que vimos en el principal. 
	
		for (int repetidor1=0; repetidor1<4; repetidor1++) {
			
			for (int repetidor2=0; repetidor2<4; repetidor2++) {   // matriz.lengh -> Solo registra solo los 2 primeros numeros (?	.	
				
				System.out.println (matriz [repetidor1][repetidor2]);
				
			}
			
		}
	}

}
