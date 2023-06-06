package Banco;

public class Principal {

	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria ("12345678",0);
		CuentaBancaria c2 = new CuentaBancaria ("24682468",0);
		
		c1.ingresarDinero(800);
		c2.ingresarDinero(100);
	
		c1.consultarDinero();
		c2.consultarDinero();
		
		
		
		

	
	}

}
