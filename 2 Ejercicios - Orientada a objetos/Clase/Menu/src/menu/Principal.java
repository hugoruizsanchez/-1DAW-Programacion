package menu;

public class Principal {

	public static void main(String[] args) {
		
		
		String [] cositas = {"Comprar naranjas", "Comprar peras", "Comprar manzanas"};
		Menu m1 = new Menu (cositas);
		
		m1.setTitulo("Menú de opciones de prueba");
		m1.mostrarMenu();
		int eleccion = m1.eligeOpcion();
			
		System.out.println ("Has elegido la opcion "+cositas [eleccion-1]+".");
		

	}

}
