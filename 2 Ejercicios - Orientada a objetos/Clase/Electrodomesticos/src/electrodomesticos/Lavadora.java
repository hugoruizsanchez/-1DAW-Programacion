package electrodomesticos;

public class Lavadora extends Electrodomestico {
	
//	ATRIBUTOS
	
	private final float cargaFinal = 5;
	protected float carga; 
	
	
//	CONSTRUCTOR POR DEFECTO 
	
	public Lavadora () {
		
		this.preciobase = preciobaseFinal; 
		this.color = arrayColor [colorFinal];
		this.consumo = consumoFinal;
		this.peso = pesoFinal;
		
		this.carga = cargaFinal;
	}
	
//	CONSTRUCTOR CON PRECIO Y PESO 
	
	public Lavadora (float preciobase, float peso) {
		
		super (preciobase, peso);
		
		this.color = arrayColor [colorFinal];
		this.consumo = consumoFinal;
		this.peso = pesoFinal;
	}
	
//	CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
	
	public Lavadora (float carga,float preciobase, float peso, int color, int consumo) {
		
		super (preciobase, peso, color, consumo);
		this.carga = carga; 
		
	}
	
//	MÉTODOS DE FUNCIÓN
	
	public float precioFinal () {
		
		if (this.carga<30) {
			return super.precioFinal();
		}
		else {
			return super.precioFinal()+50;
		}
		
	}

	
//	MÉTODOS: GET Y SET
	
	public float getCarga() {
		return carga;
	}
	
	public void setCarga (float carga) {
		this.carga=carga;
	}
	
	
	
	

}
