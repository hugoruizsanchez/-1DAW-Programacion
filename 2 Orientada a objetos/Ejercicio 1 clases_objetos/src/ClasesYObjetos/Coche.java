package ClasesYObjetos;

/*
  
  - Las clases, constituidas por atributos (nombre, color, kilometraje) y métodos (arrancar, avanzar, frenar), engloban objetos, 
    en este caso, coches. 
    
  - A su vez, los objetos también tienen atributos y métodos, pero por lo general los "adquieren" de las clases en las que se encuentran. 
 



 */


/* Cómo crear una clase en java: 

- Crear un paquete en el "source" (src) mediante el click derecho  con el nombre deseado, este paquete almacenará las clases

- En el paquete, crear la clase con click derecho. 

*/

 public class Coche { // La clase "coche" está creada". -> Public (modificador de acceso) class (clase) y Coche, (nombre). 

	 // Estos son los atributos de la clase. 
	
	 String color; 
	 String marca;
	 int kilometraje;
	
	  // Estos son los métodos de la clase. 

     public static void main (String [] args) { // Este es el método main. 
		
		 Coche coche1 = new Coche (); // En el cuerpo del código, creamos un objeto para la clase "Coches" de esta forma. 
		
		 coche1.color="Verde"; // Asignación de valores a los objetos. 
		 coche1.marca="Nissan";         
		 coche1.kilometraje = 102;
		
		 System.out.println ("El color del coche es: "+coche1.color);
		 System.out.println ("El color del coche es: "+coche1.marca);
		 System.out.println ("El color del coche es: "+coche1.kilometraje);
		 
		 System.out.println();
		 
		 Coche coche2 = new Coche ();
		 
		 coche2.color ="Amarillo";
		 coche2.marca ="Ferrari";
		 coche2.kilometraje = 100; 
		 
		 System.out.println ("El color del coche es: "+coche2.color);
		 System.out.println ("El color del coche es: "+coche2.marca);
		 System.out.println ("El color del coche es: "+coche2.kilometraje);
		 
	}
	
}
