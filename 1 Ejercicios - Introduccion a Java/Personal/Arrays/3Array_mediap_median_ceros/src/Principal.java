import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("| Calcular la media de 5 números, para los positivos y negativos |");
		
		// Media de 5 números; tanto positiva como negativa, y contar ceros. 
		
		float nPositivos=0, nNegativos=0, nCeros=0, sumPositivos =0, sumNegativos =0, rMediaPos, rMediaNeg; // Enunciar las variables requeridas. 
		
		Scanner entrada = new Scanner (System.in); // Sentencia scanner para introducir información en la entrada.
		
		float [] numeros = new float [5];  // Array de 5 elementos. 
		
for (int iterador =0; iterador<5; iterador++) { // Repetidor de 5 ciclos, los necesarios para una array de 5 elementos. 
	
	System.out.print((iterador+1)+". Introduzca un valor: ");
	
	numeros [iterador] = entrada.nextInt (); // Pedimos al usuario el valor de numeros [valor - expresado en "iterador"]
	
	if (numeros[iterador]>0) { // Si es mayor que cero, es positivo.
		sumPositivos = sumPositivos + numeros[iterador];  // Luego se añade el cómputo a la suma.
		nPositivos++; // Y se suma 1 al contador necesario para calcular la media.
	}
	else if (numeros[iterador]<0) {
	sumNegativos= sumNegativos + numeros[iterador];  // idem
	nNegativos++;
	}
	else if (numeros [iterador] ==0) {
		nCeros++;  // Contador de ceros
		
	}
	
}

System.out.println(); 

if (sumPositivos==0) {
	System.out.println ("Dado que no has introducido ningún número positivo, no podemos calcular la media solicitada.");
}
else {
 rMediaPos = sumPositivos/nPositivos;
 System.out.println ("El resultado de la media de los números positivos es: "+rMediaPos);
}

if (sumNegativos==0) {
	System.out.println ("Dado que no has introducido ningún número negativo, no podemos calcular la media solicitada.");
}
else {
	rMediaNeg = sumNegativos/nNegativos;
	System.out.println ("El resultado de la media de los números negativos es: "+rMediaNeg);
}

if (nCeros ==0) {
	System.out.println ("No has introducido ningún cero.");
}
else {
	System.out.println ("El número de ceros introducidos es: "+nCeros);
}






		
	}

}
