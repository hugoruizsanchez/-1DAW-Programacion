import java.util.ArrayList;
import java.util.Iterator;


public class Principal {

	public static void main(String[] args) {

		
		Producto p1 = new Producto ("Pan", 6);
		Producto p2 = new Producto ("Leche", 2);
		Producto p3 = new Producto ("Fresas", 28);
		Producto p4 = new Producto ("Col", 1);
		Producto p5 = new Producto ("Carne", 3);
		
		// CREACIÓN DE UN ARRAYLIST PRODUCTO 
		
		ArrayList<Producto> list_productos = new ArrayList<>(5);
		
		list_productos.add(p1);
		list_productos.add(p2);
		list_productos.add(p3);
		list_productos.add(p4);
		list_productos.add(0, p5); // Se asigna la posición 0 a p5 
		list_productos.add(5, p5);
		// MOSTRAR LA ARRAYLIST 
		
			// Primer método: con un FOR 
		System.out.println ("-------------- MOSTRAR ARRAY CON FOR ------------");
		for (int i = 0; i < list_productos.size(); i++) {
		    System.out.println(list_productos.get(i));
		}
		
			// Segundo método: con un ITERATOR
		System.out.println ("-------------- MOSTRAR ARRAY CON ITERATOR ------------");
		
		Iterator<Producto> it = list_productos.iterator();
		while (it.hasNext()) {
		    Producto auxiliar = it.next();
		    System.out.println(auxiliar);
		}
		
			// * Manera alternativa. 
		System.out.println ("-------------- MOSTRAR ARRAY CON ITERATOR 2 ------------");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
			
		// ELIMINAR p2
		
		list_productos.remove(2);
		
		
		// VOLVER A MOSTRAR
		
		System.out.println ("-------------- MOSTRAR FINAL ------------");
		
		for (int i = 0; i < list_productos.size(); i++) {
		    System.out.println(list_productos.get(i));
		}
		
//		
		
		boolean existe = false;
		if (list_productos.contains(p5)) {
		existe = true;
		}
		System.out.println (existe);
		
		System.out.println (list_productos.lastIndexOf(p5));
		System.out.println (list_productos.indexOf(p5));
		
		list_productos.clear();
		list_productos.removeAll(list_productos);
	}
	
	

	

}
