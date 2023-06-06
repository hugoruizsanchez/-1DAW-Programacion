import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*
		Calcular cuántos días 􀆟ene un mes. A grandes rasgos, el programa haría lo siguiente:
			a. Si es 2, hay que decir que el número de días es 28 o 29.
			b. Si es 4, 6, 9 o 11, hay que decir que el número de días es 30.
			c. Si es 1, 3, 5, 7, 8, 10 o 12, hay que decir que el número de días es 31.
			d. Si es otro, hay que decir que se ha introducido un número de mes incorrecto
*/
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("| Introduzca el número del mes del que quiera saber cuántos días tiene:");	
		int mes = entrada.nextInt();

		switch (mes)  {
		
		case 1: System.out.println ("Enero tiene 31 días");
			break;
		case 2: System.out.println ("Febrero tiene 28 o 29 días");
		break;
		case 3: System.out.println ("Marzo tiene 31 días");
		break;
		case 4: System.out.println ("Abril tiene 30 días");
		break;
		case 5: System.out.println ("Mayo tiene 31 días");
		break;
		case 6: System.out.println ("Junio tiene 30 días");
		break;
		case 7: System.out.println ("Julio tiene 31 días");
		break;
		case 8: System.out.println ("Agosto tiene 31 días");
		break;
		case 9: System.out.println ("Septiembre tiene 30 días");
		break;
		case 10: System.out.println ("Octubre tiene 31 días");
		break;
		case 11: System.out.println ("Noviembre tiene 30 días");
		break;
		case 12: System.out.println ("Diciembre tiene 31 días");
		break;
		

			
			
		}
		
		
		
	}

}
