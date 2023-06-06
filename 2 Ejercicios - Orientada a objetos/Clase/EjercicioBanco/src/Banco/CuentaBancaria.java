package Banco;

public class CuentaBancaria {

	// ATRIBUTOS 
	
	private String numerocuenta;
	private double saldo;
	public String nombre;

	// CONSTRUCTORES 	
	
public CuentaBancaria (String numerocuenta, float saldo) {
	this.nombre = nombre; 
	this.numerocuenta = numerocuenta;
	this.saldo = saldo; 
		System.out.println ("CREACIÓN DE CUENTA-> Cuenta bancaria con código: "+numerocuenta+" y saldo: "+saldo+"€");
	}



// MÉTODOS 


// Método para consultar tu dinero. 

public void consultarDinero () {
	
	System.out.println ("CONSULTA DE DATOS-> Cuenta bancaria con código: "+numerocuenta+" y saldo: "+saldo+"€");
	
}

// Método para transferir dinero

public boolean transferirDinero (CuentaBancaria nombre, double dinero) {
	
	if ((this.saldo>=dinero) && (dinero>0)) {
		
		nombre.ingresarDinero (dinero);
		
		this.retirarDinero(dinero);
		
		return true;
	}
	
	else {
		return false; 
	}
	
}

// Método para retirar dinero. 

public void retirarDinero (double dinero) {
	
	saldo = saldo -dinero; 
	
	System.out.println ("RETIRADA DE DINERO ("+dinero+")-> Cuenta bancaria con código: "+numerocuenta+" y saldo actualizado: "+saldo+"€");
	
	
}


// Metodo para ingresar dinero, 

public boolean ingresarDinero (double dinero) { 
	
	if (dinero>0) {
		
		saldo = (dinero+saldo);
		
		return true;
		
	}
	return false;
	
}
		
// Getters y Setters
		public void setSaldo (float saldo) {
			
			this.saldo = saldo;
		
	    }
		
		public double getSaldo () {
			
			return saldo; 
		}
		
		public void setNumero (String numerodecuenta) {
			this.numerocuenta = numerodecuenta;
		}
		
		public String getNumero () {
			return numerocuenta;
		}
	
}


