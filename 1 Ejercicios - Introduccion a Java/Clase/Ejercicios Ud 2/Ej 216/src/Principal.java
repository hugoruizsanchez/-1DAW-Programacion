import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*El obje􀆟vo de esta ac􀆟vidad es generar un programa que realiza diferentes acciones a par􀆟r de
		un dato leído por el teclado.
		Es necesario que prevea que el horario de trabajo es de 9 a 14 y de 16 a 19 h. Hay que tener en
		cuenta que las 14 es la hora de comer, y por tanto es 􀆟empo libre.
		*/
		
Scanner entrada = new Scanner (System.in);
int hora; 

System.out.println ("Introduzca la hora, yo le facilitaré el horario correspondiente:");

hora = entrada.nextInt();

switch (hora) {
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8: System.out.println ("Horario libre. Puedes holgazanear.");
break;
case 9:
case 10:
case 11:
case 12:
case 13: System.out.println ("Ahora debes estar trabajando.");
break;
case 14:System.out.println ("Es la hora de comer.");
break;
case 15: System.out.println ("Ahora debes estar trabajando.");
break;
case 16:
case 17:
case 18:
case 19:System.out.println ("Ahora debes estar trabajando.");
break;
case 20:
case 21:
case 22: 
case 23:
case 24:System.out.println ("Horario libre. Puedes holgazanear.");
break;

}








	}

}
