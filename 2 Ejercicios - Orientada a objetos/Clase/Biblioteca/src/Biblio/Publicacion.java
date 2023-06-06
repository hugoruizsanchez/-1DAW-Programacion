package Biblio;

import java.util.Scanner;

public class Publicacion {
	
// DESCRIPCIÓN DE LA CLASE 
	
	/*
	 * SUPERCLASE DE -> LIBRO, PERIÓDICO. 
	 */
	
//	ATRIBUTOS
	
	public int numeroDePaginas;
	public float precio; 
	public boolean existe; 
	
//	MÉTODOS CONSTRUCTORES
	
	public Publicacion (int numeroDePaginas, float precio) {
		
		this.numeroDePaginas = numeroDePaginas; 
		this.precio = precio; 
		
	}

//	MÉTODOS: GETTERS Y SETTERS. 
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
//	MÉTODOS
	
	
	


}
