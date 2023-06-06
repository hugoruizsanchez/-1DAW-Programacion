package EjemploPropuesto;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainApp {
	public static void main(String[] args) {
		
		
		
		// VARIABLES Y OBJETOS 
		
		Scanner entrada = new Scanner (System.in);
		Scanner entrada2 = new Scanner (System.in);
		DAOCoche miGaraje = new DAOCoche();
		int eleccion  =0; 
		
		
		// INTRODUCCIÓN DEL PROGRAMA
		
		System.out.println ("Prueba del funcionamiento de la clase FILE: \n1.- Añadir coche. \n2.- Ver coches. \n3.- Eliminar coches\n4.-Listar coches");
		
		// PETICIÓN DE ELECCIÓN AL USUARIO, SWITCH EN BUCLE
		
		// CARGAR EL ARCHIVO: 
		
		miGaraje.cargar();
				
		while (0<1) {
			
			System.out.print("Introduzca opción: ");
			eleccion = entrada.nextInt();
			
			switch (eleccion) {
			
			case 1: System.out.println ("Añadir coche.");
			
			String matricula ="";
			String modelo ="";
			String color = "";
			int year =0;
			
			System.out.print("Matricula: "); matricula = entrada2.next();
			System.out.print("Modelo: "); modelo = entrada2.next();
			System.out.print("Color: "); color = entrada2.next();
			System.out.print("Año: "); year = entrada2.nextInt();
			
			miGaraje.addCoche(new Coche (matricula, modelo, color, year));
			
			break;
			
			case 2: System.out.println ("Actualizar coche");
			
			System.out.print("Matricula del coche a modificar: "); matricula = entrada2.next();
			System.out.print("Modelo: "); modelo = entrada2.next();
			System.out.print("Color: "); color = entrada2.next();
			System.out.print("Año: "); year = entrada2.nextInt();
			
			miGaraje.updateCoche(miGaraje.findCoche(matricula), new Coche(matricula, modelo, color, year));
			
			break; 
			
			case 3: System.out.println ("Borrar coche");
				
			System.out.print("Matricula del coche a eliminar: "); matricula = entrada2.next();
			
			miGaraje.deleteCoche(miGaraje.findCoche(matricula));
			
			break;
			
			case 4: System.out.println ("Listar coches");
			
			System.out.println("-------------------------");
			for (Coche c: miGaraje.getCoches()) {		
				System.out.println(c);
			}
			
			break;
			
			default: System.out.println ("Elección no reconocida, saliendo del sistema.");
			
			miGaraje.guardar();
			
			System. exit(0);
			
			break;
			
			}
			
		}
		

		
		
	} //main	
} // AppMAin

