import javax.swing.JOptionPane; // Si sale que no puede resolverse JOptionPane, se debe importar este paquete. En Eclipse se hace haciendo
                               // doble click sobre el error.

public class Principal {

	public static void main(String[] args) {

		
	// El JOptionPane es la funcionalidad que permite la creación de ventanas emergentes con texto, es una interfaz gráfica a la entrada
		// y salida que puede proporcionarnos el scanner. 
	
		String palabras;
		char letra; 
		int entero; 
		double decimal; 
		
		palabras = JOptionPane.showInputDialog("Escribe una frase y te la registraré: ");
entero = Integer.parseInt(JOptionPane.showInputDialog("Introduce una variable entera y te la registraré: "));

// ¡Atención! JOptionPane hace una conversión a STRING, y esto es incompatible con la variable INT, así que debe usarse un dato no primitivo
// y esto se logra escribiendo Integer.parseInt(JoptionPane.showInputDialog (texto)); 

 letra = JOptionPane.showInputDialog("Introduce una letra y te la registraré: ").charAt(0);

//¡Atención! JOptionPane hace una conversión a STRING, y esto es incompatible con la variable CHAR, así que debe usarse un dato no primitivo
//y esto se logra escribiendo char.At(0); al final. 


 decimal = Double.parseDouble(JOptionPane.showInputDialog ("Introduce una variable decimal y te la registraré: ")); 
 
//¡Atención! JOptionPane hace una conversión a STRING, y esto es incompatible con la variable CHAR, así que debe usarse un dato no primitivo
//y esto se logra escribiendo Double.parseDouble(JoptionPane.showInputDialog (texto)); 
 // si quieres convertir un float, escribes Float.parseFloat(JoptionPane.showInputDialog (texto)); 
 
JOptionPane.showMessageDialog(null, "La frase introducida es: " +palabras); 
JOptionPane.showMessageDialog(null, "La letra introducida es: " +letra); 
JOptionPane.showMessageDialog(null, "La variable entera es: " +entero); 
JOptionPane.showMessageDialog(null, "La variable decimal es: " +decimal); // Esto nos permite introducir mensajes en el recuadro emergente,
// es un equivalente gráfico al System.out.println;


	}	

}
