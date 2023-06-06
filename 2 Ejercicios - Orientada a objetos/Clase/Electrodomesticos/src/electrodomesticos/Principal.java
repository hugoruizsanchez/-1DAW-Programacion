package electrodomesticos;

import java.util.Random;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

/* 	 
		 VALORES DE LAS VARIABLES  
	
		 -> CONSUMO: 
		 
		 0 -> A 
		 1 -> B
		 2 -> C 
		 3 -> D 
		 4 -> E
		 5 -> F
		 
		 -> COLORES 
		 
		 0 -> BLANCO
		 1 -> NEGRO
		 2 -> ROJO 
		 3 -> GRIS
		 
		 public Lavadora (float carga,float preciobase, float peso, int color, int consumo) {
*/
		
//		CONFIGURACIÓN DEL MENÚ 
		
		String [] seleccion = {
				 "Generar datos aleatorios para 5 lavadoras y 5 televisiones", 
				 "Modificar valores de un electrodoméstico",
				 "Listar electrodomésticos",
				 "Resumen de los electrodomésticos",
				 };
		
		Menu m1 = new Menu (seleccion);
		
		Scanner entrada = new Scanner (System.in);
		
		m1.setTitulo("Cálculo de precios de Electrodomésticos, según condiciones");
		
//		CREAR OBJETOS 
		
		 Electrodomestico arrayElectrodomesticos [] = new Electrodomestico [10] ;
		 
		 Random r1 = new Random();
		 
		
