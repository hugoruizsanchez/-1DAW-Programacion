package Metodos;

import javax.swing.JOptionPane;

public class Operacion { // Clase operación, que dispondrá de: 

	// Atributos
	
	int numero1; 
	int numero2; 
	int suma; 
	int resta; 
	int multiplicacion; 
	int division; 
	
	// Métodos -> La info. relativa a los métodos se encuentra en la carpeta de "Aprendizaje" 
	
	public void leerNumeros () { // Para leer los números que sean pedidos al usuario. 
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		
	}
	
	public void sumar () { // Para sumar los números
		
	 suma = numero1+numero2;
	 
	}
	
	public void restar () { // Para restar los números
		
		 resta = numero1-numero2;
		 
	}
	
	public void multiplicar () { // Para multiplicar los números
		
		 multiplicacion = numero1*numero2;
		 
	}
	
	public void dividir () { // Para dividir los números
		
		 division = numero1/numero2;
		 
	}
	
	public void mostrarResultados (){ // Para mostrar los resultados
		
		System.out.println ("La suma es: " +suma);
		System.out.println ("La resta es: "+resta);
		System.out.println ("La multiplicacion es: "+multiplicacion);
		System.out.println ("La división es: "+division);
		
	}
	
}
