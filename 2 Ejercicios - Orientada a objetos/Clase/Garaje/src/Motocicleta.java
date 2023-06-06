
public class Motocicleta extends Vehiculo {
	
	// ATRIBUTOS
	
	
	
	// CONSTRUCTOR
	
	public Motocicleta (String color, byte NumRuedas, short Cilindrada, short Potencia) {
		
		super (color, NumRuedas,Cilindrada, Potencia);
		
		// Si es una privada, deben importarse los MÉTODOS en el CONSTRUCTOR en forma de SET
		// De modo que puedan utilizarse a lo pargo del programa. 
		
		this.setCilindrada(Cilindrada);
		this.setPotencia(Potencia);
		
		
	}
	
	// MÉTODOS OVERRIDE 
	
	public void arrancar() {
		
		System.out.println("Arranca Motocicleta");
		
	}
	

	public int impuesto() {
		
		// Importar los datos necesarios (debido a que son privados)
		
		int Cilindrada = this.getCilindrada ();
		int Potencia = this.getPotencia ();
		
		// Realización del cálculo
		
		int resultado = Cilindrada/30 + Potencia*30; 
		
		return resultado; 
		
	}
	
	
	
	
	

}
