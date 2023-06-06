
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Principal {
	public static void main(String[] args) {

		
	System.out.println ("|| Resolucionador de Área y Perímetro de un triángulo a partir de 3 lados || \n");
	// Para calcular el perímetro de un triángulo debemos sumar todos sus lados, esto es, a+b+c=perimetro
	// Para calcular el área de un triángulo a partir de los tres lados, partiremos de la fórmula inventada por Herón de Alejandría, 
	// , que implica el cálculo previo del semiperímetro (perímetro / 2 = s) y es raiz (s*(s-a)*(s-b)*(s-c))
	Scanner entrada = new Scanner (System.in); // Para introducir las variables. 
	
	float a;
	float b; 
	float c; 
	float perimetro; 
	double area; // Definimos las variables. 

	System.out.println ("\nIntroduzca el lado 'a': ");

	a = entrada.nextFloat(); 
	System.out.println ("Introduzca el lado 'b': ");
	b = entrada.nextFloat(); 

	
	System.out.println ("\nIntroduzca el lado 'c': ");
	c = entrada.nextFloat(); 
	
	perimetro = a+b+c;
	
	float s =perimetro/2;
	
	area = sqrt (s*(s-a)*(s-b)*(s-c));
	
	System.out.println ("El perímetro del triángulo propuesto es: "+perimetro+".\n");
	System.out.println ("El semiperímetro del triángulo propuesto es: "+s+".\n");
	System.out.println ("El área del triángulo propuesto es: "+area+".\n");
	
	}

	
	
	
	
	
}
