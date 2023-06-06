
package ejercicio4poo;

import java.util.Scanner;

public class Principal {
    
    public static int indiceGanador (Atleta participantes []) {
    
   float tiempomenor; 
   int indice =0; 
   
   tiempomenor = participantes [0].getTiempo();
   
   for (int i=1; i<participantes.length; i++) {
      
       if (participantes [i].getTiempo()<tiempomenor) {
           
           indice =i; 
           tiempomenor = participantes [i].getTiempo();
           
       }
       
   }
       return indice;  
}
    
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner (System.in);
       int ID, numero; 
       float tiempo; 
       String nombre; 
       
       
        
       System.out.print ("Introduzca el número de atletas que participan: "); 
       
       numero= entrada.nextInt ();
       
       Atleta participantes [] = new Atleta [numero];
       
       for (int i=0; i<numero; i++) {
           
           System.out.print ("\nParticipante número "+(i+1)+":");
           System.out.print ("\n Introduzca nombre: "); nombre = entrada.next ();
           System.out.print (" Introduzca ID: "); ID = entrada.nextInt ();       
           System.out.print (" Introduzca tiempo: "); tiempo = entrada.nextFloat ();
           
           participantes [i] = new Atleta (ID, nombre, tiempo);
           
       }
       
       System.out.println ("\nEl atleta ganador de la competición es:");
       
       int indiceGanador; 
       indiceGanador = indiceGanador (participantes);
       
       participantes [indiceGanador].mostrarDatos();
       
       
       
       
       
        
    }
    
}
