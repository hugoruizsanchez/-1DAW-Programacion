package set1_2;

import java.util.Scanner;


public class Periodico extends Publicacion {
	
	
	// DESCRIPCIÓN DE LA CLASE 
		
		/*
		 * SUBCLASE DE -> PUBLICACION
		 */
		
//		ATRIBUTOS
		
		private String nombre; 
		private String fecha;
		
		
//		MÉTODO CONSTRUCTOR
		
		public Periodico (int numeroDePaginas, float precio, String nombre, String fecha) {
			
			super (numeroDePaginas, precio);
			
			this.nombre = nombre; 
			this.fecha = fecha; 
			
		}
		
		
//		MÉTODOS
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
		
		

	}