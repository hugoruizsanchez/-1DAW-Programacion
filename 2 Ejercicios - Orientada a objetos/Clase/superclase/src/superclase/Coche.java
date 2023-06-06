package superclase;



	// SUBCLASE 
	  
		class Coche extends Vehiculo {
			
		// MÉTODO CONSTRUCTOR.
			
			public Coche () {
				System.out.println ("Constructor subclase");
				
			}
			
		// MÉTODOS
			
			public void arrancar () {
				System.out.println ("Arranca coche");
				
			}
			
			public void arrancar (String s ) {
				
				System.out.println ("Arranca coche: "+s);	
			}
		}
	
	
