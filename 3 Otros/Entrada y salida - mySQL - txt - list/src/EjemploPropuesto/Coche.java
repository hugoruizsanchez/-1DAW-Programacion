package EjemploPropuesto;

import java.io.Serializable;

public class Coche implements Serializable {

	
	// ATRIBUTOS

	private String Matricula;
	private String Modelo;
	private String Color;
	private int year;
	
	// CONSTRUCTOR

	public Coche() {
		
	};
	
	// MÉTODOS: GET Y SET 
	
	public Coche(String matricula, String modelo, String color, int year) {
		super();
		Matricula = matricula;
		Modelo = modelo;
		Color = color;
		this.year = year;

	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// MÉTODOS
	
	// Sobreescritura del método equals para el objeto
	public boolean equals(String mat) {
		if (this.Matricula== mat) return true;
		else return false;
	}
   
	// Sobreescitura del método toString
	public String toString() {
		String str="";
		str = "{Matricula: "+ this.Matricula + ",Modelo: "+this.Modelo + ",Color: "+this.Color + ",Año: "+this.year+"}";
		return str;
	}
	
} // Coche