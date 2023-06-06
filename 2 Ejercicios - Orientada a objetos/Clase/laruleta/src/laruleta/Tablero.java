package laruleta;

public class Tablero {
	
//	ATRIBUTOS
	
	// Array de 37 casillas, las que debe contener el tablero.
	
	private Casilla[] miMesa = new Casilla[37]; 
	
//  CONSTRUCOR 
	
	public Tablero () {
		
		int rojos[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
		
		// Definición de la casilla 0, que tiene caracteres únicos. 
		
		miMesa [0] = new Casilla ();
		
		// Definición del resto de casillas.
		
		for (int i =1; i<miMesa.length; i++) {

			miMesa [i] = new Casilla (false, false, false);
			
		}
		
		// Concreción de las casillas. 
		
		for (int i =1; i<miMesa.length; i++) {
			
			if (i%2 == 0) {
				miMesa [i].setPar(true);
			}
			
			if (i<=18) {
				miMesa [i].setFalta(true);
			}
			
			for (int j =0; j<rojos.length; j++) {
				
			if (i == rojos [j]) {	
				miMesa [i].setRojo(true);			
			}
			
			}
			
		}
		
	}
	
//	MÉTODOS 
	
	public String casillaValor (int i) {
		
		String valor; 
		String color; 
		String par; 
		String falta; 
		
		if (miMesa [i].isRojo()) {
			color = "rojo";
		}
		else {
			color = "negro";
		}
		
		if (miMesa [i].isPar()) {
			par = "par";
		}
		else {
			par = "impar";
		}
		
		if (miMesa [i].isFalta()) {
			falta = "falta"; 
		}
		else {
			falta = "pasa";
		}

		valor = "< Valor "+i+" > "+"< Color: "+color+" > "+"< Par/Impar: "+par+" > "+"< Falta/Pasa: "+falta+" >";
		return valor;
	}
	
	public void comprobacion (int [] casillas) {
		
		int ceros =0; 
		int rojos =0, negros =0;
		int pares =0, impares =0;
		int faltas =0, pasas =0; 
		
		for (int i =0; i<casillas.length; i++) {
				
			if (miMesa [casillas [i]].isCero() == true) {
				ceros++;
			}
			
			if (miMesa [casillas [i]].isRojo() == true) {
				rojos++;
			}
			else {
				negros++;
			}
			
			if (miMesa [casillas [i]].isPar() == true) {
				pares++;
			}
			else {
				impares++;
			}
			
			if (miMesa [casillas [i]].isFalta() == true) {
				faltas++;
			}
			else {
				pasas++;
			}	
			
		}
		
		System.out.println ("Ceros: "+ceros);
		System.out.println ("Rojos: "+rojos+" Negros: "+negros);
		System.out.println ("Pares: "+pares+" Impares: "+impares);
		System.out.println ("Faltas: "+faltas+" Pasas: "+pasas);
		
		
	}
	
	

} // This is the end... My only friend, the end...
