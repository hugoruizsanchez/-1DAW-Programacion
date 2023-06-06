
public class Camion extends Vehiculo {
	
	// ATRIBUTOS 
	
	private int numEjes; 
	
	// CONSTRUCTOR 
	
	public Camion (String color, byte NumRuedas, short Cilindrada, short Potencia, int numEjes) {
		
		super (color, NumRuedas,Cilindrada, Potencia);
	
		this.numEjes = numEjes; 
		
		// Si es una privada, deben importarse los MÉTODOS en el CONSTRUCTOR en forma de SET
		// De modo que puedan utilizarse a lo pargo del programa. 
		
		this.setCilindrada(Cilindrada);
		this.setNumRuedas(NumRuedas);
		this.setPotencia(Potencia);
		this.setNumRuedas(NumRuedas);
		
		
	}

	
	// MÉTODOS OVERRIDE
	
	public void arrancar() {
	
		
	}

	public int impuesto() {
		
		// Importar los datos necesarios (debido a que son privados)
		
	    int Cilindrada = getCilindrada ();
		int Potencia = getPotencia ();
		int NumRuedas = getNumRuedas ();
		
		// Realización de las operaciones
		
		int resultado = Cilindrada/30 + Potencia*20 + NumRuedas*20 + numEjes*50; 
			
		return resultado;
	}
	
	
	
	

}
