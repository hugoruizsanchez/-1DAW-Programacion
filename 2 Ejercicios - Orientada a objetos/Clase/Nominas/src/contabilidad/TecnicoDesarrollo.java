package contabilidad;

public class TecnicoDesarrollo extends Empleado {
	
//	ATRIBUTOS
	
	private int horasExtra; 
	
//	CONSTRUCTOR 
	
		public TecnicoDesarrollo (String nombre, String nif, double salarioBase, int horasExtra) {
			
			super (nombre, nif, salarioBase);
			this.horasExtra = horasExtra; 
			
			this.setNif(nif);
			this.setNombre(nombre);
			this.setSalarioBase(salarioBase);
			
		}

	
//   MÉTODOS: GET Y SET

		public int getHorasExtra() {
			return horasExtra;
		}

		public void setHorasExtra(int horasExtra) {
			this.horasExtra = horasExtra;
		}
		
//	 MÉTODOS 
		
	public double calculaNomina () {
		
	return this.getSalarioBase()+horasExtra*10;
	
	}
		
		

		
		
}
