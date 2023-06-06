package set1_2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		 String [] seleccion = {
				 "Listar publicaciones",
				 "Listar libros",
				 "Listar periódicos",
				 "Modificar una publicación",
				 "Total libros", 
				 "Total periódicos", 
				 "Agregar libro", 
				 "Agregar periódico", 
				 "Agregar libro a partir de posición", 
				 "Agregar periódico a partir de posición"
				 }; 
		 
		Biblioteca b1 = new Biblioteca ();
		Menu m1 = new Menu (seleccion, "Bibliteca mejorada");
		Scanner entrada = new Scanner (System.in);

		
		m1.mostrarMenu();
		
		
		int eleccion = 1;
		
		while (eleccion !=0) {
		
			eleccion = m1.eligeOpcion();
			
			switch (eleccion) {
			
			case 1: System.out.println ("Elección -> "+seleccion [0]);
			
			b1.listarLibros();
			b1.listarPeriodicos();
						
			break;
			
			case 2: System.out.println ("Elección -> "+seleccion [1]);
			
			b1.listarLibros();
			
			break;
			
			case 3: System.out.println ("Elección -> "+seleccion [2]);
			
			b1.listarPeriodicos();
			
			break; 
			
			case 4: System.out.println ("Elección -> "+seleccion [3]);
			
			System.out.print ("Introduzca la posición: ");
			
			b1.modificarPublicacion(entrada.nextInt());
			
			break; 
			
			case 5: System.out.println ("Elección -> "+seleccion [4]);
			
			System.out.println ("El total de libros es: "+b1.cantidadLibros());
			
			break;
			
			case 6:  System.out.println ("Elección -> "+seleccion [5]);
			
			System.out.println ("El total de libros es: "+b1.cantidadPeriodicos());
			
			break;
			
			case 7: System.out.println ("Elección -> "+seleccion [6]);
			
			b1.agregarLibro();
			
			break;
			
			case 8: System.out.println ("Elección -> "+seleccion [7]);
			
			b1.agregarPeriodico();
			
			break; 
			
			case 9: System.out.println ("Elección -> "+seleccion [8]);
			
			System.out.print ("Introduzca posición a partir de la cual quiere introducir libro: ");
			
			b1.agregarLibro(entrada.nextInt());
			
			break;
			
			case 10: System.out.println ("Elección -> "+seleccion [9]);
			
			System.out.print ("Introduzca posición a partir de la cual quiere introducir periódico: ");
			
			b1.agregarPeriodico(entrada.nextInt());
			
			}
			
		}
		
	}

}
