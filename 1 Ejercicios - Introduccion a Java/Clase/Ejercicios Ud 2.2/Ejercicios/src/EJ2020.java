
public class EJ2020 {

	public static void main(String[] args) {
	
		int [] valor = {2,7,9,12,3,6};
		System.out.println (valorMayorArray (valor));
		System.out.println (valorMenorArray (valor));
		System.out.println (mediaArray (valor));
		
	}
	
	public static int valorMayorArray (int [] valor) {
		
		int numero_mayor = -2147483648; // El número más pequeño que una variable INT puede registrar.
		
		for (int i=0; i<valor.length; i++) { // Bucle que se repite hasta que no quedan valores.
			
		if (numero_mayor<valor[i]) {
			                               // Si el número_mayor<valor[i], entonces el numeoro mayor se convierte en valor[i], de lo contrario no ocurrirá nada y pasará al siguiente valor
		numero_mayor = valor[i];
			
		}
			
			
		}
		
		return numero_mayor;
		
	}
	
	public static int valorMenorArray (int [] valor) {
		
		int numero_menor= 2147483647; // El número más grande que una variable INT puede registrar.
		
		for (int i=0; i<valor.length; i++) {// Bucle que se repite hasta que no quedan valores.
			
			
		if (numero_menor>valor[i]) {
			                             // Si el número_menor>valor[i], entonces el numero menor se convierte en valor[i], de lo contrario no ocurrirá nada y pasará al siguiente valor
		numero_menor = valor[i];
			
		}
			
			
		}
		
		return numero_menor;
		
	}
	
public static int mediaArray (int [] valor) {
		
		int valor_suma=0; // Inicializamos la variable valor_suma.
		
		for (int i =0; i<valor.length; i++) { 
			valor_suma = valor [i] + valor_suma; // La suma va concatenándose según los valores registrados. 
			
		}
		
		return valor_suma/valor.length; // Para calcular la media (suma de todos los números entre su total) se devuelven la operacion indicada.
		
	}
		
}
		