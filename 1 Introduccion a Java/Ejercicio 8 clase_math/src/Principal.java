public class Principal {

	public static void main(String[] args) {
       // RAÍCES
		double raiz = Math.sqrt(9); //Las raíces son INCOMPATIBLES con otra variable que no sea DOUBLE. 
				System.out.println ("Raíz guardada en la variable double: "+raiz); // Imprimimos en pantalla el resultado de la raíz, guardada en la variable 
		
		// ¿Cómo guardar la raíz en una variable que no sea DOUBLE? 
		
		int raiz_rebelde =(int)Math.sqrt(9);// De este modo realizamos la conversión.
		System.out.println ("Raíz guardada en la variable int: "+raiz_rebelde);
		
		// POTENCIAS
		
		
		double base =5, exponente =3;
		
		double potencia = Math.pow(base, exponente); // Elevamos la potencia a las variables enunciadas anteriormente
		int potencia_rebelde = (int)Math.pow(base, exponente); //Las potencias son INCOMPATIBLES con otra variable que no sea DOUBLE, por eso podemos realizar la conversión
		System.out.println ("Potencia guardada en la variable double: "+potencia); 
		System.out.println ("Potencia guardada en la variable int: "+potencia_rebelde);
		
		// REDONDEAR UN NUMERO - para 
		
double decimal = 3.349;
                                             // El redondeo de DOUBLE va con LONG, por la naturaleza de los números que procesa la variable double.
long redondeo = Math.round(decimal); 

float decimal2 =3.34f;                       // El redondeo FLOAT va con INT, por la naturaleza de los números que procesa la variable int. 

int redondeo2 = Math.round(decimal2);

System.out.println ("Decimal guardado en double y redondeado en long: "+redondeo); 
System.out.println ("Decimal guardado en float y redondeado en int: "+redondeo2); 

 // NÚMERO ALEATORIO 

double aleatorio = Math.random();

System.out.println ("Decimal aleatorio "+aleatorio); 



	}

}
