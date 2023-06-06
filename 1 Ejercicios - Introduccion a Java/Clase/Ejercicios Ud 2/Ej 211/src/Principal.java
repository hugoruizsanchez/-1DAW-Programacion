import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		/* 
		 * Se quiere realizar un programa que transforme notas numéricas en una escala de texto. Se
introducirá una nota entre 0 y 10 y el programa mostrará la escala de calificación
correspondiente:
NOTA NUMÉRICA CALIFICACIÓN TEXTO
>=9 y <=10 Sobresaliente
>=6.5 y < 9 Notable
>=5 y < 6.5 Suficiente
<5 Insuficiente

		 */
	
		Scanner entrada = new Scanner (System.in);
	System.out.println ("| Transformador de notas | \n Introduzca la nota que desea convertir: ");
		float calificacion = entrada.nextFloat ();

		
		if (calificacion>=9 && calificacion<=10) {
			
			System.out.println ("Sobresaliente.");
		}
	if (calificacion>=6.5 && calificacion<=9) {
			
			System.out.println ("Notable.");
		}
	if (calificacion>=5 && calificacion<=6.5) {
		
		System.out.println ("Suficiente.");
	}
	if (calificacion<5) {
		
		System.out.println ("Insuficiente.");
	}	
			

}
}
