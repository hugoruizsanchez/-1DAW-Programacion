package EjemploPropuesto;
import static gestionArchivos.ManejoArchivos.*;

import java.io.*;
import java.util.*;



public class DAOCoche implements DAO{
	
	// APLICACIÓN DE INTERFAZ "DAO" para COCHES (A la que podriamos denominar "garaje" y contiene un conjunto de coches)
	
	// ATRIBUTOS
	
	private ArrayList<Coche> misCoches = new ArrayList<Coche>();
	File archivo = new File ("guardadoMisCoches.dat");

	
	// MÉTODO CONSTRUCTOR
	
	public DAOCoche() {

	}

	// MÉTODOS DE FUNCIÓN
	
	//Añadir coches. 
    public void addCoche(Coche c) {
    	misCoches.add(c);	// Añado el coche al arrayList Existente

    }
    
    //Asignar los valores de un coche (_new) a otro (_old) 
    public void updateCoche(Coche _old, Coche _new) {
    	// Decidimos no cambiar la matrícula
    	_old.setModelo(_new.getModelo());
    	_old.setColor(_new.getColor());
    	_old.setYear(_new.getYear());
    }
    
    // Eliminar coche. 
    public boolean deleteCoche(Coche c) { 	
    	Coche _t;
    	 _t = misCoches.remove(misCoches.indexOf(c));
    	 if (_t != null) return true;
    	 else			 return false;
    }
    
    // Encontrar coches en base a la matrícula. 
    public Coche findCoche(String matricula) {
    	
    	for (Coche c: misCoches) {   		
    		if (c.getMatricula().equals(matricula)) return c;
    	}
    	return null;
    }
    
   
    
    public void guardar () {

    	escribirArchivoList ("misCoches.dat", misCoches);
    	
    }
    
    public void cargar () {
    	
    	
    	misCoches = leerArchivoList ("misCoches.dat");
    	
    }
    
   
    
    // MÉTODO GET 
    
    public ArrayList<Coche> getCoches() {
    	
    	return misCoches;
    }
}

