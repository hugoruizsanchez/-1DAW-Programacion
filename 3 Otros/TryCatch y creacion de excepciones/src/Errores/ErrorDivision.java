package Errores;
public class ErrorDivision extends Exception { /// o extends ArithmeticException si queremos hacer concreciones. 
	
	// ATRIBUTOS -> Solo necesitaremos el código de error, que identificará el problema. 
	
	private int codigoError; // Variable que guardará el código de error. 
	
	// CONSTRUCTOR
	
	public ErrorDivision (int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	@Override // Debemos hacer Override del método getMessage de error. Con un case, enumeramos los errores.
	public String getMessage () {
		
		String mensaje ="";
		
		switch (codigoError) {  // Para cada error, estará asociado un codigo de error cuyo mensaje personalizado.
		
		case 123: 
			mensaje = "El dividendo es igual o menor a cero.";
		break;
		case 124: 
			mensaje ="El divisor es igual o menor a cero. ";
		break; 
		case 125: 
			mensaje = "El dividendo y divisor son iguales o menores a cero.";
		break; 
		
		}
		
		return mensaje; 
		
	}

}
