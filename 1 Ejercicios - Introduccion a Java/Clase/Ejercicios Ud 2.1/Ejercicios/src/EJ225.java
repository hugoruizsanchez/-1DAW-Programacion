import java.util.Scanner;

public class EJ225 {

	public static void main(String[] args) {

		/*
		 Digito de control en DNI: El algoritmo de cálculo del dígito de control es el siguiente:Se divide el
número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante
la siguiente tabla:
RESTO 0 1 2 3 4 5 6 7 8 9 10 11
LETRA T R W A G M Y F P D X B
RESTO 12 13 14 15 16 17 18 19 20 21 22
LETRA N J Z S Q V H L C K E
Por ejemplo, si el número del DNI es 12345678, dividido entre 23 da de resto 14, luego la letra
sería la Z: 12345678Z.
		 */
		
		// CREACIÓN DE LAS VARIABLES CON LAS QUE OPERARÁ EL PROGRAMA. 
		Scanner entrada = new Scanner (System.in);
		int [] DNI = new int [8]; 
		Integer DNI_int=0;
		int resto; 
		char caracter='A';
		// TÍTULO QUE DEFINA EL OBJETO DEL EJERCICIO. 
		
		System.out.println ("| Dígito de control de DNI. Introduzca los datos:");
		
		// BUCLE PARA REGISTRAR LA ENTRADA DEL USUARIO. 
		
		for (int i=0; i<DNI	; i++) {
			
			System.out.print ((i+1)+". ");
			DNI [i] = entrada.nextInt();
			
		}
		
	
		// BUCLE PARA CONFIGURAR LA SALIDA EN UNA VARIABLE INT ( se va concatenando con la fórmula inferior)
		
		for (int i=0; i<DNI.length; i++) {
			
			DNI_int=DNI_int*10+DNI[i];
			
		}
		
		// OPERACION PARA EL CÁLCULO DEL RESTO.

		resto = DNI_int%23;
		
		// CONDICIONAL SWITCH EN BASE A LOS DATOS ESPECIFICADOS. 
		
		switch (resto) {
				
		case 0: 
		    caracter = 'T';
		break;
		
		case 1: 
			caracter = 'R';
			break;
		
		case 2: 
			caracter = 'W';
			break;
			
		case 3: 
			caracter = 'A';
			break;
		
		case 4: 
			caracter = 'G';
			break;
			
		case 5: 
			caracter = 'M';
			break;
			
		case 6: 
			caracter = 'Y';
			break;
	
		case 7: 
			caracter = 'F';
			break;
			
		case 8: 
			caracter = 'P';
			break;
			
		case 9	: 
			caracter = 'D';
			break;
			
		case 10: 
			caracter = 'X';
			break;
			
		case 11: 
			caracter = 'B';
			break;
			
		case 12: 
			caracter = 'N';
			break;
			
		case 13: 
			caracter = 'J';
			break;

		case 14: 
			caracter = 'Z';
			break;
			
		case 15: 
			caracter = 'S';
			break;
			
		case 16: 
			caracter = 'Q';
			break;
			
		case 17: 
			caracter = 'V';
			break;
			
		case 18: 
			caracter = 'H';
			break;
			
		case 19: 
			caracter = 'L';
			break;
			
		case 20: 
			caracter = 'C';
			break;
			
		case 21: 
			caracter = 'K';
			break;
			
		case 22: 
			caracter = 'E';
			break;
		
			}
		
		System.out.println ("\nEl DNI con el dígito de control es: "+DNI_int+caracter);
		
		
	}

}
