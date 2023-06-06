package Ejercicio2;

import java.util.*;

public class Principal {

	
	
	public static void main(String[] args) {
		
		// DECLARACIÓN DE VARIABLES QUE EL USUARIO INTRODUCIRÁ 
		
		Scanner entrada = new Scanner (System.in);
		String peticion ="";
		int cantidad =0; 
		
		// REGISTRO DE PRODUCTOS. 
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto ("Avena", 2.21));
		productos.add(new Producto ("Garbanzos", 2.39));
		productos.add(new Producto ("Tomate", 1.59));
		productos.add(new Producto ("Jengibre", 3.13));
		productos.add(new Producto ("Quinoa", 4.50));
		productos.add(new Producto ("Guisantes", 1.60));
		
		// SISTEMA DE PETICIONES

		int posicionProducto = -1; // Variable que controla la posición del producto y las funciones internas de detener el programa o remitir otra petición cuando se ha introducido un dato incorrecto. 
		
		while (0<1) {
			posicionProducto = -1;
			System.out.print ("Introduzca producto: ");
			peticion = entrada.next();
			
			if (peticion.equals("Fin")) {
				posicionProducto = -2;
			}
	
			for (int i=0; i<productos.size(); i++) {
				
				if (peticion.equals(productos.get(i).getNombre())) {
					posicionProducto = i;
				}	
			}
			
			if (posicionProducto == -1) {
				System.out.println ("Producto NO registrado. Vuelva a intentarlo. ");
			}
			
		    else if (posicionProducto >=0 ) {
				System.out.print("Cantidad: ");
				productos.get(posicionProducto).setCantidad(entrada.nextInt());
			}
			
		    else if (posicionProducto == -2) {
		    	
		    	System.out.println ("RESULTADOS");
		    	System.out.println ("| PRODUCTO | PRECIO | CANTIDAD | SUBTOTAL");
		    	double total =0; 
		    	
		    	for (int i =0; i<productos.size(); i++) {
		    		
		    		if (productos.get(i).getCantidad() > 0) 		
		    			System.out.println ("| "+ productos.get(i).getNombre() + "| "+productos.get(i).getPrecio()+" | " +productos.get(i).getCantidad()+" | "+ productos.get(i).getCantidad()*productos.get(i).precio); 			
		    			
		    		total = total + productos.get(i).getCantidad()*productos.get(i).precio;
		
		    	}
		    	
		    	System.exit(0);
		    	
		    }
			
		}
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
	
		

	}

}
