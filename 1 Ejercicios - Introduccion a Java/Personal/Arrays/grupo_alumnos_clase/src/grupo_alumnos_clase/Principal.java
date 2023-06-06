package grupo_alumnos_clase;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 
		
		/* PROGRAMA GESTIONAR NOTAS DE UNA CLASE.
		-> 	Cada clase está compuesta por cinco alumnos.
		-> Se pide leer las notas del primer, segundo y tercer trimestre de cada alumno de un grupo.
		-> Mostrar al final: nota media del grupo en cada trimestre, media del alumno en la posición N. 
       */
		
		Scanner entrada = new Scanner (System.in);
		String [] nombre = new String [5];
		float [] nota = new float [15];

		System.out.println ("| PROGRAMA PARA GESTIONAR LAS NOTAS DE UNA CLASE |");
		System.out.println ();
		
		// PREGUNTAR LOS NOMBRES
		
		for (int i=0; i<5; i++) {
			
			System.out.print("Introduzca el nombre del alumno "+(i+1)+": ");
			nombre [i] = entrada.next();
			
		}
		
		// ASIGNAR LAS NOTAS A CADA NOMBRE: 
		
		int contador=0;
		
		for (int i=0; i<5; i++) {
			System.out.println ();
			System.out.println("Notas de "+nombre[i]+" ("+(i+1)+"):");
			
			for (int j=0; j<3; j++) {
				
			 System.out.print ((j+1)+"º trimestre: "); nota [contador+j] = entrada.nextFloat();
			 }
			
			contador = contador +3;
			
		} 
		
		
		// CÁLCULO DE LAS MEDIAS.
		
		float media1=0;
		System.out.print ("Media del primer trimestre: ");
		
		for (int i=0; i<15; i=i+3) {
			
			media1= nota[i]+media1;
		}
		
		System.out.print(media1/5);
		System.out.println ();
		
		float media2=0;
		System.out.print ("Media del segundo trimestre: ");
		
		for (int i=1; i<15; i=i+3) {
			
			media2= nota[i]+media2;
		}
		
		System.out.print(media2/5);
		System.out.println ();
		
		float media3=0;
		System.out.print ("Media del tercer trimestre: ");
		
		for (int i=2; i<15; i=i+3) {
			
			media3= nota[i]+media3;
		}
		
		System.out.print(media3/5);
		System.out.println ();
		
		// CÁLCULO DE LA MEDIA DE UN ALUMNO CONCRETO.
		
		int alumno=0;
		float mediaAlumno=0;
		
		
		
		System.out.print ("Introduzca el número de alumno para saber la media que desea:"); 
		while (alumno<16) {
			
		alumno = entrada.nextInt(); alumno--;
	
		
		
		for (int i=(alumno+2); i>=alumno; i--) {
			
			mediaAlumno= nota[i] + mediaAlumno;
			
		}
		
		System.out.print("La nota media es: "+mediaAlumno/3);
		mediaAlumno=0;
		}
		
		

	}

}
