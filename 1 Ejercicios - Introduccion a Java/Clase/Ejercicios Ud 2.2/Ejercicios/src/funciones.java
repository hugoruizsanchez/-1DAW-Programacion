
public class funciones {
	public static void main(String[] args) {
		
		System.out.println (esPrimo (3));
		System.out.println  (esPrimo (24));
		System.out.println (esPrimo (5));
		System.out.println (esPrimo (2044));

		int decimal = 28;
		
		while (funciones.esPrimo (decimal) != true) {
			
			System.out.println (decimal);
			
			decimal = decimal/2;
			
		}
		
		System.out.println(decimal);
		
		
		
		
		
		
		
	}
	
	public static boolean esPrimo (int valor) { // PARA CALCULAR SI UN NÚMERO ES PRIMO: iniciamos una función que devuelva una variable booleana. 
		boolean estado =false; // El estado empieza en falso. 
		for (int i=2; i<valor; i++) { // A partir del dos, irá dividiendo los números ( del dos a n ) para verificar si es divisible entre cada uno de ellos
			
			if (valor%i==0) {
				return estado =false; // SI ES DIVISIBLE, NO ES PRIMO
			}else if (valor%i !=0) {
				return estado = true; // SI NO LO ES, ES PRIMO.
			}
			
		}
		return estado;
		
	}
	
}
