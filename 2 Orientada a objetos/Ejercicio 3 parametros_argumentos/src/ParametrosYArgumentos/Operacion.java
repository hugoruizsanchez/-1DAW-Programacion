package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class Operacion {
	    // Atributos 
		int suma; 
		int resta; 
		int multiplicacion;  // Las variables que se encuentran fuera de un método son GLOBALES, las que están dentro son LOCALES. 	
		int division; 
		
		// Métodos
		
		public void sumar (int a, int b) { // Para sumar los números; se parametrizan las variables locales entre paréntesis.
			
			suma = a+b; // Las variables locales se operan
		 
		}
		
		public void restar (int a, int b) { // Para restar los números
			
			resta = a-b;
			 
		}
		
		public void multiplicar (int a, int b) { // Para multiplicar los números
			
			multiplicacion = a*b;
			 
		}
		
		public void dividir (int a, int b) { // Para dividir los números
			
			division = a/b;
			 
		}
		
		public void mostrarResultados (){ // Para mostrar los resultados
			
			System.out.println ("La suma es: " +suma);
			System.out.println ("La resta es: "+resta);
			System.out.println ("La multiplicacion es: "+multiplicacion);
			System.out.println ("La división es: "+division);
			
		}
}
