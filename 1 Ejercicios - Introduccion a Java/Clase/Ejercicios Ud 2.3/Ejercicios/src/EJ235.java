import java.util.Scanner;

public class EJ235 {

	public static void main(String[] args) {

	
		precioPaquete ();
		

	}
	
	public static void precioPaquete () { 
		
		// TABLA	
		
		System.out.println ("Tabla de precios asignados a cada país:");
		
int ancho = 15; int alto = 13;
	

		// OPERADOR
		
		Scanner entrada = new Scanner (System.in);
		float peso =0; 
		float precio =0; 
		String pais; 
		
		System.out.print ("\nIntroduzca el peso de su paquete (KG): "); peso = entrada.nextFloat();
		System.out.print ("Indique el país al que corresponde su paquete: "); 	pais = entrada.next();
		
if (pais.equals("PORTUGAL")) {
	precio = (float) 0.25;		
		}else if (pais.equals ("FRANCIA")) {
			precio = (float) 0.37;
		}else if (pais.equals ("ITALIA")) {
			precio = (float) 0.40;
		}else if (pais.equals ("REINO UNIDO")) {
			precio = (float) 0.45;
		}else if (pais.equals ("ALEMANIA")) {
			precio = (float) 0.58;
		}else if (pais.equals ("GRECIA")) {
			precio = (float) 0.58;
		}else if (pais.equals ("CANADÁ")) {
			precio = (float) 1.23;
		}else if (pais.equals ("ESTADOS UNIDOS")) {
			precio = (float) 1.33;
		}else if (pais.equals ("MEXICO")) {
			precio = (float) 1.45;
		}else if (pais.equals ("COLOMBIA")) {
			precio = (float) 2.03;
		}else if (pais.equals ("CHILE")) {
			precio = (float) 3.01;
		}else if (pais.equals ("ARGENTINA")) {
			precio = (float) 2.99;
		}
	
if (precio != 0) {
	System.out.println ("El coste para el paquete es de "+precio*peso+" €.");
} else {
	System.out.println ("ERROR: No se ha introducido un país correcto.");
}

	
		
		
		
		
	}

}
			