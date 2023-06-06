package contabilidad;

public abstract class Empleado {
	
//	ATRIBUTOS
	
	private String nombre; 
	private String nif; 
	private double salarioBase; 

//	CONSTRUCTOR 
	
		public Empleado (String nombre, String nif, double salarioBase) {
			
			this.nombre = nombre; 
			this.nif = nif; 
			this.salarioBase = salarioBase; 
		}
		
//	MÉTODOS: GET Y SET
		
		public Empleado() {
			 
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNif() {
			return nif;
		}

		public void setNif(String nif) {
			this.nif = nif;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}
		
//	MÉTODOS
		
		public abstract double calculaNomina ();
		

		
		
			
}
