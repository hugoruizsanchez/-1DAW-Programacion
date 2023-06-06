package ventana;

public class Ventana {

	// ATRIBUTOS.
	
	private int alto; 
	private int ancho; 
	private String texto;
	
	// CONSTRUCTORES.
	
	public Ventana (int alto, int ancho, String texto) {
		this.texto = texto;
		this.alto = alto;
		this.ancho = texto.length()+ancho+4;
	}
	
	// MÉTODOS. 

	// MÉTODO MOSTRAR VENTANA
	public void mostrar () {
		
	
		
		// > ANCHO 
		
		for (int i=0; i<ancho; i++) {
			System.out.print("*");	
		}
		
		// > TEXTO
			
			System.out.println ();
			
			System.out.print("* "+texto);
			
			for (int i=0; i<ancho-texto.length()-3; i++) {
				
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println ();
			
		// > ANCHO	
			
		for (int i=0; i<ancho; i++) {
			System.out.print("*");
		}
		
		// > ALTO 
		
		for (int i=0; i<alto; i++) { 
			System.out.println (); 
			
			System.out.print("*"); 
			
			for (int j=0; j<ancho-2; j++) {
				System.out.print("‎ ");     
			}
			
			System.out.print("*"); 
	}
		// > ANCHO

		if (alto!=0) {
		
		System.out.println ();
		
		for (int i=0; i<ancho; i++) {
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
		
		
		
	// MÉTODO LIMPIAR VENTANA
	}
	
	public void limpiarVentana (Ventana v) {
		System.out.println ();
		texto = ""; 
		v.mostrar();
		
	}
	
	
}
