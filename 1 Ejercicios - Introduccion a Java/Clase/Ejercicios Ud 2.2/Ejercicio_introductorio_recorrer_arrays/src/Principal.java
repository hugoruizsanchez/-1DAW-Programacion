import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int matriz [][] = new int [3][3];
	int determinante; 
	
	for (int iterador1= 0; iterador1<3; iterador1++) {
		for (int iterador2 =0; iterador2<3; iterador2++) {
			
			System.out.print("Introduzca el elemento ["+(iterador1+1)+"]"+"["+(iterador2+1)+"]: "); matriz [iterador1] [iterador2] = entrada.nextInt();
	}	
	}
	System.out.println ("\nLa matriz introducida es: ");
	for (int iterador1= 0; iterador1<3; iterador1++) {
		System.out.println();
		for (int iterador2 =0; iterador2<3; iterador2++) {
			
			System.out.print (matriz[iterador1][iterador2]+"   ");
	}	
	}
	

	determinante = (matriz[0][0]*matriz[1][1]*matriz[2][2])+
			       (matriz[1][0]*matriz[2][1]*matriz[0][2])+
			       (matriz[0][1]*matriz[1][2]*matriz[2][0])-
			       (matriz[0][2]*matriz[1][1]*matriz[2][0])-
			       (matriz[0][1]*matriz[1][0]*matriz[2][2])-
			       (matriz[1][2]*matriz[2][1]*matriz[0][0]);
System.out.println ("\n\nEl resultado del determinante: "+determinante+".");
}
}
