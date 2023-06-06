package Ejercicio2;


public class Tablero {
    
    // ATRIBUTOS
    
    private int x;
    private int y;
    
    // CONSTRUCTORES
    
    public Tablero (int x, int y) {
        
        this.x= x;
        this.y = y;
    }

    
    // MÉTODOS
    
    public void moverArriba (int incremento) {
        
        y = y+incremento;
        
    }
    
    public void moverAbajo (int incremento) {
        
        y = y-incremento;
        
    }
    
    public void moverDerecha (int incremento) {
        
        x = x+incremento;
        
    }
    
    public void moverIzquierda (int incremento) {
        
        x = x-incremento;
    }
    
    public int getX () {
      
        return x; 
    }
    
    public int getY () {
        
        return y; 
    }
}