public class Coche extends Vehiculo{

	// CONSTRUCTOR 
	
	public Coche(String color, byte NumRuedas, short Cilindrada, short Potencia) {
		
		super (color, NumRuedas,Cilindrada, Potencia);
		System.out.println("Constructor subclase");
	}
	
	
	// MÉTODOS OVERRIDE

	// * Arrancar -> de método abstracto en VEHICULO. 
	
	public void arrancar() {
		
		System.out.println("Arranca Coche");
	}
	
	// * Impuesto -> de método abstracto en VEHICULO	

	public int impuesto () {
	
		int resultado  = 0; 
		return resultado; 
		
	}
	
	// * Sobrecarga de arrancar (anterior) 

	public void arrancar(String s) {
	
		System.out.println("Arranca Coche: "+ s);
	}
	
	
}
