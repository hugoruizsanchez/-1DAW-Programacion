import java.util.Scanner; // Para utilizar el scanner debemos acudir a este import. 
public class Principal {

	public static void main(String[] args) {
		
		// Debemos implementar las siguientes fórmulas, para el: 
		// * Área: 3,14*radio^2 . 
		// * Longitud: 2*3,14*radio .
		
	
		Scanner entrada = new Scanner (System.in); 
		double pi = 3.14159;
		double r;   // Definimos las variables, a fin de simplificar las expresiones matemáticas, defino pi. 
		double area;
		double longitud; 

		System.out.println ("|| Calculador de área y longitud de una circunferencia || " // Preguntamos al usuario. 
				+ ""
				+ "\nIntroduzca el radio de la circunferencia: ");

		r = entrada.nextDouble(); //Apelamos al scanner para que la variable sea introducida
		
		area = pi*(r*r);
		longitud = 2*pi*r; // Realizamos las operaciones convenidas. 
	
		
		System.out.println ("Área de la circunferencia: "+area + " unidades.");
		System.out.println ("Longitud de la circunferencia: "+longitud+ " 4unidades."); // Expresamos el resultado. 
	}

}
