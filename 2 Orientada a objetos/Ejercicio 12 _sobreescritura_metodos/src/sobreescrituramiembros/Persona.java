
package sobreescrituramiembros;

public class Persona extends Animal {
    
    // Esto es un "Override": estamos sobreescribiendo un método que ya existía para "Persona"
    // ... adaptándolo a nuestras necesidades.
    
    @Override
    public void comer () {
        System.out.println ("Estoy comiendo sentado y con cubiertos.");
    }
    
    
}
