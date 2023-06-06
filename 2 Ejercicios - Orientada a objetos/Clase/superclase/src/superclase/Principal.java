package superclase;


public class Principal {

	public static void main(String[] args) {

		System.out.println ("Superclase");

//		Crear una superclase. 
		
		Coche c = new Coche ();
		c.arrancar();
		c.arrancar("Que pasa, carapasa");
	
		Vehiculo c1 = new Vehiculo ();
		c1.arrancar();
		
		
		
	}
		
	
		
		
	
	
	
}
