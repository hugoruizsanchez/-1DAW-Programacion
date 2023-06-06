package Fracciones;

public class Fraccion {

	// ATRIBUTOS
	public String nombre;
	public int numerador; 
	public int denominador; 
	
	
	// CONSTRUCTORES
	
	public Fraccion ( int numerador, int denominador) {
        this.nombre=nombre;
		this.numerador= numerador;
		this.denominador=denominador; 
		
	}
	
	// MÉTODOS
	
	//Multiplicacion
    public void multiplicafraccion (Fraccion nombre) {
	
    	int resultado_numerador;
    	int resultado_denominador; 
    	resultado_numerador = this.numerador * nombre.numerador;
    	resultado_denominador = this.denominador*nombre.denominador;
    	
    	System.out.println (resultado_numerador+"/"+resultado_denominador);
    	
	}
    
    //Division 
    
    public void division (Fraccion nombre) {
    	
    	int resultado_numerador;
    	int resultado_denominador;
    	resultado_numerador = this.numerador*nombre.denominador;
    	resultado_denominador = this.denominador*nombre.numerador;
    	
    	System.out.println (resultado_numerador+"/"+resultado_denominador);
    	
    }
    
    public void suma (Fraccion nombre) {
    	
    	int resultado_numerador=0;
    	int resultado_denominador=0; 
    	
    	if (nombre.denominador == this.denominador) {
    		
    		resultado_numerador = nombre.numerador+this.numerador;
    		resultado_denominador = nombre.numerador;
    	}
    	else {
    		
    		resultado_numerador = (this.numerador*nombre.denominador+this.denominador*nombre.numerador);
    		resultado_denominador = nombre.denominador*this.denominador;    		
    		
    	}

    	System.out.println (resultado_numerador+"/"+resultado_denominador);
    	
       }
	
    public void resta (Fraccion nombre) {
    	
    	int resultado_numerador=0;
    	int resultado_denominador=0; 
    	
    	if (nombre.denominador == this.denominador) {
    		
    		resultado_numerador = nombre.numerador+this.numerador;
    		resultado_denominador = nombre.numerador;
    	}
    	else {
    		
    		resultado_numerador = (this.numerador*nombre.denominador-this.denominador*nombre.numerador);
    		resultado_denominador = nombre.denominador*this.denominador;    		
    		
    	}

    	System.out.println (resultado_numerador+"/"+resultado_denominador);
    	
    }
	
	
	
	
	
	
	
	
	
}
