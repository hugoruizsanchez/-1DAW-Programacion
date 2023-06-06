		/*
Realiza un programa que genere un pronóstico de resultados de forma automática. El resultado
se mostrará por pantalla:
Partido Resultado
   1 [1,X,2]
   ...
   15 [1,X,2]
  Utiliza la función que diseñaste en el ejercicio 221 ---------> EJ221.rangoAleatorioEnCaracter()
		 */

public class EJ226 {

	public static void main(String[] args) {

			char [] elementos = new char [15];
			
			arrayQuiniela (elementos);
	
		}
		
	public static void arrayQuiniela (char[] valor) {
	
		char [] caracter = new char [15]; 
		
		for (int i=0; i<15; i++) {
			
			caracter [i] = EJ221.rangoAleatorioEnCaracter();
			
		}
		
	for (int i=0; i<15; i++) {
			
			System.out.println(caracter [i]);
		}
		
			
		 
		
	}
	
	
}
