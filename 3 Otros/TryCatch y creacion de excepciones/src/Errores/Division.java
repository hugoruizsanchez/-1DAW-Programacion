package Errores;


public class Division {
	
	public int dividendo;
	public int divisor; 
	
	// CONSTRUCTOR
	
	public Division (int dividendo, int divisor) {
		this.dividendo = dividendo;
		this.divisor = divisor; 
	}
	
	// MÉTODOS
	
	public double dividir () {	
		return dividendo/divisor;	
	}
	
	public static void main(String[] args) {
		
		Division d1 = new Division (0,0);
			
		try {	// DECLARACIÓN DE LOS ERRORES ENLAZADOS CON la clase MiExcepcion.java
			if (d1.dividendo <= 0 && d1.divisor <= 0) {
				throw new ErrorDivision(125);	// Invocamos un error, recurriendo a su constructor e introduciendo su codigo de error, que en getMessage capturará en el switch
			}
			else if (d1.dividendo <= 0) {
				throw new ErrorDivision (123);
			}
			else if (d1.divisor <=0) {
				throw new ErrorDivision (124);
			}				
		}
		catch (Exception e ) {
			System.out.println ("¡Error detectado en la operación! Código de error: ");
			e.printStackTrace();
		}
		
	}

}
 