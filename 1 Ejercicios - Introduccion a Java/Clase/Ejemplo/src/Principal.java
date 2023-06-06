import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int datos; // Esta variable guardará los datos [dimensiones] de la array.

		System.out.println ("El presente programa le permitirá crear un array numérico.");
		System.out.print ("Introduzca el número de datos que quiere ingresar en su array:  ");
	
		datos = entrada.nextInt();
		int [] numeros = new int [datos];
		for (int repetidor = 0; repetidor<datos; repetidor++) {
			
			System.out.print (repetidor+". Introduzca el dato numérico correspondiente: ");
		
			numeros [repetidor] = entrada.nextInt();
			
		}

		for (int repetidor = 0; repetidor<datos; repetidor++) { 
			
			System.out.println (repetidor+". El valor introducido es "+numeros [repetidor]+".");
			
		}
		
		
	}

}
