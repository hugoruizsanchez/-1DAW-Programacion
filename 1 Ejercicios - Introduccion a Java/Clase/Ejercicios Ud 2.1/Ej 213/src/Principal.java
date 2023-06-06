import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
			int a;
			int b; // Definimos los valores con los que operaremos. 
			int resultado; 
			Scanner entrada = new Scanner (System.in);
			String operacion; 

			
			System.out.println ("| Calculadora | -> Opera dos números.");
			System.out.println ("- Escribe 'SUMAR' para sumar dos número.s");
			System.out.println ("- Escribe 'RESTAR' para restar dos números.");
			System.out.println ("- Escribe 'MULTIPLICAR' para multiplicar dos números.");
			System.out.println ("- Escribe 'DIVIDIR' para sumar dividir números.");
			
			operacion = entrada.next();
			
			if ( operacion.equals("SUMAR")) { // a la hora de comparar los números en strings, NO utilizamos "==", sino la f. string.equals (); 
				System.out.println ("Introduce el número 'A': ");
				a = entrada.nextInt();
				System.out.println ("Introduce el número 'B': ");
				b = entrada.nextInt ();
				resultado = a+b;
				System.out.println ("El resultado de la operación SUMAR es: "+resultado );
				
			}
			else {
				if (operacion.equals("RESTAR")) { 
					System.out.println ("Introduce el número 'A': ");
					a = entrada.nextInt();
					System.out.println ("Introduce el número 'B': ");
					b = entrada.nextInt ();
					resultado = a-b;
					System.out.println ("El resultado de la operación RESTAR es: "+resultado );
					
				}
				
				else {
					if (operacion.equals("MULTIPLICAR")) { 
						System.out.println ("Introduce el número 'A': ");
						a = entrada.nextInt();
						System.out.println ("Introduce el número 'B': ");
						b = entrada.nextInt ();
						resultado = a*b;
						System.out.println ("El resultado de la operación MULTIPLICAR es: "+resultado );
						
					}
					
					else {
						
						if (operacion.equals("DIVIDIR")) { 
							System.out.println ("Introduce el número 'A': ");
							a = entrada.nextInt();
							System.out.println ("Introduce el número 'B': ");
							b = entrada.nextInt ();
							resultado = a/b;
							System.out.println ("El resultado de la operación DIVIDIR es: "+resultado );
							
						}
					}
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
