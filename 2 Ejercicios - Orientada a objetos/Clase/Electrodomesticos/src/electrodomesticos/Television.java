package electrodomesticos;

public class Television extends Electrodomestico {
	
//	ATRIBUTOS 
	
	protected final int resolucionFinal =20;
	protected int resolucion; 
	protected boolean tdtFinal = false; 
	protected boolean tdt; 
	
//	CONSTRUCTOR POR DEFECTO 
	
	public Television () {
		
		this.preciobase = preciobaseFinal; 
		this.peso = pesoFinal;
		this.color = arrayColor [colorFinal];
		this.consumo = consumoFinal;
		
		this.tdt = tdtFinal; 
		this.resolucion = resolucionFinal; 
		
	}
	
//	CONSTRUCTOR CON PRECIO Y PESO 
	
	public Television (float preciobase, float peso) {
		
		super (preciobase, peso);
		
		this.color = arrayColor [colorFinal];
		this.consumo = consumoFinal;
	
		this.tdt = tdtFinal; 
		this.resolucion = resolucionFinal; 
		
	}
	
//	CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
	
	public Television (int resolucion, boolean tdt ,float preciobase, float peso, int color, int consumo) {
				
		super (preciobase, peso, color, consumo);
		
		this.tdt = tdt; 
		this.resolucion = resolucion; 
	}

//	MÉTODOS DE FUNCIÓN 
	
	public float precioFinal () {
		
		if (tdt == true) {
			return super.precioFinal()+50;
		} 
		
		if (resolucion>40) {
			return (float) (super.precioFinal()* 1.3); 
		}

		return super.precioFinal();
		
	}

	
//	MÉTODOS: GET Y SET 
	
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	
	
	
	

}
