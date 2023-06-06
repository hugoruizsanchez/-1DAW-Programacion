import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

float decimal1, decimal2, suma, resta, multiplicacion, division, resto; // De esta forma podemos definir variables sin expandirnos verticalmente.

System.out.print ("Escribe dos números decimales: "); 

decimal1 = entrada.nextFloat(); 
 
decimal2 = entrada.nextFloat();  

 	suma = decimal1 + decimal2;
 	resta = decimal1 - decimal2;
 	multiplicacion = decimal1*decimal2;
 	division = decimal1/decimal2; 
 	resto = decimal1%decimal2; // Divide al decimal1 / decimal2 y nos da su resto únicamente. 
 	
 	System.out.println ("La suma es: "+suma); 
 	System.out.println ("La resta es: "+resta); 
 	System.out.println ("La multiplicación es: "+multiplicacion); 
 	System.out.println ("La división es: "+division); 
 	System.out.println ("El resto de la división es: "+resto); 
 	


// COMBINADOS CON ASIGNACIÓN
 	int entero = 6;
entero += 7; // Es una forma de simplificar las operaciones sobre variables, es equivalente a: entero = entero +7
entero -= 7; 
entero *= 7;
entero /= 7;
entero %= 7; 

// Incrementos en 1

int entero2 = 2; 

	entero2++; // Equivalente a : entero2 = entero2 +1 ó entero+=1; 
	entero2--;
	
	
 
 
		

	}

}
