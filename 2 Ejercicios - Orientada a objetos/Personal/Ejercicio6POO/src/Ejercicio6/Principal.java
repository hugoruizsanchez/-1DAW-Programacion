
package Ejercicio6;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
 
        Scanner entrada = new Scanner (System.in);
       
        int seleccion =0, seleccion2=0, entero=0;
        double a,b; 
        NumeroComplejo n1, n2, multiplicacion, suma;
 
       System.out.println ("Numero complejo 1:");
       System.out.print (" Introduzca valor real ('a'): "); a = entrada.nextDouble();
       System.out.print (" Introduzca valor imaginario ('b'): "); b = entrada.nextDouble();
        
       n1 = new NumeroComplejo (a,b);
       
       System.out.println ("Numero complejo 2:");
       System.out.print (" Introduzca valor real ('a'): "); a = entrada.nextDouble();
       System.out.print (" Introduzca valor imaginario ('b'): "); b = entrada.nextDouble();
        
       n2 = new NumeroComplejo (a,b);
       
       System.out.println ();
       
       while (seleccion!=5){ 
       
       System.out.println ("1. Sumar dos números complejos.");
       System.out.println ("2. Multiplicar 2 números complejos.");
       System.out.println ("3. Comparar 2 números complejos.");
       System.out.println ("4. Multiplicar número complejo por un entero.");
       System.out.println ("5. Finalizar el programa.");
       System.out.println ();
       System.out.print ("Introduzca selección: "); seleccion = entrada.nextInt();
       switch (seleccion) {
            
           case 1: 
               System.out.println ();
               System.out.println ("La suma resultante entre los dos números complejos es:");
               suma = n1.calcularSuma(n2);
               System.out.println ("Numero real ('a'): "+suma.getA()+".");
               System.out.println ("Numero imaginario ('b'): "+suma.getB()+".");
               System.out.println ();
               
           break;
           case 2: 
               System.out.println ();
               System.out.println ("La multiplicación resultante entre los dos números complejos es:");
                multiplicacion = n1.calcularProducto(n2);
                System.out.println ("Numero real ('a'): "+multiplicacion.getA()+".");
                System.out.println ("Numero imaginario ('b'): "+multiplicacion.getB()+".");
                System.out.println ();
           break;
           case 3:
               System.out.println ();
               System.out.println ("La comparación entre ambos números complejos resulta en:");
               
               if (n1.comprobarIgualdad(n2)==false) {
                   System.out.println ("Los términos de los números complejos propuestos son DESIGUALES.");
               }
               else {
                   System.out.println ("Los términos de los números complejos propuestos son IGUALES.");
               }
               System.out.println ();
           break; 
           case 4: 
               System.out.println ();
               System.out.print ("Introduzca el número complejo que desea operar ('1' o '2'): ");
               
               seleccion2 = entrada.nextInt();
               
               switch (seleccion2) {
                   
                   case 1: System.out.print ("Ha seleccionado el número complejo '1'.\nIntroduzca el término que desea operar: ");
                   entero = entrada.nextInt();
                   multiplicacion = n1.calcularProductoEntero(entero); 
                   System.out.println ("La multiplicación resultante entre el número entero y el número complejo propuesto es:");
                   System.out.println ("Numero real ('a'): "+multiplicacion.getA()+".");
                   System.out.println ("Numero imaginario ('b'): "+multiplicacion.getB()+".");
                   break; 
                   case 2: System.out.print ("Ha seleccionado el número complejo '2'.\nIntroduzca el término que desea operar: ");
                   n2.calcularProductoEntero(entero);
                   break;
                   default: System.out.println ("Comando no registrado. Para finalizar el programa introduzca '5'.");
                   break;
               }
              System.out.println ();
               
           default: 
               System.out.println ();
               System.out.println ("Comando no registrado. Para finalizar el programa introduzca '5'.");
               System.out.println ();
               
           break; 
        }
        
       
       
       }
       
       System.out.println ("Programa finalizado. ");
        
    }
    
}

