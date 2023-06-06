
public abstract class Vehiculo {
	
	// ATRIBUTOS

	private String color;
	private byte NumRuedas; 
	private short Cilindrada;
	private short Potencia;
	
	// CONSTRUCTOR
	
	public Vehiculo (String color, byte NumRuedas, short Cilindrada, short Potencia) {
		
	}
	
	// METODOS GET Y SET
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public byte getNumRuedas() {
		return NumRuedas;
	}

	public void setNumRuedas(byte numRuedas) {
		NumRuedas = numRuedas;
	}

	public short getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		Cilindrada = cilindrada;
	}

	public short getPotencia() {
		return Potencia;
	}

	public void setPotencia(short potencia) {
		Potencia = potencia;
	}
	

	// MÉTODOS ABSTRACTOS
	
	

	public abstract void arrancar();
	
	public abstract int impuesto ();
	
	
}
