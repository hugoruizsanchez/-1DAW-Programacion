
package polimorfismo_;


/*

El polimorfismo permite crear objetos a nombre de superclase, que contienen las 
propiedades de las distintas subclases. 

Por ejemplo, al crear un objeto VEHICULO este puede ser 

-> new Deportivo 
-> new Furgoneta 
-> new Turismo

Siendo polimórfico, dícese, de varias formas posibles. 
*/

public class Principal {

    public static void main(String[] args) {
        
        Vehiculo [] misVehiculos = new Vehiculo [4];
        
        misVehiculos [0] = new Vehiculo ("12345678", "Ferrari", "A89");
        misVehiculos [1] = new VehiculoTurismo ("87654321", "Audi", "P14", 4);
        misVehiculos [2] = new VehiculoDeportivo ("246810", "Toyota", "KJ8", 500); 
        misVehiculos [3] = new VehiculoFurgoneta ("359112", "Toyota", "JJ9", 2000); 
        
        // Puede hacerse con un bucle for: 
        
        System.out.println ("Bufle for: ");
        
       for (int i=0; i<misVehiculos.length; i++) {
           
           misVehiculos [i].mostrarDatos();
           System.out.println ();
           
       }
       
          // Puede hacerse con un bucle for each:  ----------INDIFERENTE PARA EL EJERCICIO
       
       System.out.println ("\n\n\nBufle for: ");
        
       for (Vehiculo i: misVehiculos) {
           i.mostrarDatos();
           System.out.println ();
       }

    }
    
}
