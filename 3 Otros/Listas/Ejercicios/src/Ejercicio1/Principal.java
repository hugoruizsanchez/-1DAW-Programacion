package Ejercicio1;
import java.util.ArrayList;
public class Principal {
	
	public static void main(String[] args) {
	

		ArrayList<String> nombres = new ArrayList<String>();
	
		nombres.add("Jorge Cabezas");
		nombres.add("Aarón Mendez");
		nombres.add ("Patricia Camarón");
		nombres.add("Minectaft Hernandez");
		nombres.add("Carlos Guay");
		
		for (int i=0; i<nombres.size(); i++) {
			System.out.println (nombres.get(i));
		}
		
	}
	

}
