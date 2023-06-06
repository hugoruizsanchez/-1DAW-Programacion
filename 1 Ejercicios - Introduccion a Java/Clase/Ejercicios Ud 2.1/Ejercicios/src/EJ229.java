import java.util.Scanner;

public class EJ229 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		boolean estado = false; 
		int eleccion; 
		int [] vector = new int [24];

		
		System.out.print ("| Estación meteorológica |\n\n1. Rellenar vector de forma manual.\n2. Rellenar vector de forma aleatoria.\n3. Mostrar Datos.\n4. Máximos y minimos.\n5. Temperatura media\n6. Salir.");
		
		while (estado == false) {
			
			System.out.print("\n\nIntroduzca su elección:");
			
			eleccion = entrada.nextInt();
			
			  switch (eleccion) {
			  
			  case 0: System.out.println("\nHa decidido salir del programa. Todos los datos se borrarán."); 
			  
			  estado = true;
			  
			  break;
			  
			  case 1: System.out.println("Rellenar vector de forma manual\n\nIngrese cada uno de los datos:");
			  
			  for (int i=0; i<vector.length; i++) {
				
				  System.out.print((i+1)+".");
				  vector [i] = entrada.nextInt();
			  }
			  break;
			  
			  case 2: System.out.println("Rellenar vector de forma aleatoria\n\nLos datos serán asignados aleatoriamente."); 
			  
			  for (int i=0; i<vector.length; i++) {
				  vector [i] = (int) (Math.random() *(0-(40+1))+((40+1)));
				 
			  }
			  System.out.println ("La asignación de datos ha sido completada.");
			  break;
			  
			  case 3: System.out.println("Mostrar datos.\n\nLos datos almacenados son:"); 
			  
			  for (int i=0; i<vector.length; i++) {
				  System.out.println((i+1)+". "+vector[i]);
			  }
			  break;
			  
			  case 4: System.out.println("Dato máximo y mínimo.\n\nLos datos solicitados son:"); 
			 
			  System.out.println("El mayor dato es: "+EJ2020.valorMayorArray(vector));
			  System.out.println("El menor dato es: "+EJ2020.valorMenorArray(vector));
				  
			 break;
				
			  case 5: System.out.println("Temperatura media.\n\nEl dato solicitado es:"); 
			
			  System.out.println("La media es: "+EJ2020.mediaArray(vector));
			  
			  break;
			  
			  case 6: System.out.println("\nHa decidido salir del programa. Todos los datos se borrarán."); 
			  
			  estado = true;
			  
			  default: System.out.print("Ha introducido un parámetro incorrecto.");
			  
			  } // Switch
			
		} // While
		
		System.out.println ("El programa ha finalizado");
		
	} // Public static

} // Public class. 
