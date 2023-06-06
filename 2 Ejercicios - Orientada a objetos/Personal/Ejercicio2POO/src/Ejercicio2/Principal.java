
package Ejercicio2;

import java.util.Scanner;


public class Principal {
    
       public static void main(String[] args) {
           
           Scanner entrada = new Scanner (System.in);
           int x,y, incremento;
           String comando= "Hola";
           Tablero t1;
           
           
           System.out.print ("Introduzca coordenada X: "); x = entrada.nextInt ();
           System.out.println ();
           System.out.print ("Introduzca la coordenada Y: "); y = entrada.nextInt ();
           
           t1 = new Tablero (x,y); 
           
           while (!comando.equals("CERRAR")) {
               
               
               System.out.println ("Posición X: "+t1.getX()+". Posición Y: "+t1.getY()+".");
               
               System.out.print ("Seleccione: 'ARRIBA', 'ABAJO', 'IZQUIERDA', 'DERECHA' O 'CERRAR':");
           
               comando = entrada.next();
               
               if (comando.equals ("ARRIBA")) {
                   
                   System.out.print ("Introduzca incremento: "); incremento = entrada.nextInt ();
                   
                   t1.moverArriba(incremento);
                   
               }
               
               if (comando.equals ("ABAJO")) {
                   
                   System.out.print ("Introduzca incremento: "); incremento = entrada.nextInt ();
                   
                   t1.moverAbajo(incremento);
                   
               }
               
               if (comando.equals ("DERECHA")) {
                   
                   System.out.print ("Introduzca incremento: "); incremento = entrada.nextInt ();
                   
                   t1.moverDerecha(incremento);
                   
               }
               
               if (comando.equals ("IZQUIERDA")) {
                   
                   System.out.print ("Introduzca incremento: "); incremento = entrada.nextInt ();
                   
                   t1.moverIzquierda(incremento);
                   
               }
               
               
           }
          
           
       }
    
}
