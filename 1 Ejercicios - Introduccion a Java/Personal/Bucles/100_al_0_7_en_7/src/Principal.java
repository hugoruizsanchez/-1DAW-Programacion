
public class Principal {

	public static void main(String[] args) {

		
		// Escribir todos los números del 100 al 0 de 7 en 7.
		
		/* ES UNA FORMA DE HACERLO, PERO PUEDE EMPLEARSE LA FUNCIÓN FOR
		
		
		int contador = 100;
		
		while (contador>0) {
			
			contador = contador-7; 
			System.out.println (contador);
		}
			
		
		
		*/
		
		for (int entero =100; entero>=0; entero= entero-7) { 
			System.out.println (entero);
		}

	}

}
