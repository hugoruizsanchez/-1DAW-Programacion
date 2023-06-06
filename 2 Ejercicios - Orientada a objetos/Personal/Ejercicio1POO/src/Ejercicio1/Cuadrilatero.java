/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

public class Cuadrilatero {

    // ATRIBUTOS -> Cada uno de los lados del cuadrilátero. 
    
    private float lado1;
    private float lado2; 
    
    // CONSTRUCTORES -> Procesamiento de los objetos. 
    
    // Constructor para un rectángulo: se necesitan parametrizar ambos lados. 
    
    public Cuadrilatero (float lado1, float lado2) {
        
        this.lado1 = lado1; 
        this.lado2 = lado2; 
        
    }
    
    // Constructor para un cuadrado: solo se necesita parametrizar un lado. 
    
    public Cuadrilatero (float lado1) {
        
        this.lado1 = lado1 = this.lado2 = lado1;
        
        /* El lado 1 (de los atributos) es igual al lado 2 (de los atributos) 
        que es igual al lado1 (especificaod en los parámetros. */
   
    }
    
    // MÉTODOS -> Operaciones con los objetos. 
    
    public float getPerimetro () {
    
       return lado1*2+lado2*2;
        
    }
    
    public float getArea () {
        
        return lado1*lado2; 
        
    }
    
}
