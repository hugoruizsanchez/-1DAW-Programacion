package polimorfismo_;

public class VehiculoFurgoneta extends Vehiculo {
    
    // ATRIBUTOS
    
    private int carga; 
    
    // CONSTRUCTOR
    
    public VehiculoFurgoneta (String matricula, String marca, String modelo, int carga) {
        super (matricula, marca, modelo);
        this.carga = carga;
    }
    
    // MÉTODOS OVERRIDE
    
    @Override
    public void mostrarDatos () {
        
        System.out.println ("Matrícula: "+matricula); 
        System.out.println ("Marca: "+marca); 
        System.out.println ("Matrícula: "+modelo); 
        System.out.println ("Carga: "+carga);
        
    }
    
}
