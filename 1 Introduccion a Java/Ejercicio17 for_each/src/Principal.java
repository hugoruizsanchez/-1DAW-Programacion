
public class Principal {

	public static void main(String[] args) {

		
	String [] nombres = {"Hugo","Marcos","Ursula","Mario","Jorge", "Pablo", "Ángela","Ruinas"};

	
	/* MÉTODO NORMAL
	
	En principio usaríamos el método empleado hasta ahora en clase: 
	
	for (int repetidor = 0; repetidor < 4; repetidor++) {
		
		System.out.println (nombres[repetidor]);
		
		... pero es ineficiente si agregamos más datos a la array.
	}
	*/
	
	
	/* MÉTODO NORMAL ABREVIADO. 
	 
	for (int repetidor = 0; repetidor< nombres.length; repetidor++) { // nombres.length, para comprender TODOS los elementos del arreglo sin contarlos.
		
		System.out.println (nombres[repetidor]);
	}
	
	*/ 
	
	for (String repetidor:nombres) { // Tipo_de_variable nombre_for:nombre_de_variable para hacer lo mismo 
		
		System.out.println (repetidor);
	}
	
	}

}
