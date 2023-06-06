import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	// Es un condicional que no se identifica con una función concreta, sino que se escribe con "?" y ":"
		int entero; 
		
		entero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));
		String mensaje; 
		
		mensaje = (entero%2==0) ? "Par." : "Es impar."; // Sacamos el resto de la división entre dos de un número entero,
		                                               // si este es cero, el numero es par, si no, es impar. Todo se guarda en la cadena mensaje. 
		
		
JOptionPane.showMessageDialog(null, mensaje);
		
		/* Podemos evitar la creación de un string mensaje si escribimos lo siguiente: 
		
		JOptionPane.showMessageDialog(null, (entero%2==0) ? "Par." : "Es impar.");
	 
	   */

	}

}
