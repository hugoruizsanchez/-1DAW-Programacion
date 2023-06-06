
package Principal;

import java.util.Scanner;

public class Principal {
    
     public static int indiceCocheMBarato (Vehiculo automoviles[]) { // Nos devolverá el índice (i)del coche mas barato
          // Entre paréntesis, el argumento, lo que vamos a enviarle al static para que procese. 
        /*La directiva static permite el acceso a métodos y variables de clase sin la 
         necesidad de instanciar un objeto de dicha clase, permitiendo la inicialización 
         de forma cómoda y durante la carga de clase. */
        
         float preciomenor; 
         int indice = 0; 
         
         preciomenor = automoviles [0].getPrecio(); // El precio del primer automovil, sera la primera referencia. 
         // i=1 porque ya hemos abarcado el primer término del array (0).
         
         for (int i=1; i<automoviles.length; i++) {
         
             if (automoviles [i].getPrecio()<preciomenor){
                 
                 preciomenor = automoviles [i].getPrecio ();
                 indice = i;
                 
             }            
     }
         
return indice;    

/*

Esta public static int compara el precio de cada uno de los automóviles tomando
de referencia el primer valor (indice 0) que asume desde el principio como el menor.

Conforme aparecen valores inferiores, la variable índice se reasigna gracias a la 
actualización de la variable "preciomenor"


*/         
     }
    
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
         
        String marca, modelo; 
        int precio, indiceBarato; 
        int numeroVehiculos; 
        
        System.out.print ("Número de vehículos a registrar: ");
        numeroVehiculos = entrada.nextInt ();
        
        Vehiculo automoviles[] = new Vehiculo[numeroVehiculos]; // Creamos un array para guardar todos los vehículos. 
        
        for (int i =0; i<numeroVehiculos; i++) { // puede ponerse automoviles.length en el centro
            
          System.out.println ("\nEscriba las características del coche "+(i+1)+":");
          System.out.print ("\nMarca: "); marca = entrada.next();
          System.out.print ("Modelo: "); modelo = entrada.next();
          System.out.print ("Precio: "); precio = entrada.nextInt();
          
          automoviles [i] = new Vehiculo (marca, modelo, precio);
          
          // Los valores del objeto se registran e introducen un un bucle que se repite dependiendo el número de vehículos.
          
        }
        
        System.out.println ("\nEl coche más barato tiene las siguientes características:\n");
        
        indiceBarato = indiceCocheMBarato (automoviles);
        
        automoviles [indiceBarato].mostrarDatos();
        
        
        
        
         
     }
}
