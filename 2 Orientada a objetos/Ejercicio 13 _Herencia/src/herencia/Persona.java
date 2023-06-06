package herencia;

/*
La HERENCIA es una característica de las clases en java, que permite acoplar
los atributos y métodos de una "superclase" de java a otra "subclase".

Así, creamos una superclase "Persona", de la cual crearemos una subclase 
"Estudiante" 

La persona contará con atributos básicos: 

- Nombre
- Apellidos
- Edad

Y con unos métodos básicos: 

- Constructor (nombre, apellidos, edad)
- Getters. 


Pero al crear la subclase estudiante, este tendrá los siguientes atributos 


(TODOS los atributos de "Persona") 
ADEMÁS DE: 
- codigoEstudiante
notaFinal 

Y los siguientes métodos

- Constructor (nombre, apellidos, edad, codigoEstudiante, notaFinal)
SE LE AÑADE EL CONSTRUCTOR DE SU SUPERCLASE + SUS ATRIBUTOS 

- Todos los atributos de PERSONA (Getters) 

- mostrardatos. 


*/

public class Persona {
    
// ATRIBUTOS
    
private String nombre; 
private String apellidos; 
private int edad; 
    
// MÉTODO CONSTRUCTOR
    
public Persona (String nombre, String apellidos, int edad) {
    
    this.nombre = nombre; 
    this.apellidos = apellidos; 
    this.edad = edad; 
    
}
 
// MÉTODOS

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }


    
    

    
}
