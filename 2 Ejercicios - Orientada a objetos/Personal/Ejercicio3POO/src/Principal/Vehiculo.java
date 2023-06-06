
package Principal;

public class Vehiculo {
    
    // ATRIBUTOS
    
    private String marca;
    private String modelo;
    private float precio; 
    
    // CONSTRUCTORES
    
    public Vehiculo (String marca, String modelo, float precio) {
        
        this.marca = marca;
        this.modelo = modelo; 
        this.precio = precio;
        
    }
    
    // MËTODOS
    
    public float getPrecio () {
      
        return precio;
        
    }
    
    public void mostrarDatos () {
        
        System.out.println ("Marca: "+marca+".");
        System.out.println ("Modelo: "+modelo+".");
        System.out.println ("Precio: "+precio+".");
        
    }
    
}
