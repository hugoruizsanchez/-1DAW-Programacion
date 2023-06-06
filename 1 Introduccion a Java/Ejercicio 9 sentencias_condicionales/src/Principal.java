import javax.swing.JOptionPane;

/* INTRODUCCIÓN A LOS CONDICIONALES, ESTRUCTURA BÁSICA: 

 if (condicion) {  
 
 Instruccion1; 
 
 }
 else {
 
 Instruccion2
 
 }

	 */
		
public class Principal {

	public static void main(String[] args) {

		int entero, dato =5; 
		entero = Integer.parseInt(JOptionPane.showInputDialog("Introduce una variable entera y te la registraré: ")); 
		// Utilizamos la función JOptionPane (con el integer, para 
		
	if (entero ==5) { // Si el número entero que hemos introducido es igual a 5... 
		
		// Puede utilizarse != (desigual) > mayor < menor... <= menor o igual >= mayor o igual 
		
	JOptionPane.showMessageDialog(null, "El número que has introducido es el cinco."); 
	// Para introducir diálogos con el JOPTIONPANE

	}
	else { // Else se traduce "SI NO". SI NO, entonces, no es el 5. 
		JOptionPane.showMessageDialog(null, "El número que has introducido NO es el cinco.");
		
	}
	
	
	
	
	
	}

}
