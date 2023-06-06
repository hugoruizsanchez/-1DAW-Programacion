package polimorfismo_;

public class VehiculoTurismo extends Vehiculo {
    
    // ATRIBUTOS
    
    private int numeroPuertas;
            
    // CONSTRUCTOR
    
    public VehiculoTurismo (String matricula, String marca, String modelo, int numeroPuertas) {
        super (matricula, marca, modelo); 
        this.numeroPuertas = numeroPuertas; 
    }  
        
    // MÉTODOS OVERRIDE 
    
    @Override
    public void mostrarDatos () {
        
    System.out.println ("Matrícula: "+matricula); 
    System.out.println ("Marca: "+marca); 
    System.out.println ("Matrícula: "+modelo); 
    System.out.println ("Número de puertas: "+numeroPuertas);
        
    }
       
         
    
    
}
