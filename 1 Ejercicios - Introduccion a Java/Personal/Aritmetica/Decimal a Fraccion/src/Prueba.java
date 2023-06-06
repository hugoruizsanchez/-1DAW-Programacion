import java.math.BigDecimal;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.println ("****************************************************\n"
						   + "CONVERSOR DE NÚMERO DECIMAL A FRACCIÓN IRREDUCIBLE\n"
				           + "INSTRUCCIONES: UTILICE EL FORMATO DE PUNTO DECIMAL\n"
				           + "****************************************************\n");
		
		System.out.print ("Introduzca número decimal: "); 
		
	
		
//		Dato NO PRIMITIVO de decimal, lo que permitirá manipular la variable con más facilidad
		
		double numeroDecimal = entrada.nextDouble();
		
//		DECLARAR LA FRACCIÓN 
		
		double numerador = 0;
		double denominador = 0;
		
//		BUCLE QUE SERVIRÁ PARA CREAR EL NÚMERO ENTERO. 
		
		int contador = 0;
		numerador = numeroDecimal;
		boolean terminado = false;

		while (terminado == false) {
		contador++;
		
		numerador = numerador*10;
			
			if (numerador%1==0) {
				terminado = true;
			}

		}
		
		
//		
		
		System.out.println ("Vueltas del contador: "+(contador));
		System.out.println (numerador);
		
		
		
	}

}
