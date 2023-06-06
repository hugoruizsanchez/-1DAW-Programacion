package cositas;

public class Coche {
	
//	ATRIBUTOS
	
	private String Matricula; 
	private String Modelo;
	private String Color; 
	private int year;
	
//	CONSTRUCTOR 
	
	public Coche(String matricula, String modelo, String color, int year) {
		Matricula = matricula;
		Modelo = modelo;
		Color = color;
		this.year = year;
	}

//	MÉTODOS
	
	
//	METODOS: GET Y SET 
	
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
	
	

}
