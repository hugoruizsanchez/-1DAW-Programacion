import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
System.out.println ("| Conversor de horas a: semanas, días y horas. | ");

int horasIniciales, dias, horasFinales, semanas; 

Scanner entrada = new Scanner (System.in);

System.out.println ("\nIntroduzca el valor de las horas que quiere convertir: "); horasIniciales = entrada.nextInt ();

semanas = horasIniciales / 168;
dias = horasIniciales%168 / 7;
horasFinales = horasIniciales%24;

System.out.println ("\nLa conversión es de "+semanas+" semanas " +dias+ " días y "+horasFinales+ " horas.");

	}

}
