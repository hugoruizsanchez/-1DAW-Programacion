
public class Ejercicio_1 {

	public static void main(String[] args) {

		int [] a = {10,20,30,40,50,60,70,80,90,100};
		int [] b = {1,-5,10,15,-20,21,2,5,3,8};
		int [][] c = {{1,2},{1,2},{1,2}};
		
System.out.println ("Impresión en pantalla del array 'A':" );
		
	
		
		for (int iterador = 0; iterador<a.length; iterador++) {
			System.out.print(a[iterador]+" ");
		}

	System.out.println ("\nImpresión en pantalla del array 'B', si el valor es mayor a 20, terminar.:" );	
		
		for (int iterador =0; iterador<b.length; iterador++) {
			
			if (b[iterador]<20) {
				System.out.print (b[iterador]+" ");
			}
			else {
				System.out.print ("-> valor superior a 20 -> Fin. ");
				break;
			}
			
		}
		
		System.out.println("\nImpresión en pantalla del array 'A' a la inversa:");
	
		
		for (int iterador = a.length-1; iterador>=0; iterador--) {
			System.out.print(+a[iterador]+" ");
		}
		
	
		
		System.out.println("\nImpresión en pantalla la suma de todos los elementos de la matriz 'C':");
		int suma = 0;
		for (int iterador1 = 0; iterador1<3; iterador1++) {
		System.out.println();
		for (int iterador2 =0; iterador2<2; iterador2++) {
		System.out.print (c[iterador1][iterador2]); 

		}

		}
		suma = c[0][0]+ c[0][1] + c[1][0]+c[1][1] + c[2][0]+c[2][1];
		System.out.println("\n\nEl resultado de la suma es "+suma+".");
	}


}
