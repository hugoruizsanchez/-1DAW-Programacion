public class Principal {

	public static void main(String[] args) {

		
		// DECLARACIÓN DE LAS VARIABLES 
		
		int jugador1 =0; int jugador2 =0; 
		
		final char A = 'A'; 
		final char B = 'B'; 
		final char C = 'C'; 
		final char Y = 'Y'; 
		final char X = 'X'; 
		final char Z = 'Z'; 
		boolean error = false;

		
/* ***************************************************************************************** \*
╦═╗╔═╗╦  ╦  ╔═╗╔╗╔╔═╗  ╔═╗╦    ╔═╗╦═╗╦═╗╔═╗╦ ╦  ╔═╗╔═╗╔╗╔  ╦  ╔═╗╔═╗  ╔═╗╔═╗╦═╗╔╦╗╦╔╦╗╔═╗╔═╗
╠╦╝║╣ ║  ║  ║╣ ║║║╠═╣  ║╣ ║    ╠═╣╠╦╝╠╦╝╠═╣╚╦╝  ║  ║ ║║║║  ║  ╠═╣╚═╗  ╠═╝╠═╣╠╦╝ ║ ║ ║║╠═╣╚═╗
╩╚═╚═╝╩═╝╩═╝╚═╝╝╚╝╩ ╩  ╚═╝╩═╝  ╩ ╩╩╚═╩╚═╩ ╩ ╩   ╚═╝╚═╝╝╚╝  ╩═╝╩ ╩╚═╝  ╩  ╩ ╩╩╚═ ╩ ╩═╩╝╩ ╩╚═╝
/* ***************************************************************************************** \*
		
		-> INDICACIONES DE USO: 
		
		JUGADOR 1 
		---------
		A - PIEDRA 
		B - PAPEL 
		C - TIJERAS 
		
		JUGADOR 2 
		---------
		X - PIEDRA
		Y- PAPEL 
		Z - TIJERAS
		
		EJEMPLO 
		---------
		{'A','X'}, // PIEDRA - PIEDRA
		{'B','Y'}, // PAPEL - PAPEL
		{'C','Z'}, // TIJERA - TIJERA
		{'A','Y'}, // PIEDRA - PAPEL
		{'A','Z'}, // PIEDRA - TIJERA
		{'B','X'}, // PAPEL - PIEDRA
		{'B','Z'}, // PAPEL - TIJERA
		{'C','X'}, // TIJERA - PIEDRA
		{'C','Z'}  // TIJERA - PAPEL 
		
		
*/			
		char jugadas [][] = {  
	
				{A, X},
				{A, X},
				{A, Z},
				{B, X},
				{A, X},
				{B, Z},
				{A, X},
				{A, X},
				{A, X},
				{A, X},
				{C, Z},
				{C, Y},
				{A, X},
				{A, X},
				{A, Z},
				{C, Y},
				{A, Z},
				{B, Y},
				{C, Z},
				{A, X},
				{B, Y},
				{C, X},
				{C, Z},
				{C, Y},
				{A, Y},
				{B, X},
				{B, X},
				{A, X},
				{B, X},
				{A, X},
				{2, 1},
				{2, 1},
				{2, 1},
				{B, Z},
				{C, Y},
				{A, X},
				{A, X},
				{C, Z},
				{A, Z},
				{A, X},
				{B, X},
				{B, X},
				{A, X},
				{B, X},
				{B, Y},
				{A, X},
				{A, X},
				{A, Z},
				{A, Y},
				{C, Y},
				{A, Z},
				{C, Z},
				{C, Y},
				{A, Z},
				{A, X},
				{B, Z},
				{A, X},
				{C, Y},
				{B, Z},
				{C, Y},
				{A, X},
				{A, Y},
				{C, Y},
				{A, Z}
				
		};
		
		int contadorE =0;
		int [] errores = new int [jugadas.length*2];
		
		// PRUEBA
		
		System.out.println ("DEFINICIÓN DEL POSICIONAMIENTO EN EL ARRAY:");
		
		
		for (int i=0; i<jugadas.length; i++) {
			
			for (int j =0; j<2; j++) {
		
				System.out.print (jugadas [i][j]); 
				System.out.print("-->"+"["+i+"]"+"["+j+"]");
				System.out.println ();
				
				
			}

		}
		
		//	CÁLCULO
		
		System.out.println ("PRUEBA DE CÁLCULO:");
		System.out.println ("P1     P2");
		
	for (int i=0; i<jugadas.length; i++) {
			
			for (int j =0; j<1; j++) {
				
				System.out.println(jugadas [i] [j] +"  VS  " + jugadas [i] [j+1]);
				
			if (jugadas [i][j] == 'A' && jugadas [i][j+1]== 'Y') { // PIEDRA VS PAPEL (ganador PAPEL -j2)
				
				jugador1 = jugador1 + 1 + 0;
				jugador2 = jugador2 + 2 + 6;
				
				System.out.println ("JUGADOR 2 GANADOR");
				
			}
			else if (jugadas [i][j] == 'B' && jugadas [i][j+1]== 'X' ) { // PAPEL VS PIEDRA (perdedor PAPEL - j1
				
				jugador1 = jugador1 + 2 + 6;
				jugador2 = jugador2 + 1 + 0;
				
				System.out.println ("JUGADOR 2 PERDEDOR"); 
				
			} 
			else if (jugadas [i][j] == 'C' && jugadas [i][j+1]== 'Z' ) { // TIJERAS VS TIJERAS (empate)

				jugador1 = jugador1 + 3 + 3;
				jugador2 = jugador2 + 3 + 3;
				
				System.out.println ("EMPATE");
	
		    }
			
			else if (jugadas [i][j] == 'B' && jugadas [i][j+1]== 'Y') { // PAPEL VS PAPEL (empate)
				
				System.out.println ("EMPATE");
				
				jugador1 = jugador1 + 2 + 3;
				jugador2 = jugador2 + 2 + 3;
				
			}
			else if (jugadas [i][j] == 'A' && jugadas [i][j+1]== 'X') { // PIEDRA VS PIEDRA (empate)
				
				System.out.println ("EMPATE");
				
				jugador1 = jugador1 + 1 + 3;
				jugador2 = jugador2 + 1 + 3;
				
			}
			else if (jugadas [i][j] == 'A' && jugadas [i][j+1]== 'Z') { // PIEDRA VS TIJERA (perdedor)
			
				jugador1 = jugador1 + 1 + 6;
				jugador2 = jugador2 + 3 + 0;
				
				System.out.println ("JUGADOR 2 PERDEDOR");
		
			}
			else if (jugadas [i][j] == 'C' && jugadas [i][j+1]== 'X') { // TIJERA VS PIEDRA (ganador)
				
				jugador1 = jugador1 + 3 + 0;
				jugador2 = jugador2 + 1 + 6;
				
				System.out.println ("JUGADOR 2 GANADOR");
				
			}
			else if (jugadas [i][j] == 'C' && jugadas [i][j+1]== 'Y') { // TIJERA VS PAPEL (perdedor)
				
				jugador1 = jugador1 + 3 + 6;
				jugador2 = jugador2 + 2 + 0;
				
				System.out.println ("JUGADOR 2 PERDEDOR");
				
			}
			else if (jugadas [i][j] == 'B' && jugadas [i][j+1]== 'Z') {// PAPEL VS TIJERA 
				
				jugador1 = jugador1 + 2 + 0;
				jugador2 = jugador2 + 3 + 6;
				
				System.out.println ("JUGADOR 2 GANADOR");
			}
			else  {
				
		System.out.println ("ERROR 000: Formato incorrecto, revise referencia final.");
		  contadorE++;
		  errores [contadorE] = i;
		  contadorE++;
		  errores [contadorE] = j;
		   
			}
	}

	}
	System.out.println ();
	System.out.println ("RESULTADOS DE PARTIDA");
	System.out.println ("-----------------------");
	System.out.println ("Numero de rondas: "+jugadas.length+".");
	System.out.println ("-----------------------");
	System.out.println ("TABLA DE PUNTUACIONES::");
	System.out.println ("Jugador 1: "+jugador1+ " | Jugador 2: "+jugador2+".");
	
	if (jugador1==jugador2) {
		System.out.println ("Ambos jugadores han empatado.");
	}
	else if (jugador1>jugador2) {
		System.out.println ("El jugador 1 ha ganado.");
	}
	else {
		System.out.println ("El jugador 2 ha ganado.");
	}
	System.out.println ("-----------------------");
	if (error =true) {
		
		System.out.println ("CÓDIGO DE ERROR 000: Se han omitido "+contadorE/2+ " entradas debido a una incorrección de formato:");
	
		System.out.println ();
		for (int i=1; i<contadorE; i++) {
			System.out.print (" Revise fila: ["+errores [i]+"]" + "["+ errores [i+1]+"]");
			i++;
			System.out.println ();
			
		}
		System.out.println ();
	System.out.println ("-----------------------");
		
	}
	
	}
    }