import java.util.Scanner;

public class EJ228C {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		System.out.println ("Introduzca el número binario que desea convertir a decimal:");
		
		int digito2=0;
		int decimal2=99;
		int exponente=0;
		long binario2 = entrada.nextLong();
		
		
	// Cuando divides un número entre 10, el resto arroja el último dígito de ese número.
    // Por ejemplo, 57%10 = 7;  6829%10 = 9 ....
    // Partiendo de este principio, podemos crear el programa:
	
while (decimal2 !=0&& decimal2 !=1) {
	
	digito2 = (int) (binario2%10);
	System.out.println ("digito2="+digito2);
	decimal2 = (int) (decimal2 + (digito2* Math.pow(2, exponente )));	
	exponente++;

}

	System.out.print(decimal2);

		
		
	}

}
