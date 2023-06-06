import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int numero, resultado ;
		Scanner entrada = new Scanner(System.in);
		
		numero = entrada.nextInt();
		
		for (int repetidor =1; repetidor<=10; repetidor++) {  
		
		/* For nos ayuda a repetir, hasta que repetidor (1) no llegue a 10, irá sumando uno. Esta
		 * propiedad inherente a la sentencia nos ayudará a realizar el ejercicio de mostrar las tablas de multiplicar.
		*/
			
			resultado = numero*repetidor;
			System.out.println (numero+" * "+repetidor+" = "+resultado);
			
			
			
			
		}

	}

}
