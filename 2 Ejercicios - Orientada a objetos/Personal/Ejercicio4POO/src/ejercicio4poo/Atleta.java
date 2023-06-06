package ejercicio4poo;


public class Atleta {
    
    // ATRIBUTOS
    
    private int ID; 
    private String nombre; 
    private float tiempo; 
    
    // CONSTRUCTOR
    
    public Atleta (int ID, String nombre, float tiempo) {
        
        this.ID = ID; 
        this.nombre = nombre; 
        this.tiempo = tiempo;
        
    }
    
    // MÉTODOS
    
    public void mostrarDatos () {
        
        System.out.println (" Nombre: "+nombre+".");
        System.out.println (" Numero: "+ID+".");
        System.out.println (" Tiempo: "+tiempo+".");
    }
    
    public float getTiempo () {
        
        return tiempo;
        
    }
}
