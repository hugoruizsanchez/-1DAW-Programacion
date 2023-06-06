import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {

		
		// Las sentencias swich sirven para enumerar  casuística con sus respectivas respuestas.
		
			/*

switch (dato) { 

case 1: Instrucciones1;
break; 
case 2: Instrucciones1;
break; 
		
			 */

		
		
	int entero; 
	
	entero = Integer.parseInt (JOptionPane.showInputDialog ("Escribe un número entre 1 y 5."));
	
	switch (entero) { // Vamos a valorar la variable "ntero"
	
	case 1: JOptionPane.showMessageDialog(null, "Has seleccionado el número 1.");
	break;
	
	case 2: JOptionPane.showMessageDialog(null, "Has seleccionado el número 2.");
	break;
	
	case 3: JOptionPane.showMessageDialog(null, "Has seleccionado el número 3.");
	break;
	
	case 4: JOptionPane.showMessageDialog(null, "Has seleccionado el número 4.");
	break;
	
	case 5: JOptionPane.showMessageDialog(null, "Has seleccionado el número 5.");
	break;
	
	default: JOptionPane.showMessageDialog(null, "El número que has escrito no se corresponde con las directrices del programa.");
	// El default es el equivalente al "else" (si no) en los condicionales switch
	}
	
	
	
	
	

	
	}

}
