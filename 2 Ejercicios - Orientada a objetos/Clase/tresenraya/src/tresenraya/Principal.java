package tresenraya;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		// Scanner que servirá para la entrada. 
		
		Scanner entrada = new Scanner (System.in);
		
		/* El estadoPintarTablero es la variable que deposita la función "pintarTablero", empieza
		   en "2" (véase: comentarios de "juego") dado que esta es la posición de juego  finalizado. */
		
		
		int estadoPintarTablero = 2;
		
		/* Array que deposita la función "solicitarDatosTurno". Al llamar a la variable junto con la 
		clase, se solicitan los datos necesarios. */
		
		int [] coordenada = new int [2];
		
		// Variable que deposita la funcion "eligeOpcion" del menú.
		
		int eleccionmenu = 0;
		
		// Método constructor del juego, en este caso, "j1". 
		
		Juego j1 = new Juego ();
		
		
		// Mientras el juego esté en estado finalizado (2), el menú de opciones se mostrará en bucle. 
	
		    while (estadoPintarTablero == 2) {  
		
		/* Una vez iniciado el bucle, el estadoPintarTablero se dispone en un modo distinto para
		 facilitar el funcionamiento del programa. */
		
		    	estadoPintarTablero =0;
		    	
		/* Se procede al muestreo del menú y a adjuntar el correspondiente método para 
		 procesar la selección - puesto que pensé en agregar más opciones al programa, he usado
		 un switch. */
		    	
		    j1.mostrarMenu();
			eleccionmenu = j1.eligeOpcion();
			System.out.println ("Has elegido la opcion "+j1.getSeleccion() [eleccionmenu-1]+".");
			
			switch (eleccionmenu) {
		
			case 1: 
			
		// Instrucciones el programa e información de utilidad sobre el juego: 
	
				System.out.println ();
				System.out.println ("Si desea abandonar el juego, introduzca F=0, C=0 en cualquier turno.");
				System.out.println ("Entradas de cada jugador:");
				System.out.println ("Jugador 1 (J1): 'O'");
				System.out.println ("Jugador 2 (J2): 'X'");
		
		// Proyección del tablero en pantalla antes de iniciar la partida, previo limpiado. 
				
				j1.limpiarTablero();
				j1.mostrarTablero();
				
		/* El contador es una variable fundamental para organizar los turnos. 
	    
	     - Se empleará de referencia para que, si el método pintarTablero invalida la acción (1) , no avance 
	     y el jugador pueda corregir su turno gracias a un condicional "if" . 	 */
				
				int contador =0;
				
		// Mientras el estadoPintarTablero no sea 2, se reproducirá el juego.

				
				while (estadoPintarTablero != 2) {
				
					
		/* Dependiendo de  si el contador es par - jugador 1 - o impar - jugador 2 - se alternarán los turnos por medio
		 de un condicional "if".   */
				
					if (contador%2==0) {
					System.out.println ("Turno del jugador 1:");
					coordenada = j1.solicitarDatosTurno();	
					
					// Se llama al proceso pintarTablero y se guarda el registro en estadoPintarTablero
					
					estadoPintarTablero = j1.pintarTablero(coordenada [0], coordenada [1], 'O');
					
					// Si el programa NO ha tenido errores (0) -> contador avanza, pasa el turno. 
					
					if (estadoPintarTablero !=0) {
						contador++;
					}
					
					// Si el programa detecta la finalización del proceso, NO muestra el tablero. 
					
					if (estadoPintarTablero !=2) {
						j1.mostrarTablero();
					}
					else {
						
					}
					
					/* Si el método comprobador verifica algún caso de victoria para el jugador 1 , 
					se envía un mensaje y el programa se finaliza (2).  */
					
					if (j1.comprobador() == 1) {
						System.out.println ("El jugador 1 ha ganado, enhorabuena. ");
						estadoPintarTablero =2; 
						
					}
					
					//Si el contador detecta el límite de 9 jugadas que el tablero puede soportar, se declara el empate.  
					
					if (contador >= 9) {
						estadoPintarTablero =2;
						System.out.println ("Empate.");
						
					}
						
				}
				
				else {
					System.out.println ("Turno del jugador 2:");
	
					coordenada = j1.solicitarDatosTurno();
					estadoPintarTablero = j1.pintarTablero(coordenada [0], coordenada [1], 'X');
					
					
					if (estadoPintarTablero !=0) {
						contador++;
					}
					
					if (estadoPintarTablero !=2) {
						j1.mostrarTablero();
					}
					else {
						
					}
					
					if (j1.comprobador() == 2) {
						System.out.println ("El jugador 2 ha ganado, enhorabuena. ");
						estadoPintarTablero =2; 
					}
					
					if (contador >= 9) {
						estadoPintarTablero =2;
						System.out.println ("Empate.");
						
					}
					
				}
				
					
				}

			break;
			
			case 2: 

				System.out.println ();
				System.out.println ("Si desea abandonar el juego, introduzca F=0, C=0 en cualquier turno.");
				System.out.println ("Entradas de cada jugador:");
				System.out.println ("Jugador 1 (J1): 'O'");
				System.out.println ("Máquina (M1): 'X'");
				
				j1.limpiarTablero();
				j1.mostrarTablero();
				
				contador = 0;
				
				while (estadoPintarTablero != 2) {
					
			    	estadoPintarTablero =0;
			    	
			    	if (contador%2==0) {
			    		
			    		System.out.println ("Turno del jugador 1:");
			    		
			    		coordenada = j1.solicitarDatosTurno();	

						estadoPintarTablero = j1.pintarTablero(coordenada [0], coordenada [1], 'O');
						
						if (estadoPintarTablero !=0) {
							contador++;
						}
						
						if (estadoPintarTablero !=2) {
							j1.mostrarTablero();
						}
						else {
							
						}
						
						if (j1.comprobador() == 1) {
							System.out.println ("El jugador 1 ha ganado, enhorabuena. ");
							estadoPintarTablero =2; 
							
						}
						
						//Si el contador detecta el límite de 9 jugadas que el tablero puede soportar, se declara el empate.  
						
						if (contador >= 9) {
							estadoPintarTablero =2;
							System.out.println ("Empate.");
							
						}
							
			    		
			    	}
			    	else {
			    		
			    		System.out.println ("Turno de la máquina:");
			    		
                                        estadoPintarTablero =0;
                                        
                                        while (estadoPintarTablero != 1) {
                                        
			    		estadoPintarTablero = j1.pintarTablero((int)(Math.random()*3+1), (int)(Math.random()*3+1), 'X');
			    		
                                        }
                                        
                                        if (estadoPintarTablero !=0) {
							contador++;
						}
						
					if (estadoPintarTablero !=2) {
							j1.mostrarTablero();
						}
					else {
							
                                        }
						
						if (j1.comprobador() == 2) {
							System.out.println ("La maquina ha ganado ¡lo siento! ");
							estadoPintarTablero =2; 
							
						}
						
						//Si el contador detecta el límite de 9 jugadas que el tablero puede soportar, se declara el empate.  
						
						if (contador >= 9) {
							estadoPintarTablero =2;
							System.out.println ("Empate.");
							
						}
			    		
			    	}
					
					
				}
				
			break;
			


			}

	}
		
	}

}