package array_desplazarn;
import java.util.Scanner;

public class Principal {

	 public static void main (String [] args) {
		 
		 Scanner entrada = new Scanner (System.in);
		 int array [] = new int [10];
		 int posiciones;
		 int ultimo = 0;
		 
		 for (int i=0; i<10; i++) {
			 
			 System.out.print(i+". "); array [i] = entrada.nextInt();
			 
			 
		 }
		 
		 System.out.print("\nIndique la cantidad de posiciones que desea desplazar el array:"); posiciones = entrada.nextInt();
		 
		 for (int i =1; i<=posiciones; i++) {
			
			 ultimo = array [9];
			 
			 for (int j =8; j>=0; j--) { // Son 10 elementos, si quitamos 1 (el ultimo, que pasa a ser el primero) pasan a ser 9, como es un array son 8.
				 array [i+1]= array [i]; 
			 }
			
			 array [0] = ultimo; 	
		 }
		 
	
		 
	 for (int i=0; i<10; i++) {
			 
			 System.out.println(i+". "+array [i]);
			 
			 
		 }
		 
		 
		 
	 }

}
