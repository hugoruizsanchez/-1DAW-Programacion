
public class E220 {

	public static void main(String[] args) {

		int [] valor = {2,7,9,12,3,6}; // Array de prueba. 
		
// CÁLCULO DEL VALOR MAYOR ALMACENADO EN UN ARRAY .
		
	int valor_mayor; // Declaramos la variable mayor.
	int valor_superior=-2147483648; // Declaramos la variable superior, en el mínimo que permite "INT" para que no resulte en error.

	
	for (int i=0;i<valor.length; i++) { // Bucle en el que el iterador empieza en 0 y recorre todos los arrays.
	for (int j =1; j<valor.length; j++) // Bucle en el que el iterador empieza en 1 y recorre los arrays uno por delante de "i"
		if (valor [i]>valor[j]) { // Si el valor "i" es MAYOR al valor "j" , entonces ...
			
			valor_mayor = valor [i];  // El valor mayor de ambos dos es valor [i]
			
			if (valor_superior<valor_mayor) { // Si el valor superior es MENOR que el valor_mayor...
				valor_superior=valor_mayor; // El valor mayor  se almacena en el valor superior
			} // El condicional no tiene else, por lo que si se da el caso contrario no pasa nada.
		}
		else if (valor[i]<valor[j]) { // Por el contrario, si el valor "j" es MAYOR al valor "j" entonces...
			
			valor_mayor = valor [j]; // El valor mayor de ambos es valor, se guarda en el valor_mayor[j]
			if (valor_superior<valor_mayor) { // Si el valor superior es MENOR que el valor mayor...
				valor_superior=valor_mayor;// El valor mayor se guarda en el valor superior.  
			}
		}
		
		
	}
	
	System.out.println (valor_superior);  // Prueba para comprobar que efectivamente el cálculo es así. 
	
	// CÁLCULO DEL VALOR MENOR ALMACENADO EN UN ARRAY. (Sigue la lógica inversa al anterior ejercicio)
	
	int valor_menor;  
	int valor_inferior = 2147483647; 
	
	for (int i=0; i<valor.length; i++) {
		for (int j =1; j<valor.length; j++) {
			
		if (valor[i]<valor[j]) {
			
		valor_menor = valor[i];
		
		if (valor_menor<valor_inferior) {
			
			valor_inferior = valor_menor;
			
		}
		
		else if (valor[j]<valor[i]) {
			valor_menor = valor [j];
			if (valor_menor<valor_inferior) {
				valor_inferior= valor_menor;
			}
		}
			
		}
			
		}
	}
		
	
	System.out.println (valor_inferior);

	// CÁLCULO DE LA MEDIA DE TODOS LOS NÚMEROS DEL ARRAY.
	
	int media; // Variable media en el que se almacenará el valor de la media.
	int valor_suma =0; // Inicializamos el valor de la suma en cero.
	
	for (int i =0; i<valor.length; i++) { // Bucle que se repetirá tantas veces como la duración de la array.
		
		valor_suma = valor [i] + valor_suma; // El valor de la suma es igual al valor que esté leyendo el array + el valor de la suma.
		
	}
	
 media = valor_suma/valor.length; // Cálculo de la media: la suma de todos los elementos entre la cantidad de elementos. 
System.out.println (media); // Proyección del cálculo en pantalla. 
	}

}
