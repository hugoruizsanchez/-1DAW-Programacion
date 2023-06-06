package set1;

import java.util.*; // -> Importar todas las herramientas de java.util (incluido el ArrayList)



public class claseArrayList {
	
	
/*
 generaArrayListInt: Genera un arrayList de tamaño n con números aleatorios cuyo
intervalo (mínimo y máximo) se indica como parámetro
*/
	
	
	public ArrayList generaArrayListInt (int minimo, int maximo, int limite) {
		
		ArrayList <Integer> listaEnteros = new ArrayList <Integer> ();
		int aleatorio =0; 
		
		for (int i=0; i<limite; i++) {
			
			aleatorio = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
			listaEnteros.add(aleatorio);
			
		}
		
		return listaEnteros;
			
	}
	
/*
 * minimoArrayListInt: Devuelve el mínimo del arrayList que se pasa como parámetro.
 */

	public int minimoArrayListInt (ArrayList lista) {
		
		int minimo = 2147483647;
		
		for (int i=0; i<lista.size(); i++) {
			
			if ( (int) lista.get(i)<minimo ) {
				minimo = (int) lista.get(i);
			}
			
		}
		
		return minimo;
		
	}
	
/*	
	maximoArrayListInt: Devuelve el máximo del arrayList que se pasa como parámetro.
*/
	
	public int maximoArrayListInt (ArrayList lista) {
		
		int maximo = -2147483648;
		
		for (int i=0; i<lista.size(); i++) {
			
			if ((int) lista.get(i)>maximo) {
				maximo = (int) lista.get(i);
			}	
			
		}
		
		return maximo; 
	}
	
/*
	mediaArrayListInt: Devuelve la media del arrayList que se pasa como parámetro
*/
	
	public float mediaArrayListInt (ArrayList lista) {
		
		int suma =0;
		
		for (int i=0; i<lista.size(); i++) {
			suma = (int) lista.get(i) + suma; 
		}
		
		return (float) suma/lista.size();
		
	}
	
/*
posicionEnArrayList: Busca un número en un arrayList y devuelve la posición (el
índice) en la que se encuentra.
 */
	
	public int posicionEnArrayList (ArrayList lista, int busqueda) {
		
		boolean finalizado = false;
		int contador = 0;
		int resultado =-1;
		
		if (lista.contains(busqueda)) {
			
			while (finalizado == false) {
				
				if ((int)lista.get(contador)==busqueda) {
					
					resultado = contador;
					finalizado = true;
									
				}
				contador++;
			}
			
		}
		else {
			System.out.println ("ERROR: NO contiene el elemento sugerido.");
		}
		
		return resultado; 
		
		/*
		 * PUEDE USARSE la función indexOF
		 */
		
	}
	
// volteaArrayListInt: Le da la vuelta a un arrayList.
	
	public ArrayList volteaArrayListInt (ArrayList lista) {
		
		Collections.reverse(lista);
		
		return lista;
	}
	
// Tipos de objeto en arraylist: cuenta cuantos objetos hay de un arraylist. 
	

	
	
// PRINCIPAL: 

	public static void main(String[] args) {
		
		claseArrayList configuradorA = new claseArrayList ();
		
		ArrayList <Integer> listaEnteros = new ArrayList <Integer> ();
		
		// ASIGNAR VALORES AL ARRAY -> 15 VALORES EN TOTAL
			
		listaEnteros = configuradorA.generaArrayListInt (0, 50, 15);
		
		// MOSTRAR EL ARRAY
		
		System.out.println ("Array con todos los elementos:\n");
		
		for (int i=0; i<listaEnteros.size(); i++) {
			System.out.println ("|-> "+listaEnteros.get(i));
		}
		
		// SABER MINIMO: 
		
		System.out.println ("\nEl número más pequeño de la lista es: "+configuradorA.minimoArrayListInt(listaEnteros));
		
		// SABER MÁXIMO:
		
		System.out.println ("\nEl número más grande de la lista es: "+configuradorA.maximoArrayListInt(listaEnteros));
		
		// SABER LA MEDIA: 
		
		System.out.println ("\nLa media de la lista es: "+configuradorA.mediaArrayListInt(listaEnteros));

		// SABER SI HAY UN NUMERO
		
		System.out.println ("\nEl numero solicitado se encuentra en la posición: "+configuradorA.posicionEnArrayList(listaEnteros, 5));
		
		// REVERTIDO:
		
		System.out.println ("\nLista invertida: ");
		
		configuradorA.volteaArrayListInt(listaEnteros);
		
		for (int i=0; i<listaEnteros.size(); i++) {
			System.out.println ("|-> "+listaEnteros.get(i));
		}
		
		
	}

}
