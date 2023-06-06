	import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		float hora, salario_hora, impuesto, resultado_semana, resultado_mes, resultado_mes_impuestos;
		
		System.out.println ("| Calculadora de salario, a partir de horas de trabajo a la semana | "); 
		
		System.out.println ("\n Introduzca cuántas horas trabaja a la semana."); 
		
		hora = entrada.nextInt();
		
System.out.println ("\n Introduzca cuánto dinero percibe por hora."); 
		
		salario_hora = entrada.nextInt();
		
		
		resultado_semana = (float) ((hora*salario_hora)); // Antes no podía convertir de double a float, basta con usar la interfaz de eclipse y poner (float)
		resultado_mes_impuestos = (float) ((resultado_semana*4)*0.8);
		resultado_mes = resultado_semana*4;
		
		System.out.println ("Los resultados obtenidos arrojan la siguiente nómina: ");
			System.out.println ("\nSalario semanal sin impuestos: "+resultado_semana+".\nSalario mensual sin impuestos: "+resultado_mes+".\nSalario mensual con impuestos: "+resultado_mes_impuestos);
			System.out.println ("\n Se aplica un impuesto del 20%. ");
		
		
	}

}
