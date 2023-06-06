package Retorno;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un dígito: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un dígito: "));

		Operacion op = new Operacion ();  // Definición del objeto
		
		int suma= op.sumar(numero1, numero2);  // Se recogen los valores del return, que son almacenados en cada una de las variables 
		int resta= op.restar(numero1, numero2);
		int mult = op.multiplicar(numero1, numero2);
		int div= op.dividir(numero1, numero2);
		
		op.mostrarResultados(suma, resta,mult,div); // Las variables se extrapolan a las variables locales del método mostrarResultados, conectando así con las operaciones
		
		System.out.println("\nTambién pueden imprimirse los valores directamente, sin apelar a un método específico: \n");
		
		System.out.println ("La suma es: "+op.sumar(numero1, numero2));
		System.out.println ("La resta es: "+op.restar(numero1, numero2));
		System.out.println ("La multiplicacion es: "+op.multiplicar(numero1, numero2));
		System.out.println ("La division es: "+op.dividir(numero1, numero2));
		

	}

}
