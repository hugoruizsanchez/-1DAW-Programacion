
package Ejercicio5;


public class Isosceles {
    
    // ATRIBUTOS
    
    private float a; // Lados iguales: el triángulo se compone de dos lados "a"
    private float b; // Lado dispar: el triángulo se compone de un lado "b".
    
    // CONSTRUCTOR
    
    public Isosceles (float a, float b) {
        
        this.a = a;
        this.b = b;
       
    }
    
    // MÉTODOS
    
    public double calculoArea () {
        
       return (b*Math.sqrt ((a*a) - ((b*b)/4) ))/2;
        
    }
    
    public double calculoPerimetro () {
        
        return b+a*2;
        
    }
    
   // MÉTODOS DE CONSULTA
    
    public void mostrarDatos () {
        
        System.out.println ("Lados iguales (A): "+a+".");
        System.out.println ("Lado dispar (B): "+b+".");
        System.out.println ("Área: "+calculoArea ()+".");
        System.out.println ("Perimetro: "+calculoPerimetro ()+".");
        
        
    }
    
    public float getA () {
        
        return a; 
        
    }
    
    public float getB () {
        
        return b; 
        
    }
    
    
    
    
    
}


