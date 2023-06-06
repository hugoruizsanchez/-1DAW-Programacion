package calculadora_medias;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	
int numero, sumap = 0, suman = 0, positivos = 0, negativos = 0, ceros = 0;
float medianegativos, mediapositivos;

System.out.println ("Introduce 10 valores, negativos o positivos, yo calcularé su media: ");

for (int repetidor=1; repetidor<=10; repetidor++) { // repetidor es uno; mientras repetidor sea menor que 10; sumar 1. Esto repetirá 10 veces la acción inferior.
	
	  numero = entrada.nextInt();
	  
	  if (numero==0){
		  ceros++;
	  }
	  else if (numero>0) {
		  sumap = sumap + numero;
		  positivos++;
	  }
	  else if (numero<0) {
		  suman = suman + numero;
		  negativos++;
	  }

}

if (positivos == 0) {
	System.out.println ("No se puede calcular la media de los positivos.");
	
}
else {
	mediapositivos = sumap/positivos;
	System.out.println ("La media de números positivos es de "+mediapositivos+ ".");
}

if (negativos == 0) {
	System.out.println ("No se puede calcular la media de los negativos.");
}
else {
	medianegativos = suman/negativos;
	System.out.println ("La media de números positivos es de "+medianegativos+ ".");
}

if (ceros==0) {
	System.out.println ("No has introducido ningún cero.");
}
else {
	System.out.println ("El número de ceros introducido es de "+ceros+ ".");
}

}

}
