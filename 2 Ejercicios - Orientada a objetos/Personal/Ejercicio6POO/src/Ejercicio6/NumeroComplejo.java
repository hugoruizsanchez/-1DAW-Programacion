
package Ejercicio6;





public class NumeroComplejo {
    
    // ATRIBUTOS
    
    private double a; // Parte real.
    private double b; // Parte imaginaria. 
    
    // CONSTRUCTORES
    
    public NumeroComplejo (double a, double b) {
        
        this.a= a;
        this.b = b; 
    }

    
    // GETTERS
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // MÉTODOS
    
    
    /*

Cálculos con números complejos: los números complejos se componen de una parte
real y otra imaginaria. 

numero1 = (3,4)
numero2 = (2,5)
 
La suma es: (3+2)+(4+5)

Numero complejo: (5,9)


*/
    public NumeroComplejo calcularSuma (NumeroComplejo c) {
        
        /* Para sumar números complejos creamos una función que nos devolverá
        otro número complejo, para lo cual creamos una public NumeroComplejo + nombre + parametros
        */
        // la variable suma guarda un número complejo nuevo, en el que se suma a "A" el "C.A" y al "B" el "C.B"
        NumeroComplejo suma = new NumeroComplejo (a+c.getA(),b+c.getB());
        return suma;
    }
    
    /*
    
    numero1 = (3,4)
    numero2 (2,5)
    
    mult = (3*2 - 4*5), (3*5+4*2)
    
    
    */
    
    
    public NumeroComplejo calcularProducto (NumeroComplejo c) {
        
        NumeroComplejo multiplicacion = new NumeroComplejo (a*c.getA()-b*c.getB(), a*c.getB()+b*c.getA());
        return multiplicacion;
        
    }
    
    /*
    
    numero1 = (3,5)
    numero2 (2,5) 
    
    2 y 3 ¿iguales? 
    5 y 5 ¿iguales? 
    
    -> FALSE
    
    */
    
    public boolean comprobarIgualdad (NumeroComplejo c) {
        
        boolean igual = false;
        
        if (a==c.getA()&&b==c.getB()) {
            igual = true;
        }
        
        return igual;
    }
    
      /*
    
    COMPLEJ O * ENTERO. 
    
    numero1 = (3,5)* 4
    */
    
    
    public NumeroComplejo calcularProductoEntero (int e) {
        
        
        NumeroComplejo multiplicacion = new NumeroComplejo (a*e,b*e);
        
        return multiplicacion;
        
    }
}
