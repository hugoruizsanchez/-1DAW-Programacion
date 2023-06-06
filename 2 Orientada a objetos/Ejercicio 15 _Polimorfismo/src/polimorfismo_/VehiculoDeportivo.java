
package polimorfismo_;

public class VehiculoDeportivo extends Vehiculo {
    
    // ATRIBUTOS
    
    private int cilindrada; 
    
    
    // CONSTRUCTOR 
    
    public VehiculoDeportivo (String matricula, String marca, String modelo, int cilindrada) {
    
        super (matricula, marca, modelo);
        
        this.cilindrada = cilindrada; 
        
    }
    
    // MÉTODOS OVERRIDE (SOBREESCRITURA) 
    
    @Override
    public void mostrarDatos () {
        
        System.out.println ("Matrícula: "+matricula); 
        System.out.println ("Marca: "+marca); 
        System.out.println ("Matrícula: "+modelo); 
        System.out.println ("Cilindrada: "+cilindrada);
        
    }
    
}
