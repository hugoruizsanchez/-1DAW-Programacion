package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Definición de las variables que sustituirán a las variables locales-.
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un dígito: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un dígito: "));

		Operacion op = new Operacion ();  // Definición del objeto
		
		op.sumar(numero1, numero2); 
		op.restar(numero1, numero2);
		op.multiplicar(numero1, numero2);
		op.dividir(numero1, numero2);
		op.mostrarResultados();
		
	}

}
