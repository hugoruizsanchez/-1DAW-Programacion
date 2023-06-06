package contabilidad;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
	// 	System.out.println ("TÉC.DES"+" ".repeat(1+5)+": "+ this.getNombre() + " | " + this.getNif() + " | " + resultado + " | " + horasExtra );
 Empleado arrayEmpleados [] = new Empleado [5] ;
 

 arrayEmpleados [0] =  new Director ("Perez, Jorge", "51200201X", 60000, true);
 arrayEmpleados [1] =  new TecnicoSoporte ("Ramírez, Luis", "29300301M", 30000, 1256.34 );
 arrayEmpleados [2] =  new TecnicoSoporte ("Poveda, Alfredo", "29300301M", 30000, 974.28 );
 arrayEmpleados [3] =  new TecnicoDesarrollo ("Sanz, Carlos", "29300301M", 34000, 4 );
 arrayEmpleados [4] =  new TecnicoDesarrollo ("Sánchez, Jorge", "29300301M", 33500, 6 );
 
 for (int i=0; i<5; i++) {
	 
	 System.out.println (arrayEmpleados [i].getNombre() + " | " + arrayEmpleados [i].getNif() + " | " + arrayEmpleados[i].calculaNomina() + " | " );
	 
 }
		 

	}

}
