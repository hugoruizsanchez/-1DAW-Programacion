
package metodosabstractos;

/*
SER VIVO (a)
alimentarse()
|              |
V              V
PLANTA(na)   ANIMAL(a)
               |
               V
    HERBÍBORO(na) CARNÍVORO (na)

(a) Abstracta
(na) No abstracta. 

Una función abstracta es una superclase que no se puede instanciar, y sirve para
definir de forma relativa o establecer un bosquejo. 


 */



public class Principal {
    
    public static void main(String[] args) {
       
        Planta pla1 = new Planta ();
        AnimalCarnivoro carn1 = new AnimalCarnivoro ();
        AnimalHerbivoro herb1 = new AnimalHerbivoro ();
        
        pla1.alimentarse();
        herb1.alimentarse();
        carn1.alimentarse();
        
        
        
        
    }
    
    
}
