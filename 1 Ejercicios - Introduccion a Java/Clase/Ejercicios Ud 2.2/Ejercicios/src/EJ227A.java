		/*
Realiza un programa que genere un pronóstico de resultados de forma automática. El resultado
se mostrará por pantalla:
Partido Resultado
   1 [1,X,2]
   ...
   15 [1,X,2]
  Utiliza la función que diseñaste en el ejercicio 221 ---------> EJ221.rangoAleatorioEnCaracter()
		 */

public class EJ227A {

	public static void main(String[] args) {

		char [][] partidos = new char [15][3]; // ¡Ojo! Aunque los resultados sean números, están expresados en forma de char desde la función EJ221.rangoAleatorioEnCaracter()

		System.out.println ("| Programa que realiza un pronóstico de resultados de forma automática. ");

		for (int i=0; i<15; i++) {                    
			for (int j=0; j<3; j++) {	

				partidos [i][j] = EJ221.rangoAleatorioEnCaracter(); 

			}
		}
			
		System.out.print(" PARTIDO <> RESULTADO ");	
		
		for (int i=0; i<15; i++) {
			System.out.println("");
			System.out.print((i+1)+"  <----->  ");
			for (int j=0; j<3; j++) {
				
System.out.print ("["+(partidos [i] [j])+"]");

			}
		}

			
		}
		
	
}
	

