package laitsof;

import java.util.Scanner;

/**
 * Clase dedicada a la administración del tablero de juego, y se describe el comportamiento de las casillas
 * Para lo cual se usa un array de casillas y se implementa una dificultad en número entero.
 * @author Hugo Ruiz Sánchez
 * 	
 *
 */

public class Tablero {
	
//	ATRIBUTOS
	
	public boolean [] [] casillas; // False - Apagado | True- Encendido. 
	public int dificultad =0; 
	
//	COSTRUCTOR
	
	/**
	 * Crea el tablero en base a una dimesión, como siempre será cuadrado, solo necesitará de un valor.
	 * Por defecto, todas las casillas se encontrarán  en un estado "FALSO" 
	 * @param dimension
	 */
	
	public Tablero (int dimension) {
		
		casillas = new boolean [dimension] [dimension];
		
		for (int i=0; i<casillas.length; i++) {
			
			for (int j =0; j<casillas.length; j++ ) {
				
				this.casillas [i] [j] = false;
				
			}
	
		}
		
	}
	
	
//	MÉTODO
	
	// Mostrar el tablero:
	
	/**
	 * Método para mostrar el tablero mediante un bucle for que incrementa el iterador y visualiza todos 
	 * los elementos del array "casillas" en base a su estado, si verdarero "O", si falso "-"
	 */
	
	public void mostrarTablero () {
		System.out.println ("|"+"-".repeat((casillas.length)*3)+"|");
		System.out.print ("X  ");
		
		for (int i=0; i<casillas.length; i++) {
			System.out.print(i+"  ");
		}
		
		System.out.println ();
		
		for (int i=0; i<casillas.length; i++) {
		System.out.print(i+ " ");	
			for (int j =0; j<casillas.length; j++ ) {
				
				if (casillas [i] [j] == true) {
					System.out.print (" O ");
				}
				else {
					System.out.print (" - ");
				}		
				
			}
			
			System.out.println ();
	
		}
		System.out.println ("|"+"-".repeat((casillas.length)*3)+"|");
		
	}
	
	
	// Mostrar ajustes: 
	
	/**
	 * Método para mostrar los ajustes y la configuración actual.
	 */
	
	public int mostrarAjustes () {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("------------------------------");
		System.out.println ("Dificultad actual: "+dificultad +".");
		System.out.println ("Dimensión actual: "+ casillas.length+" x "+casillas.length+".");
		System.out.println ("------------------------------");
		System.out.println ("[1] Modificar dificultad.");
		System.out.println ("[2] Comenzar juego.");
		System.out.println ("[0] Salir del programa");
		System.out.println ("------------------------------");
		
		System.out.println ();
		
		System.out.print ("Introduzca elección: ");
		
		return entrada.nextInt();
		
	}
	
	/**
	 * Método para iniciar nivel, asigna valores verdaderos aleatorios a un numero determinado de casillas
	 * en base a la dificultad. 
	 */
	
	// Iniciar nivel -> 0 y 1 Math.random();
	public void iniciarNivel () {
		
		int contador =0; 
		
		while (contador <= dificultad) {
			
			casillas [(int) (Math.random() * casillas.length)] [(int) (Math.random() * casillas.length)]= true;
			
			contador++;
			
		}
		
	}
	
	//Modificar casilla. 
	
	/**
	 * Método de modificar casilla usando los métodos abreviados escribePropia, escribeArriba, escribeAbajo, escribeDerecha
	 * 
	 * Si es igual a 777 777, el programa se cierra. 
	 * El retorno del boolean comprueba si el programa ha finalizado o no manualmente
	 * @return 
	 */
	
