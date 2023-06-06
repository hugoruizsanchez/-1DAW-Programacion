
package pkg1.arraylistjava;

import java.util.*;


public class claseEjemplo {
      
    ////////////// DECLARACIÓN DE LA CLASE DE EJEMPLO QUE SE UTILIZARÁ
    
    // ATRIBUTOS -> cuenta con dos variables de ejemplo
    
    private int ejemplo_entero; 
    private String ejemplo_texto; 
    
    // MÉTODOS - > método de ejemplo, imprimir valores
    
    public void imprimeDatos () {
        System.out.println (ejemplo_entero + " | "+ejemplo_texto);
    }
    
    // CONSTRUCTOR -> constructor que necesita un entero y un string
    
    public claseEjemplo (int ejemplo, String ejemplo2) {        
        this.ejemplo_entero = ejemplo; 
        this.ejemplo_texto = ejemplo2;
        
    }
    
    ////////////// PRINCIPAL
    
    public static void main(String[] args) {
       
        // PRUEBA CON UN ARRAY SENCILLO
        
        System.out.println ("------- PRUEBA CON UN ARRAY SENCILLO -------");
        
        claseEjemplo arrayClaseEjemplo [] = new claseEjemplo [3];
        arrayClaseEjemplo [0] = new claseEjemplo (12,"Hola");
        arrayClaseEjemplo [1] = new claseEjemplo (45,"Mundo");
        arrayClaseEjemplo [2] = new claseEjemplo (71,"Que tal");
        
        // RECORRER ARRAY
        
        for (int i =0; i<arrayClaseEjemplo.length; i++) {
            arrayClaseEjemplo[i].imprimeDatos();
        }
        
        //////////////////////////////////////////
        
        // El arraylist permitirá una mayor versatilidad en el uso de la memoria con respecto a los arrays de java. 
        // Debe importarse con import java.util.*;
        
        // > En la declaración del ArrayList introducimos entre "<>" la clase o variable de la que queremos hacer el array
        // Asimismo, declaramos el nombre del array en "listaClaseEjemplo" y procedemos con el new. Los parámetros que se han 
        // de indicar en el "()" son del propio ArrayList, este constructor POR DEFECTO creará 10 elementos, es decir, reservará 
        // memoria para 10 elementos.
        // Cuando se agrega un elemento más, se está creando una copia del arraylist con 11 elementos, e introduciendo el nuevo.
        // Esto supone un consumo de recursos muy elevado. Es una buena práctica, por tanto, "asegurar" -ensure - la capacidad
        
        
        System.out.println ("------- PRUEBA CON UN ARRAYLIST EN ITERADOR CLASICO -------");
        
        /// >>>>>>>>>>>>>>> CREACIÓN DE UN ARRAYLIST
        
        ArrayList <claseEjemplo> listaClaseEjemplo = new ArrayList<claseEjemplo>();
        
        /// >>>>>>>>>>>>>>> ASIGNACIÓN DE ESPACIO EN UN ARRAYLIST
        
        listaClaseEjemplo.ensureCapacity(20);
        
        /// >>>>>>>>>>>>>>> INSERTAR OBJETOS EN UN ARRAYLIST
        // Puede crearse el objeto nuevo directamente entre los paréntesis. 
        
        listaClaseEjemplo.add(new claseEjemplo (99, "¡Adiós!")); 
        listaClaseEjemplo.add(new claseEjemplo (23, "¡Mundo!"));
        listaClaseEjemplo.add(new claseEjemplo (45, "Jajajaja"));
        listaClaseEjemplo.add(new claseEjemplo (12, "Jejejeje"));
        listaClaseEjemplo.add(new claseEjemplo (93, "Jijijiji"));
        listaClaseEjemplo.add(new claseEjemplo (99, "¡Adiós!")); 
        listaClaseEjemplo.add(new claseEjemplo (23, "¡Mundo!"));
        listaClaseEjemplo.add(new claseEjemplo (45, "Jajajaja"));
        listaClaseEjemplo.add(new claseEjemplo (12, "Jejejeje"));
        listaClaseEjemplo.add(new claseEjemplo (93, "Jijijiji"));
        listaClaseEjemplo.add(new claseEjemplo (99, "¡Adiós!"));
        
        // >>>>>>>>>>>>>>> INSERTAR (SET) OBJETOS EN POSICIONES DETERMINADAS DE UN ARRAYLIST
        // Introducir el index y el objeto. 
        
        listaClaseEjemplo.set(3, new claseEjemplo (992, "EL ACOPLADO"));
        
        // >>>>>>>>>>>>>>> TOMAR (GET) OBJETOS DE POSICIONES DETERMINADAS EN  UN ARRAYLIST
        // Introducir el index y el objeto. 
        
        System.out.println ("Le advierto, caballero, que este arhivo se ha ¡colado! de la lista: ");
        listaClaseEjemplo.get(8).imprimeDatos();
        
        /// >>>>>>>>>>>>>>> OPTIMIZAR RECURSOS EN ARRAYLIST
        
        listaClaseEjemplo.trimToSize(); //Este array limpia la memoria ocupada por las copias en el espacio creado por defecto:
        // Si nuestra capaciad predefinida es de 15 y solo se han guardado 6 elementos, entonces el programa elimina los 9 no ocupados
    
        /// >>>>>>>>>>>>>>> BUCLE SENCILLO
        
        System.out.println ("Este ArrayList tiene: "+listaClaseEjemplo.size()+" elementos\n");
        
           for (int i =0; i<listaClaseEjemplo.size(); i++) {
        
               listaClaseEjemplo.get(i).imprimeDatos();           
            }
        
        /// >>>>>>>>>>>>>>> BUCLE CON ITERADOR
           
             System.out.println ("------- PRUEBA CON UN ARRAYLIST EN ITERADOR SENCILLO  -------");
             
           for (claseEjemplo ce: listaClaseEjemplo) {
               ce.imprimeDatos();
           }
        
        /// >>>>>>>>>>>>>>> CONVERSIÓN DE ARRAYLIST A ARRAY
           
           claseEjemplo arrayClaseEjemplo2 [] = new claseEjemplo [listaClaseEjemplo.size()];
           
           listaClaseEjemplo.toArray(arrayClaseEjemplo2);
        
        
        
        
    }
    
}
