import java.util.Scanner; // Scanner de java, permite la entrada-salida de datos inferior, definición en lína 21. 
import static java.lang.Math.sqrt; // Nótese que el uso de la raíz (sqrt) debe estar respaldado por un "import static"
// Esto es debido a que en este programa uso expresiones abreviadas, porque en el código "original" tendríamos que escribir Math.sqrt
public class principal {

	public static void main(String[] args) {


		System.out.println ("| | Resolucionador de Ecuaciones de Segundo Grado ||\n");
		
// Título de la herramienta y descripción de su utilidad. 
		System.out.println ("Una ecuación de segundo grado sigue la siguiente estructura: ax^2 + bx + c = 0.\n");
		
		// La resolución de la ecuación de segundo grado se plantea con la siguiente fórmula: ( -b +-raiz (b^2-4ac) ) / 2
		
		
float a; 
float b; 
float c;      // Enunciar las variables, no se les otorgará un valor, pues este lo determinará el usuario. 
double x1;
double x2;     // Variables del resultado, que calculará la máquina con las variables determinadas por el usuario. Usamos una double, porque
// por razones que ignoro Eclipse nos ha exigido esa condición para ejecutar el programa. 
                
Scanner entrada = new Scanner (System.in); 
System.out.println ("Introduzca el valor de 'a', si precisara del decimal, use una ','.");
a = entrada.nextFloat(); // Preguntamos al usuario por la susodicha variable. 

System.out.println ("Introduzca el valor de 'b', si precisara del decimal, use una ','.");
b = entrada.nextFloat(); // Preguntamos al usuario por la susodicha variable. 

System.out.println ("Introduzca el valor de 'c', si precisara del decimal, use una ','.");
c = entrada.nextFloat(); // Preguntamos al usuario por la susodicha variable. 

x1 = (-b+sqrt(b*b-4*a*c))/(2*a); // La ecuación de segundo grado utiliza una raíz cuadrada, que consta de dos soluciones: una positiva y otra negativa.
x2 = (-b-sqrt(b*b-4*a*c))/(2*a); 

System.out.println ("\nEl resultado es el siguiente:");
System.out.println ("Solución 1: "+x1);
System.out.println ("Solución 2: "+x2);

	}

}
