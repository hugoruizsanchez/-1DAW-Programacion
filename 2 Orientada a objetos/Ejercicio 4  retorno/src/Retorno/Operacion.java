package Retorno;

public class Operacion {
	
	// Métodos (una clase puede tener solo métodos) 
	
	public int sumar (int a, int b) { // es una public int, por lo que retornará un valor entero. 
		
		int suma = a+b; // Se crea la variable local "suma" que guardará el resultado de a+b 
		return suma; // Se retorna el resultado
	 
	}
	
	public int restar (int a, int b) { // Para restar los números
		
		int resta = a-b;
		return resta;
		 
	}
	
	public int multiplicar (int a, int b) { // Para multiplicar los números
		
		int multiplicacion = a*b;
		return multiplicacion;
		 
	}
	
	public int dividir (int a, int b) { // Para dividir los números
		
		int division = a/b;
		return division; 
		 
	}
	
	public void mostrarResultados (int suma, int resta, int multiplicacion, int division){ // Parametrizamos el método con los valores locales. 
		
		System.out.println ("La suma es: " +suma);
		System.out.println ("La resta es: "+resta);
		System.out.println ("La multiplicacion es: "+multiplicacion);
		System.out.println ("La división es: "+division);
		
	}
	
}
