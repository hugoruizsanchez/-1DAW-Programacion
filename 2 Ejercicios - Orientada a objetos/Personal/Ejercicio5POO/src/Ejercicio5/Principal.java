package Ejercicio5;

import java.util.Scanner;


public class Principal {
    
    public static int indiceMayorSuperficie (Isosceles triangulos []) {

    int indice =0; 
    double mayorSuperficie = triangulos[0].calculoArea();
    
    for (int i=1; i<triangulos.length; i++) {
        
        if (triangulos[i].calculoArea()>mayorSuperficie) {
            
          indice = i; 
          mayorSuperficie = triangulos[i].calculoArea();
          
        }
    }

    return indice; 
}

    public static void main(String[] args) {
    
    int numeroTriangulos; 
    float a, b; 
    Scanner entrada = new Scanner (System.in);
    
    System.out.print ("Introduzca el número de triángulos a operar: ");
    numeroTriangulos = entrada.nextInt();
    
    Isosceles triangulos [] = new Isosceles [numeroTriangulos];
    
    for (int i=0; i<numeroTriangulos; i++) {
        
        System.out.println ("\nTriángulo "+(i+1)+":");
        
        System.out.print (" Introduzca los lados iguales (A): "); 
        a = entrada.nextFloat ();
        System.out.print (" Introduzca el lado dispar (B):");
        b = entrada. nextFloat ();
        
        triangulos [i] = new Isosceles (a,b);
             
    }
    
    System.out.println ("\nEl triángulo isóceles con mayor superficie es: ");
    
    int indiceMayorSuperficie = indiceMayorSuperficie (triangulos);
    
    triangulos[indiceMayorSuperficie].mostrarDatos();
    
    
    
   
    }
    
}
