package laruleta;

public class Casilla {
	
//	ATRIBUTOS
	
	private boolean cero;
	private boolean rojo;
	private boolean par;
	private boolean falta;
	
	
//	CONSTRUCTOR
	
	public Casilla () {
		this.cero = true; 
	}

	public Casilla (boolean rojo, boolean par, boolean falta) {
		this.rojo = rojo; 
		this.par = par; 
		this.falta = falta;
		
	}
	
// MÉTODOS
	
	
	
	
// MÉTODO: GET Y SET 
	
	public boolean isCero() {
		return cero;
	}

	public void setCero(boolean cero) {
		this.cero = cero;
	}

	public boolean isRojo() {
		return rojo;
	}

	public void setRojo(boolean rojo) {
		this.rojo = rojo;
	}

	public boolean isPar() {
		return par;
	}

	public void setPar(boolean par) {
		this.par = par;
	}

	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}

}
