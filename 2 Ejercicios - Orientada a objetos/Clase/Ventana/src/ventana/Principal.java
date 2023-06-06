package ventana;

public class Principal {

	public static void main(String[] args) {
        
		Ventana v1 = new Ventana (10, 0, "Hola mi nombre es");		
	
		v1.mostrar();
	
		v1.maximizar(v1);
		v1.minimizar(v1);
		v1.redimensionar (v1,20,40);

		
	}

}