//		OPCIONES
		 
		 m1.mostrarMenu();
		
		 int eleccion = 1;
		 
		 while (eleccion !=0) {
			 
			 eleccion = m1.eligeOpcion();
			 
			 switch (eleccion) {
			 
			 	case 1: System.out.println ("(MENÚ) Elección -> "+seleccion [0]);

			 		for (int i=0; i<5; i++) { 
				
			 			arrayElectrodomesticos [i] = new Lavadora (r1.nextInt (90) + 10, r1.nextInt(1900) + 100,r1.nextInt (90) + 10,r1.nextInt (4), r1.nextInt (6));

			 		}
			 
			 		boolean tdtAleatorio;
			 		
			 		for (int i =5; i<10; i++) {
		
			 			if (r1.nextInt (2)==0) {
			 				tdtAleatorio = false;
			 			}
			 			else {
			 				tdtAleatorio = true;
			 			}
			 			
			 			arrayElectrodomesticos [i] = new Television (r1.nextInt (90) + 10, tdtAleatorio ,r1.nextInt(1900) + 100, r1.nextInt (90) + 10, r1.nextInt (4),  r1.nextInt (6));
			 					
			 		}
			 		
			 		System.out.println ("\nLa solicitud ha sido procedada con éxito.");
			 		break; 
			 		
			 		
			 	case 2: System.out.println ("Elección -> "+seleccion [1]);
			 	
			 	int ranura =0; 
			 	
			 	System.out.print ("Introduzca qué ranura desea modificar: ");
			 	ranura = entrada.nextInt();
			 	
			 	if ( ranura<0 | ranura > arrayElectrodomesticos.length) {
			 		System.out.println ("ERROR: RANURA INCORRECTA");
			 	}
			 	else if (arrayElectrodomesticos [ranura] == null) {
			 		System.out.println ("ERROR: RANURA NO ECONTRADA");
			 	}
			 	else {
			 		
			 		if (arrayElectrodomesticos [ranura] instanceof Lavadora) {
			 			
			 			System.out.print ("Redefinir precio base:"); 
			 			arrayElectrodomesticos [ranura].setPreciobase(entrada.nextFloat());
			 			System.out.print ("Redefinir color:");
			 			arrayElectrodomesticos [ranura].setColor(entrada.next());
			 			System.out.print ("Redefinir peso:");
			 			arrayElectrodomesticos [ranura].setPeso(entrada.nextFloat());
			 			System.out.print ("Redefinir consumo:");	
			 			arrayElectrodomesticos [ranura].setConsumo(entrada.next());
			 			System.out.print ("Redefinir carga: ");
			 		   ((Lavadora) arrayElectrodomesticos [ranura]).setCarga(entrada.nextFloat());
			 		   
			 			
			 		}
			 		else {
			 			System.out.print ("Redefinir precio base: "); 
			 			arrayElectrodomesticos [ranura].setPreciobase(entrada.nextFloat());
			 			System.out.print ("Redefinir color: ");
			 			arrayElectrodomesticos [ranura].setColor(entrada.next());
			 			System.out.print ("Redefinir peso: ");
			 			arrayElectrodomesticos [ranura].setPeso(entrada.nextFloat());
			 			System.out.print ("Redefinir consumo: ");	
			 			arrayElectrodomesticos [ranura].setConsumo(entrada.next());
			 			System.out.print ("Resolución: "); 
			 			((Television) arrayElectrodomesticos [ranura]).setResolucion(entrada.nextInt());
			 			System.out.print ("TDT (0 - No 1- Sí): ");
			 			
			 			boolean bandera = false; 
			 			int valor=0;
			 			while (bandera == false) {
			 				valor = entrada.nextInt();
			 				
			 				if (valor ==0 | valor == 1) {
			 					bandera = true;
			 				}else {
			 					System.out.print ("Vuelva a intentarlo: ");
			 				}
			 			}
			 			
			 			if (valor ==0) {
			 				((Television) arrayElectrodomesticos [ranura]).setTdt(false);
			 			}
			 			else {
			 				((Television) arrayElectrodomesticos [ranura]).setTdt(true);
			 			}
			
			 			
			 		}
			 		
			 	}
			 	
			 	
			 	break; 
			 	
			 	case 3: System.out.println ("Elección -> "+seleccion [2]);
			 	
			 	System.out.println (arrayElectrodomesticos [6] instanceof Lavadora);
			 	
			 	for (int i=0; i<arrayElectrodomesticos.length; i++) { 
					
			 	if (arrayElectrodomesticos [i] instanceof Lavadora == true ) {
			 		
			 		System.out.println ("("+(i+1)+") LAVADORA:");
			 		System.out.println ("->	 Precio final: "+arrayElectrodomesticos [i].precioFinal()); 
			 		System.out.println ("->	 Color: "+arrayElectrodomesticos [i].getColor());
			 		
			 	} 
			 	else if (arrayElectrodomesticos [i] instanceof Television == true) {
			 	
			 		System.out.println ("("+(i+1)+") TELEVISIÓN:");
			 		System.out.println ("->	 Precio final: "+arrayElectrodomesticos [i].precioFinal()); 
			 		System.out.println ("->	 Color: " + arrayElectrodomesticos [i].getColor());
			 		
			 	}
	
		 		}
			 	
			 	break;
			 	
			 	case 4: System.out.println ("Elección -> "+seleccion [3]);
			 	
			 	double preciototaltelevisor=0; 
			 	
			 	for (int i=0; i<arrayElectrodomesticos.length; i++) {
			 		
			 		if (arrayElectrodomesticos [i] instanceof Television == true) {
			 			preciototaltelevisor = arrayElectrodomesticos [i].precioFinal();
			 		}
			 		
			 	}
			 	
			 	float preciototallavadora =0;
			 	
			 	for (int i=0; i<arrayElectrodomesticos.length; i++) {
			 		
			 		if (arrayElectrodomesticos [i] instanceof Lavadora == true) {
			 			preciototallavadora = arrayElectrodomesticos [i].precioFinal();
			 		}
			 		
			 	}
			 		
			 	System.out.println ("Precio total TELEVISIONES: " +preciototaltelevisor);
			 	System.out.println ("Precio total LAVADORAS: " +preciototallavadora);
			 	System.out.println ("Precio total ELECTRODOMÉSTICOS: " +(preciototaltelevisor+preciototallavadora));
			 	
			 	break; 
			 		
			 		
			 		
			 	
			 	
			 	
			 }
			
		}
		
		

		 
		 

	}

}
