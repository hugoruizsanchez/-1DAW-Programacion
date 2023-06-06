import java.util.Scanner;

public class Principal {
// 3:29:33
	public static void main(String[] args) {

		int posicion1=0;
		int posicion2 = 0; 
		int posicion3 = 0; 	
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("| Organizador de tres números del mayor al menor. |");
		System.out.println ("Introduzca el número ´A´: ");
		int a = entrada.nextInt();
		System.out.println ("Introduzca el número ´B´: ");
		int b = entrada.nextInt();
		System.out.println ("Introduzca el número ´C´: ");
		int c = entrada.nextInt();
		
		if (a>b && a>c) {
			
	posicion1 = a;
		}
		else {
			
			if (b>a && b>c)
				
				posicion1 = b;
			else {
				
				if (c>a && c>b)
			posicion1 = c;
			}
			
		}
	
		
		if (a>b && a>c) {
			
			posicion2 =a;
		}
		else {
			
			if (b>a && b>c)
				
				posicion2 = b;
			else {
				
				if (c>a && c>b)
				posicion2 =c;
			}
			
		}
	
		if (a>b && a>c) {
			
			posicion3 =a;
		}
		else {
			
			if (b>a && b>c)
				
				posicion3 =b;
			else {
				
				if (c>a && c>b)
				posicion3 =c;
			}
			
		}
	
		System.out.println (posicion1+">"+posicion2+">"+posicion3);
		
		
	}}
