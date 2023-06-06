package tresenraya;

import java.util.Scanner;

public class Juego {
	
	// ATRIBUTOS
	
	Scanner entrada = new Scanner (System.in); // -> Escáner: para leer la entrada. 
	private char [] [] tablero = {	// -> Tablero 3x3, con líneas. 
			
			{'-','-', '-' },
			{'-','-', '-' },
			{'-','-', '-' },
			
	};
	
	private String [] seleccion = {"Jugador VS Jugador", "Jugador VS Máquina"}; 
	private Menu menu = new Menu (seleccion); // El menú, que necesita de una selección -> la de arriba. 
	// Es una "variable" menú, con la selección determinada.
	
	// CONSTRUCTORES // El método constructor del juego:no necesita ningún parámetro de creación. 
	
	public Juego () {
	
	}
	
	// MÉTODOS 
	
	// Para poder llamar a la Seleccion y mostrar la elección dada por el usuario.
	public String[] getSeleccion() {
		return seleccion;
	}

	// Opción para proyectar el menú en pantalla. 
	
	public void mostrarMenu () {
		menu.setTitulo("Videojuego: tres en raya"); // Se llama a la clase "menu" para  cambiar el titulo.
		menu.mostrarMenu(); // Se llama a la clase "menu" para mostrar la configuración en pantalla. 
		
	}
	
	// Opción para llamar a la selección.
	


	public int eligeOpcion () {
		
	return	menu.eligeOpcion(); // Se llama a la clase "menu" para llamar al seleccionador de opciones. 
		
	}
	
	// Opción para mostrar el tablero. 
	
	public void mostrarTablero () {
		
	// Bucle "for" que imprime las posiciones actuales del tablero. 	
		
		System.out.println ("El tablero actualmente es el siguiente:");
		
		for (int i=0; i<3; i++) {
		
			for (int j=0; j<3; j++) {
				
				System.out.print (tablero[i][j]);
			}
			
			System.out.println();
			
		}
		
		
	}
	
	/*
	
	La clase pintarTablero se encarga de escribir sobre el array "tablero", asimismo, analiza
	la entrada para prevenir errores en la ejecución del juego - sobreescribir posiciones - y 
    controlar el final del juego. 
    
    -> Devuelve un dato ENTERO, con tres posiciones:
    
    - 0 -> Sobreescritura de un dato escrito previamente por otro jugador. Invalida la acción. 
    - 1 -> Escritura del archivo correcta. 
     -2 -> Uno de los jugadores escribe la secuencia de finalizar juego. 
	
	*/
	
	public int pintarTablero (int a, int b, char c) {
		
		if (a==0 & b==0) {
			
			System.out.println ("Partida finalizada.");
			
			return 2;
			
		}
		else {
		
		if (tablero [a-1] [b-1] == '-' ) {
			
			tablero [a-1] [b-1] = c;

			return 1;
			
		}
		
		else  {
			
			System.out.println ("Acción denegada por 'pintarTablero': coordenada ocupada.");
			
			return 0; 
		
	
		}
		}
		
	}
	
	
	// Método para solicitar los datos del turno, hace un return de un array que se descompone en el
	// principal. 
	
	public int [] solicitarDatosTurno () {
		
		int [] a = new int [2];
		
		System.out.print("Introduzca FILA:");  a [0] = entrada.nextInt();
		System.out.print("Introduzca COLUMNA:"); a [1] = entrada.nextInt();
		
		return a;
	}
	
	/* El método comprobador analiza el estado del tablero en cada jugada, dada la casuística clásica
	del 3 en raya: si los horizontales, verticales y diagonales están ocupados. 
	
	Cuenta con tres estados: 
	- 0 -> Nadie ha ganado la partida. 
	- 1 -> El jugador 1 ha ganado la partida. 
	- 2 -> El jugador 2 ha ganado la partida. 
	
	
	*/
	public int comprobador () {
		
		int turno =0;
		// HORIZONTALES 
		
		//////////////////////////////////////////
		
		
		if (tablero [0] [0] == 'O' & tablero [0] [1] == 'O' & tablero [0] [2] == 'O') {
		turno = 1;
		} 
		
		
		else if (tablero [1] [0] == 'O' & tablero [1] [1] == 'O' & tablero [1] [2] == 'O') {
		turno = 1;
		}
		
		else if (tablero [2] [0] == 'O' & tablero [2] [1] == 'O' & tablero [2] [2] == 'O') {
		turno = 1;
		}
		
		////////////////////////////////////////////// 
		
		else if (tablero [0] [0] == 'X' & tablero [0] [1] == 'X' & tablero [0] [2] == 'X') {
		turno = 2;
		} 
		
		else if (tablero [1] [0] == 'X' & tablero [1] [1] == 'X' & tablero [1] [2] == 'X') {
		turno = 2;
		}
		
		
		else if (tablero [2] [0] == 'X' & tablero [2] [1] == 'X' & tablero [2] [2] == 'X') {
		turno = 2;
		}
				
		// VERTICALES
		
		else if (tablero [0] [0] == 'O' & tablero [1] [0] == 'O' & tablero [2] [0] == 'O') {
		turno = 1;
		} 
		
		
		else if (tablero [0] [1] == 'O' & tablero [1] [1] == 'O' & tablero [2] [1] == 'O') {
		turno = 1;
		}
		
		else if (tablero [0] [2] == 'O' & tablero [1] [2] == 'O' & tablero [2] [2] == 'O') {
		turno = 1;
		}
		
		//////////////////////////////
		
		else if (tablero [0] [0] == 'X' & tablero [1] [0] == 'X' & tablero [2] [0] == 'X') {
		turno = 2;
		} 
		
		
		else if (tablero [0] [1] == 'X' & tablero [1] [1] == 'X' & tablero [2] [1] == 'X') {
		turno = 2;
		}
		
		else if (tablero [0] [2] == 'X' & tablero [1] [2] == 'X' & tablero [2] [2] == 'X') {
		turno = 2;
		}
		
		// DIAGONALES 
		
		else if (tablero [0] [0] == 'O' & tablero [1] [1] == 'O' & tablero [2] [2] == 'O') {
		turno = 1;
		} 
		
		
		else if (tablero [2] [0] == 'O' & tablero [1] [1] == 'O' & tablero [0] [2] == 'O') {
		turno = 1;
		}
		
		//////////////////////////
		
		else if (tablero [0] [0] == 'X' & tablero [1] [1] == 'X' & tablero [2] [2] == 'X') {
		turno = 2;
		} 
		
		
		else if (tablero [2] [0] == 'X' & tablero [1] [1] == 'X' & tablero [0] [2] == 'X') {
		turno = 2;
		}
		
		
		return turno;
		
		
		
	}
	
	// Método limpiar tablero: el tablero se rellena con "-". 
	
	public void limpiarTablero () {

		for (int i =0; i<3; i++) {
			for (int j=0; j<3; j++) {
				tablero [i] [j] = '-';
			}
		}
		
	}


}
