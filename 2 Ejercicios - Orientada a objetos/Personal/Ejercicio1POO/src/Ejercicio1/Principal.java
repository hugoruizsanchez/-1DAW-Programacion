
package Ejercicio1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // Main, aquí se introducirán las instrucciones. 
        
        Cuadrilatero c1; // Creamos un objeto cuadrilátero- aún no  inicializado
        float lado1, lado2;
        
        lado1 = Float.parseFloat (JOptionPane.showInputDialog ("Escriba el lado1:"));
        lado2 = Float.parseFloat (JOptionPane.showInputDialog ("Escriba el lado2:"));
        
        
        if (lado1 == lado2) {
            
            c1 = new Cuadrilatero(lado1);
            
        } else {
            
            c1 = new Cuadrilatero (lado1,lado2);
        }
        
        System.out.println ("El perímetro es "+c1.getPerimetro());
        System.out.println ("El área es "+c1.getArea());
    }
    
}
