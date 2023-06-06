package electrodomesticos;

import java.util.Random;

public abstract class Electrodomestico {

//	ATRIBUTOS 
	
		// ARRAYS PARA COLOR Y CONSUMO. 
	protected char [] arrayConsumo = {'A', 'B', 'C', 'D', 'E', 'F' };	
	protected String arrayColor []  = {"Blanco	", "Negro", "Rojo", "Gris"};
	
		// DATOS POR DEFECTO - FINALES. 
	protected final float preciobaseFinal = 100;
	protected final float pesoFinal = 5;
	protected final int colorFinal = 0;
	protected final int consumoFinal = 5;
	
		// ATRIBUTOS DEL OBJETO. 
	protected float preciobase; 
	protected float peso; 
	protected String color; 
	protected char consumo;

	
//	CONSTRUCTOR POR DEFECTO

	public Electrodomestico () {

	this.preciobase = preciobaseFinal; 
	this.color = arrayColor [colorFinal];
	this.consumo = consumoFinal;
	this.peso = pesoFinal;
	
	}

// CONSTRUCTOR con -> PRECIO Y PESO
	
	public Electrodomestico (float preciobase, float peso) {
		
		this.peso = peso;
		this.preciobase = preciobase;
		this.consumo = consumoFinal;
		this.preciobase = preciobaseFinal;
		
	}
	
//	CONSTRUCTOR CON TODOS LOS ATRIBUTOS. 
	
	public Electrodomestico (float preciobase, float peso, int color, int consumo) {
		
		this.preciobase = preciobase; 
		this.peso = peso;
		this.color = arrayColor [color]; 
		this.consumo = arrayConsumo [consumo]; 
			
		
	}
	
//	MÉTODOS DE FUNCIÓN 
	
		// COMPROBAR CONSUMO 
	public boolean comprobarConsumoEnergetico (int consumo) {
		
		if (arrayConsumo [consumo] == this.consumo) {
		
		return true;
		
		}
	
		return false; 
		
	}
	
		// COMPROBAR COLOR
	public boolean comprobarColor (int color) {
		
		if (arrayColor [color] == this.color) {
			
			return true;
			
		}
		
		return false;
	}
	
		// PRECIO FINAL 
	public float precioFinal () {
	
		int impuestoconsumo = 0; 
		int impuestopeso = 0; 
		// 	protected char [] arrayConsumo = {'A', 'B', 'C', 'D', 'E', 'F' };
		if (consumo == 'A' ) {
			impuestoconsumo = 100;
		}
		else if (consumo == 'B') {
			impuestoconsumo = 80; 
		}
		else if (consumo == 'C') {
			impuestoconsumo = 60;
		}
		else if (consumo == 'D') {
			impuestoconsumo = 50; 
		}
		else if (consumo == 'E') {
			impuestoconsumo = 30;
		}
		else if (consumo == 'F' ) {
			impuestoconsumo = 10;
		}
		else {
			System.out.println ("ERROR: VALOR DE CONSUMO NO ENCONTRADO");
		}
		
		
		if (this.peso<19) {
		impuestopeso=10;	
		} 
		else if (this.peso >=20 && this.peso <49 ) {
		impuestopeso=50;		
		}
		else if (this.peso >=50 && this.peso <79) {
		impuestopeso=80;	
		}
		else if (this.peso>80) {
		impuestopeso=100;
		}
		
		return this.preciobase+impuestopeso+impuestoconsumo; 
	}
	

	
	
//	MÉTODOS GET Y SET 


	public char[] getArrayConsumo() {
		return arrayConsumo;
	}

	public void setArrayConsumo(char[] arrayConsumo) {
		this.arrayConsumo = arrayConsumo;
	}

	public String[] getArrayColor() {
		return arrayColor;
	}

	public void setArrayColor(String[] arrayColor) {
		this.arrayColor = arrayColor;
	}

	public float getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(float preciobase) {
		this.preciobase = preciobase;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo.charAt(0);
	}

	public float getPreciobaseFinal() {
		return preciobaseFinal;
	}

	public float getPesoFinal() {
		return pesoFinal;
	}

	public int getColorFinal() {
		return colorFinal;
	}

	public char getConsumoFinal() {
		return consumoFinal;
	}
	

	
	
	
	

	
}