	public boolean modificarCasilla () {
		
		Scanner entrada = new Scanner (System.in);
		
		int i =0; 
		int j =0;
		
		System.out.print ("Introduzca X: "); 
		
		i  = entrada.nextInt();
		
		System.out.print ("Introduzca Y: ");
		
		j = entrada.nextInt(); 
		
		
		
		//1
		if (j<casillas.length-1 && i>=1 && i<casillas.length-1 && j>=1 ) {
			// System.out.println ("CONDICIONAL 1");
			 escribePropia (i,j);
	         escribeArriba (i,j);   
	         escribeAbajo (i,j);
	         escribeIzquierda (i,j);
	         escribeDerecha (i,j);
	            		
		}
		//2
		else if (i<casillas.length-1  && i>=1 && j==0) {
			//System.out.println ("CONDICIONAL 2");
			escribePropia (i,j);
			escribeArriba (i,j);   
	        escribeAbajo (i,j);
	        escribeDerecha (i,j);
	        
		}
		//3
		else if (i<casillas.length-1  && i>=1 && j==casillas.length-1) {
			//System.out.println ("CONDICIONAL 3");
			 escribePropia (i,j);
	         escribeArriba (i,j);   
	         escribeAbajo (i,j);
	         escribeIzquierda (i,j);
	         
		}
		//4
		else if (i== 0 && j ==0) {
			//System.out.println ("CONDICIONAL 4");
			escribePropia (i,j);
			escribeDerecha (i,j);
			escribeAbajo (i,j);
		}
		//5
		else if (i ==0 && j == casillas.length-1) {
			//System.out.println ("CONDICIONAL 5");
			escribePropia (i,j);
			escribeAbajo (i,j);
			escribeIzquierda (i,j);
			
		}
		//6
		else if (i==casillas.length-1 && j == 0) {
			//System.out.println ("CONDICIONAL 6");
			escribePropia (i,j);
			escribeDerecha (i,j);
			escribeArriba (i,j);
		}
		//7
		else if (i==casillas.length-1 && j== casillas.length-1) {
			//System.out.println ("CONDICIONAL 7");
			escribePropia (i,j);
			escribeArriba (i,j);
			escribeIzquierda (i,j);
		}
		else if (i==casillas.length-1 && j>=0 && j<casillas.length-1) {
			//System.out.println ("CONDICIONAL 8");
			escribePropia (i,j);
			escribeArriba (i,j);
			escribeDerecha (i,j);
			escribeIzquierda (i,j);
		}
		else if (i==0 && j>=0 && j<casillas.length-1 ) {
			//System.out.println ("CONDICIONAL 9");
			escribePropia (i,j);
			escribeAbajo (i,j);
			escribeDerecha (i,j);
			escribeIzquierda (i,j);
		}
		else if (i==777&&j==777) {
			
		return true;
			
		} else {
			System.out.println ("Parámetro fuera de rango.");
			
		}
		
		return false;
		
		
	}
	
	/**
	 * Método para escribir a la derecha.
	 * @param i
	 * @param j
	 */
	
	public void escribeDerecha (int i, int j) {
		
		if (casillas [i] [j+1] == true) {
			casillas [i] [j+1] = false;
		}
		else {
			casillas [i] [j+1] = true;
		}
		
	}
	

	/**
	 * Método para escribir a la izquierda.
	 * @param i
	 * @param j
	 */
	
	public void escribeIzquierda (int i, int j) {
		
		if (casillas [i] [j-1] == true) {
			casillas [i] [j-1] = false;
		}
		else {
			casillas [i] [j-1] = true;
		}
		
	}
	

	/**
	 * Método para escribir arriba.
	 * @param i
	 * @param j
	 */
	
	public void escribeArriba (int i, int j) {
		
		if (casillas [i-1] [j] == true) {
			casillas [i-1] [j] = false;
		}
		else {
			casillas [i-1] [j] = true;
		}
		
	}
	
	/**
	 * Método para escribir abajo.
	 * @param i
	 * @param j
	 */
	
	public  void escribeAbajo (int i, int j) {
		
		if (casillas [i+1] [j] == true) {
			casillas [i+1] [j] = false;
		}
		else {
			casillas [i+1] [j] = true;
		}
		
		
		
	}
	
	/**
	 * Método para escribir la propia casilla.
	 * @param i
	 * @param j
	 */
	
	public void escribePropia (int i, int j) {
		
		if (casillas [i] [j] == true) {
			casillas [i] [j] = false;
		}
		else {
			casillas [i] [j] = true;
		}
		
		
	}
	
	/**
	 * El comprobador verifica si el jugador ha ganado o no la partida. 
	 * @return
	 */
	
	public boolean comprobador () {
		
		boolean ganador = true;
		
		for (int i=0; i<casillas.length; i++) {
			for (int j=0; j<casillas.length; j++) {
				
				if (casillas [i] [j] == false) {
					ganador = false; 
				}
				
			}
		}
		
		return ganador;
	}
	
	
	
	
//	 MÉTODOS: GET Y SET 
	
	
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}


	
	
	
	

	
	

}
