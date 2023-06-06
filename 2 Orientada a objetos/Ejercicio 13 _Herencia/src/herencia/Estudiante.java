package herencia;

// La palabra EXTENDS está reservada, sirve para "declarar heredero" a "ESTUDIANTE"

public class Estudiante extends Persona {
    
    // ATRIBUTOS
    
    private int codigoEstudiante; 
    private float notaFinal; 
    
    
    // MÉTODO CONSTRUCTOR: Debemos agregar PRIMERAMENTE los atributos que contiene el constructor PERSONA (Superclase)
    
    public Estudiante (String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        
        super (nombre, apellidos, edad); // El nombre, el apellido y la edad YA están inicializados....
        // luego con "super" notificamos al compilador que se remita a la superclase para heredarlos.
        
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }
    
    // MÉTODOS 
    
    // * -> Los métodos de "Persona" ya han sido heredados, sin necesidad de importar nada. 
    
    public void mostrarDatos () {
        System.out.println (
                "Nombre: "+getNombre()+
                "\nApellidos: "+getApellidos ()+
                "\nEdad: " +getEdad ()+
                "\nCódigo de Estudiante: "+codigoEstudiante +
                "\nNota final: "+notaFinal
                 
        ); // Podemos usar los getters (pues es un dato protegido) o renombrar los atributos a "protected"
        
    }
    
    
}
