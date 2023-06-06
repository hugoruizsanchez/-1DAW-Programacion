
public class Principal {

	public static void main(String[] args) {
		
		
		
		Vehiculo v1 = new Motocicleta ("VERDE", (byte) 2, (short) 125, (short) 50);
		Vehiculo v2 = new Motocicleta ("AMARILLO", (byte) 2, (short) 250, (short) 100);
		
		Vehiculo v3 = new Camion ("NEGRO", (byte) 6, (short) 2000, (short) 400, 2);
		Vehiculo v4 = new Camion ("BLANCO", (byte) 6, (short) 4000, (short) 800, 4);
		
		System.out.println ("Motocicleta 1: "+v1.impuesto());
		System.out.println ("Motocicleta 2: " +v2.impuesto());
		System.out.println ("Camión 1: " +v3.impuesto());
		System.out.println ("Camión 2: "+v4.impuesto());
		

	}

}
