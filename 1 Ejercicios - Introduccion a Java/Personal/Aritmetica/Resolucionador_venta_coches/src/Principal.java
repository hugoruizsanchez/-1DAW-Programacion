import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {

		// Un concesionario paga 1000$ a sus empleados, más una comision de 150$ por cada vehiculo y un 5% del valor de lo vendido. Calcula el salario mensual a partir de los datos.
		
		float valorvehiculo, salario; 
		int vehiculos;
		System.out.println ("| Calculadora salarial, 150% + 5% del valor si existe comisión | \n Ingrese los vehículos que vendió el trabajador:");
		
		Scanner entrada = new Scanner (System.in);
		
		vehiculos = entrada.nextInt(); 
		
		System.out.println ("Ingrese el valor de los vehículos que ha vendido el trabajador.");
		
		
		valorvehiculo = entrada.nextFloat();
		
		salario = (float) (1000+(vehiculos*150)+(valorvehiculo*0.05));
		
		System.out.println ("\n El trabajador ganará este mes un salario de: " +salario +" $.");
		
		
		
	}

}
