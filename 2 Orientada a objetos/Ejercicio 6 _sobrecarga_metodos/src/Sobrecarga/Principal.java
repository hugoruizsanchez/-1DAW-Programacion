package Sobrecarga;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("Hugo",19);
		p1.correr(); // Aquí no especificamos ningún argumento, lo que interpreta como que estamos recurriendo al primer método escrito. 
		
		Persona p2 = new Persona ("123456789A");  // Número de DNI
		
		System.out.println ();
		
		p2.correr(100,12,"Raúl");

		
		
	}

}
