package calculadora_medias;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	// La máquina nos pedirá 10 números, debemos hacer la media de los negativos, la media de los positivos, y la cantidad de ceros introducida. 
		
	// Enunciar las variables. 
		Scanner entrada = new Scanner (System.in);
		int n_negativos= 0;
		int n_positivos = 0; 
		int numero;
		int positivo;
		int negativo;
		int sumap = 0;
		int suman = 0;
		int ceros = 0;
	double mediapositivos;
	double medianegativos; 
		while ((n_negativos+n_positivos) != 10) {
			
			numero = entrada.nextInt();
			
			if (numero>0) {
				positivo = numero;
				sumap = sumap + positivo;
				n_positivos++;
				
			}
			else {
				
				if (numero<0) {
					negativo = numero;
					suman = suman + negativo;
					n_negativos++;
					
				}
				else {
					if (numero==0) {
						ceros++;
					}
				}
			}
		}
			
		
		mediapositivos = sumap/n_positivos;
		medianegativos = suman/n_negativos;
		
		System.out.println ("La media de números positivos es de "+mediapositivos+ ".");
		System.out.println ("La media de números negativos es de "+medianegativos+ ".");
		System.out.println ("El número de ceros es de "+ceros+ ".");
			
			
	}

}
