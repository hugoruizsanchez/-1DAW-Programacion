
package polimorfismo_;


public class Vehiculo {
    
    // ATRIBUTOS
    
    protected String matricula; 
    protected String marca; 
    protected String modelo; 
    
    // CONSTRUCTOR 

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // MÉTODOS 
    
    public void mostrarDatos () {
        
        System.out.println ("Matrícula: "+matricula); 
        System.out.println ("Marca: "+marca); 
        System.out.println ("Matrícula: "+modelo); 
        
    }
    
    
    
    
    
    
    
    
}
