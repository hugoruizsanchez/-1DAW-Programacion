package ventana;

public class Ventana {

	// ATRIBUTOS 
	
	private int alto, ancho;
	private String texto;
	
	// CONSTRUCTORES
	
	public Ventana (int alto, int ancho, String texto) {
		
		this.alto = alto; 
		this.ancho = ancho; 
		this.texto = texto; 
		
	}

	// MÉTODOS

	public void mostrar () {
		
		
		
		// > ANCHO 
		
		for (int i=0; i<ancho+4; i++) {
			System.out.print("*");	
		}
		
		// > TEXTO
		
		
		
		
		System.out.println ();
		
		if ((texto.length())>ancho+4) { // Si el TEXTO tiene una longitud MAYOR AL ANCHO
			
	System.out.print("* ");
			
			for (int i=0; i<ancho; i++) {
				System.out.print(texto.charAt(i)); // ENTONCES escribimos carácter por carácter
				
			}
			
			for (int i=0; i<(ancho-texto.length()+1); i++) { // ESTO ES PARA HACER LOS HUECOS
				
				System.out.print(" ");
			}
			System.out.print (" *");
			
			// IMPRESIÓN DEL RESTO DE CARACTERES
			
			
			
			System.out.println ();
			System.out.print ("* ");
			
			
			
			for (int i=ancho; i<texto.length(); i++) {
				
				System.out.print(texto.charAt(i));
				
			}
			
			
			for (int i=ancho; i<texto.length(); i++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println ();
			
			
			//
			
		
			
			
		} 
		else {
			
           System.out.print("* "+texto);
			
			for (int i=0; i<(ancho-texto.length()+1); i++) {
				
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println ();
			
			
		}
		
		
	  	// > ANCHO	
		
				for (int i=0; i<ancho+4; i++) {
					System.out.print("*");
				}
				
				// > ALTO 
				
				for (int i=0; i<alto; i++) { 
					System.out.println (); 
					
					System.out.print("*"); 
					
					for (int j=0; j<ancho+2; j++) {
						System.out.print("‎ ");     
					}
					
					System.out.print("*"); 
			}
				// > ANCHO
				


				if (alto!=0) {
				
				System.out.println ();
				
				for (int i=0; i<ancho+4; i++) {
					System.out.print("*");
				}
				
				}
		
	}
	
	// MÉTODO MAXIMIZAR VENTANA
	
	public void maximizar (Ventana v) {
		System.out.println ();
		alto = 25;
		ancho = texto.length()+60;
		v.mostrar();
	}
	
	// MÉTODO MINIMIZAR VENTANA
	
	public void minimizar (Ventana v) {
		
		System.out.println ();
		alto = 0;
		ancho = texto.length()+5;
		v.mostrar();
		
	}	
	
	// MÉTODO REDIMENSIONAR VENTANA
	public void redimensionar (Ventana v, int alto, int ancho) {
	
		
		System.out.println ();
		this.alto = alto;
		this.ancho = ancho;
		
		if (ancho < (texto.length()+2)) {
			
			System.out.print("La ventana no puede proyectarse porque el ancho introducido es incompatible con el formato del texto. ");
			
		}
		else {
			v.mostrar();
		}
		
	}
	
}
