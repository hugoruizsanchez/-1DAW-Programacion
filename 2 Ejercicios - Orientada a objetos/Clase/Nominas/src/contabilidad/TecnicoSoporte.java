package contabilidad;

public class TecnicoSoporte extends Empleado {
	
//	ATRIBUTOS 
	
	private double dietas; 
	
//	CONSTRUCTOR 
	
	public TecnicoSoporte (String nombre, String nif, double salarioBase,double dietas) {
		
		super (nombre, nif, salarioBase);
		this.dietas = dietas; 
		
		this.setNif(nif);
		this.setNombre(nombre);
		this.setSalarioBase(salarioBase);
		
	}


//	MÉTODOS: GET Y SET 
	
	public double getDietas() {
		return dietas;
	}

	public void setDietas(double dietas) {
		this.dietas = dietas;
	}
	
//	MÉTODOS 
	
	public double calculaNomina () {
		
		return this.getSalarioBase() ;
		
	}
	
	
	
}
