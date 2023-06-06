package paquete1;

public class Principal {

	public static void main(String[] args) {
		
		Clase1 objeto1 = new Clase1 ();
		
		objeto1.setEdad(27); // Solo con el metodo accesorio SET enunciado en la Clase1 podemos modificar desde la Main el  atributo edad
		
		System.out.print(objeto1.getEdad()); // Solo con el método accesorio GET enunciado en la Clase1 podemos modificar desde la main el atributo edad
		
	}

}
