package contabilidad;

public class Director extends Empleado {

//	ATRIBUTOS 
	
	private boolean bonus; 
	
//	CONSTRUCTOR 
	
	public Director (String nombre, String nif, double salarioBase,boolean bonus) {
	
		super (nombre, nif, salarioBase);
		this.bonus= bonus; 
		
		this.setNif(nif);
		this.setNombre(nombre);
		this.setSalarioBase(salarioBase);
		
	}
	
	
	
	
//	MÉTODOS
	

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Director(String nombre, String nif, double salarioBase) {
		super(nombre, nif, salarioBase);
		// TODO Auto-generated constructor stub
	}




	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	public boolean getBonus () {
		return bonus;
	}

	public double calculaNomina () {
		
		double resultado; 
			
		if (bonus == true) {
			resultado = this.getSalarioBase() + this.getSalarioBase()*0.1;
			
		} else {
			resultado = this.getSalarioBase(); 
			
		}
		
		return resultado;
		
		
	}
	
}
