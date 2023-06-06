
public class Principal {

	public static void main(String[] args) {


		/* Un arreglo o array es una estructura de datos que nos permite almacenar un conjunto de información de un mismo tipo. El tamaño de los
		 * arrays se declara en un primer momento, y no puede cambiar luego durante la ejecución del programa. 
		 * 
		 * 
		 * Durante este primer cursillo introductorio, hemos estudiado las variables: en ellas - por ejemplo de tipo int - podíamos almacenar un 
		 * solo dato de tipo entero; pero un array puede almacenar posiciones contiguas de memoria en las que todos los datos almacenados son enteros.
		 * 
		 * - Arrays unidimensionales: Tipo_de_variable [] Nombre_del_array = new Tipo_de_variable [dimension].
		 * 
		 * int [] edad = new int [4] -> Almacenamos 4 datos de tipo entero. (0,1,2,3) - Cuatro espacios. 
		 * float [] estatura = new float [3] -> Almacenamos 3 datos de tipo float.
		 * char [] sexo = new char [2] -> Almacenamos 2 datos de tipo caracter.
		 * boolean [] estado = new boolean [4] -> Almacenamos 4 datos de tipo estado. 
		 * 
		 * - ¿Cómo dar valores a un arreglo? 
		 * 
		 * PRIMER MÉTODO
		 * 
		 * int [] numeros = new int [3]; 	-> Sabemos que si son 3 valores, se registran como (0,1,2)
		 * 
		 * numeros [0]	= 5;                 -> En la posición 0, asignamos al número el valor de 5.
		 * numeros [1]	= 7;                 -> En la posición 1, asignamos al número el valor de 7.
		 * numeros [2]  = 8;                 -> En la posición 2, asignamos al número el valor de 8.
		 * 
		 * SEGUNDO MÉTODO
		 * 
		 * int [] numeros {5,7,8};
		 */
		
		int [] numeros = new int [3]; // Asignamos el valor del arreglo, tres datos (0,1,2) de variable entera. 
		
		 numeros [0]= 5; // Hacemos lo mencionado en el bloque teórico, asignamos un número a cada dato.      
		 numeros [1]= 7;              
		 numeros [2]= 8;   
		
		// System.out.println (numeros[2]); // Para imprimirlo, podemos utilizar el System.out.println, aunque lo mejor es usar bucles for.
		 
		System.out.println ("Estos son los números escritos manualmente:");
		
		for (int repetidor = 0; repetidor<3 ; repetidor++ ) {  // * Si ponemos <=, salta un error en la main, quizá porque estamos haciendo que se propase el compilador
			
			/* El bucle "for" con esta configuración lo utilizamos para repetir cuantas veces queramos un procedimiento, así, se ejecuta desde que 
			 * el repetidor está en 0 hasta que llega al límite cuantas veces hayamos querido. 
			 * 
			 * IMPORTANTE: en los arrays, el repetidor debe comenzar desde la posición 0, para que abarque todos los datos. Si uno queda sin tratar,
			 * NO FUNCIONARÁ */
			
			System.out.println(numeros[repetidor]); // Colocamos el repetidor en la posición de la [dimension] para que cambie la ubicación del dato.
			
		}
		
		System.out.println ("Estos son los números escritos con una sola sentencia:");
		 
		int [] numeros2 = {7,3,4,8,9,1,0};
		
		for (int repetidor = 0; repetidor<7 ; repetidor++ ) {
			
			System.out.println(numeros2[repetidor]);
		}
		
		
	}

}
